import os
import sys
import subprocess
from openai import OpenAI

def main(api_key, branch_name):
    if not api_key:
        print("Error: OpenAI API key is missing.")
        sys.exit(1)

    client = OpenAI(api_key=api_key)

    # Read the new task description
    try:
        with open("tasks/new_task.md", "r") as file:
            task_description = file.read()
    except FileNotFoundError:
        print("Error: new_task.md file not found.")
        sys.exit(1)

    # Read the original task description
    try:
        with open("tasks/original_task.md", "r") as file:
            original_task_description = file.read()
    except FileNotFoundError:
        print("Error: original_task.md file not found.")
        sys.exit(1)

    # Read the original code template
    original_template = """
    class Indamon {
        private String name;
        private int hp;
        private int attack;
        private int defense;
        private boolean fainted;
        
        public Indamon(String name, int hp, int attack, int defense) {
            this.name = name;
            this.hp = hp;
            this.attack = attack;
            this.defense = defense;
            fainted = false;
        }
        
        // getters
        public String getName() { return name; }
        public int getHp() { return hp; }
        public int getAttack() { return attack; }
        public int getDefense() { return defense; }
        public boolean getFainted() { return fainted; }

        // setters
        public void setName(String name) { this.name = name; }
        public void setHp(int hp) { this.hp = hp; }
        public void setAttack(int attack) { this.attack = attack; }
        public void setDefense(int defense) { this.defense = defense; }
        public void setFainted(boolean fainted) { this.fainted = fainted;}

        // attack method
        public void attackOponnent(Indamon target) {
            int damage = attack / target.getDefense();
            target.setHp(target.getHp() - damage);
            if (target.getHp() <= 0) {
                target.setFainted(true);
            }
        }

        // print info method
        public void printInfo() {
            System.out.println("Name: " + name);
            System.out.println("HP: " + hp);
            System.out.println("Attack: " + attack);
            System.out.println("Defense: " + defense);
            System.out.println("Fainted: " + fainted);
        }   
        
        public static void main(String[] args) {
            // create a new "Indamon" object
            Indamon glassey = new Indamon("Glassey", 10, 5, 5);
            Indamon siberov = new Indamon("Siberov", 10, 5, 5);
            // print out the object's info
            glassey.printInfo();
            siberov.printInfo();
            // call the attack method
            glassey.attack(siberov);
            siberov.printInfo();
        } // end main method
    }
    """

    # Required imports
    required_imports = """
    import org.junit.Before;
    import org.junit.Test;
    import static org.junit.Assert.*;
    import java.util.Arrays;
    import java.util.List;
    """

    # Combine task description, original task, and original template into a single prompt
    prompt = (f"Based on the following new task description and the original task description, generate a detailed Java code template. "
            "The code template is a general structure for the student to solve the task in, so it should not include any solution but a skeleton to solve the task in. "
            "The template should include all necessary placeholders and comments to guide the students in completing the task. "
            "Ensure that the template aligns with the exercises and instructions provided in both the new and original task descriptions. "
            "Use the provided original code template as inspiration for the structure and formatting of the new code template.\n\n"
            f"### New Task Description\n\n"
            f"{task_description}\n\n"
            f"### Original Task Description\n\n"
            f"{original_task_description}\n\n"
            "### Original Code Template\n\n"
            f"{original_template}\n\n"
            "IMPORTANT: The response must be plain Java code with no markdown formatting or ```java blocks. "
            "Ensure that the response is ready to be saved directly as .java files. "
            "The model can generate multiple .java files if necessary, and each file should be named accordingly with classes placed in appropriate files."
    )

    # Call OpenAI API to generate the template code
    response_content = generate_with_retries(client, prompt, max_retries=3)
    if response_content is None:
        print("Error: Failed to generate template code after multiple retries.")
        sys.exit(1)

    # Ensure the gen_src directory exists
    gen_src_dir = os.path.join("gen_src")
    os.makedirs(gen_src_dir, exist_ok=True)

    # Write the generated code to multiple Java files if necessary
    write_generated_code_to_files(gen_src_dir, response_content)

    # Commit and push changes
    commit_and_push_changes(branch_name, gen_src_dir)

def write_generated_code_to_files(directory, code_content):
    """Write generated Java code to appropriate files in the specified directory."""
    file_blocks = code_content.split("class ")
    for block in file_blocks:
        if block.strip():  # Ensure there's content
            class_name = block.split("{")[0].strip().split()[0]
            if not class_name.isidentifier():  # Check if the class name is valid
                print(f"Invalid class name detected: '{class_name}'. Skipping block.")
                continue
            
            file_name = f"{class_name}.java"
            file_path = os.path.join(directory, file_name)

            # Ensure the directory exists
            os.makedirs(directory, exist_ok=True)

            try:
                with open(file_path, "w") as java_file:
                    java_file.write("class " + block)
            except IOError as e:
                print(f"Error writing file {file_name}: {e}")

def generate_with_retries(client, prompt, max_retries=3):
    for attempt in range(max_retries):
        try:
            response = client.chat.completions.create(
                model="gpt-4o-2024-08-06",
                messages=[
                    {"role": "system", "content": "You are a helpful assistant."},
                    {"role": "user", "content": prompt}
                ]
            )
            return response.choices[0].message.content.strip()
        except Exception as e:
            print(f"Error generating template code: {e}")
            if attempt < max_retries - 1:
                print("Retrying...")
    return None

def commit_and_push_changes(branch_name, directory_path):
    try:
        subprocess.run(["git", "config", "--global", "user.email", "actions@github.com"], check=True)
        subprocess.run(["git", "config", "--global", "user.name", "github-actions"], check=True)

        subprocess.run(["git", "add", directory_path], check=True)
        subprocess.run(["git", "commit", "-m", "Add new generated template code"], check=True)
        subprocess.run(
            ["git", "push", "--set-upstream", "origin", branch_name],
            check=True,
            env=dict(os.environ, GIT_ASKPASS='echo', GIT_USERNAME='x-access-token', GIT_PASSWORD=os.getenv('GITHUB_TOKEN'))
        )
    except subprocess.CalledProcessError as e:
        print(f"Error committing and pushing changes: {e}")
        sys.exit(1)

if len(sys.argv) != 3:
    print("Error: Missing required command line arguments 'api_key' and 'branch_name'")
    sys.exit(1)

api_key = sys.argv[1]
branch_name = sys.argv[2]

main(api_key, branch_name)
