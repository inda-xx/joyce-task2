import os
import sys
import subprocess
from openai import OpenAI

def main(api_key, branch_name):
    if not api_key:
        print("Error: OpenAI API key is missing.")
        sys.exit(1)

    client = OpenAI(api_key=api_key)

    # Ensure we are on the correct branch
    try:
        subprocess.run(["git", "checkout", branch_name], check=True)
    except subprocess.CalledProcessError as e:
        print(f"Error checking out branch {branch_name}: {e}")
        sys.exit(1)

    # Read the generated task
    try:
        with open("tasks/new_task.md", "r") as file:
            task = file.read()
    except FileNotFoundError:
        print("Error: new_task.md file not found.")
        sys.exit(1)

    # Read all .java files in the gen_src directory as the template
    gen_src_dir = "gen_src"
    if not os.path.exists(gen_src_dir):
        print(f"Error: Directory {gen_src_dir} does not exist.")
        sys.exit(1)

    template = ""
    for filename in os.listdir(gen_src_dir):
        if filename.endswith(".java"):
            file_path = os.path.join(gen_src_dir, filename)
            with open(file_path, "r") as file:
                template += f"\n// File: {filename}\n"
                template += file.read() + "\n"

    if not template:
        print(f"Error: No .java files found in {gen_src_dir}.")
        sys.exit(1)

    # Combine task and template into a single prompt for solution generation
    prompt = (
        f"Given the following task and code template, generate a complete Java solution that meets all the requirements. "
        f"The solution should be able to pass all potential unit tests that cover edge cases, invalid inputs, and boundary conditions. "
        f"Use meaningful variable names and comments to improve readability and maintainability.\n\n"
        f"### Task\n{task}\n\n"
        f"### Template\n{template}\n\n"
        "IMPORTANT: The response must be plain Java code with no markdown formatting or ```java blocks. Ensure that the response is ready to be saved directly as a .java file."
    )

    response_content = generate_with_retries(client, prompt, max_retries=3)
    if response_content is None:
        print("Error: Failed to generate the solution after multiple retries.")
        sys.exit(1)

    # Ensure the .hidden_tasks directory exists
    os.makedirs(".hidden_tasks", exist_ok=True)

    # Write the solution code to a Java file in the .hidden_tasks directory
    solution_file_path = os.path.join(".hidden_tasks", "new_task_solution.java")
    with open(solution_file_path, "w") as file:
        file.write(response_content)

    # Commit and push changes
    commit_and_push_changes(branch_name, solution_file_path)

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
            print(f"Error generating the solution: {e}")
            if attempt < max_retries - 1:
                print("Retrying...")
    return None

def commit_and_push_changes(branch_name, solution_file_path):
    try:
        subprocess.run(["git", "config", "--global", "user.email", "actions@github.com"], check=True)
        subprocess.run(["git", "config", "--global", "user.name", "github-actions"], check=True)

        subprocess.run(["git", "add", solution_file_path], check=True)
        subprocess.run(["git", "commit", "-m", "Add generated solution"], check=True)
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
