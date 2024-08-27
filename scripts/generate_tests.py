import os
import sys
import subprocess
import re
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

    # Read the solution code
    try:
        with open(".hidden_tasks/new_task_solution.java", "r") as file:
            solution = file.read()
    except FileNotFoundError:
        print("Error: new_task_solution.java file not found.")
        sys.exit(1)

    # Extract the package and class name from the solution to use in the test
    package_name = extract_package_name(solution)
    class_name = extract_class_name(solution)

    # Example tests to inspire the model (not to be directly copied)
    example_tests = """
    package original;
    import org.junit.Before;
    import org.junit.Test;
    import static org.junit.Assert.*;

    public class IndamonTest {
        private Indamon indamon1;
        private Indamon indamon2;

        @Before
        public void setUp() {
            indamon1 = new Indamon("Glassey", 10, 5, 5);
            indamon2 = new Indamon("Siberov", 10, 5, 5);
        }

        @Test
        public void testGetName() {
            assertEquals("Glassey", indamon1.getName());
            assertEquals("Siberov", indamon2.getName());
        }

        @Test
        public void testGetHp() {
            assertEquals(10, indamon1.getHp());
            assertEquals(10, indamon2.getHp());
        }

        @Test
        public void testGetAttack() {
            assertEquals(5, indamon1.getAttack());
            assertEquals(5, indamon2.getAttack());
        }

        @Test
        public void testGetDefense() {
            assertEquals(5, indamon1.getDefense());
            assertEquals(5, indamon2.getDefense());
        }

        @Test
        public void testGetFainted() {
            assertEquals(false, indamon1.getFainted());
            assertEquals(false, indamon2.getFainted());
        }

        @Test
        public void testSetName() {
            indamon1.setName("NewName");
            assertEquals("NewName", indamon1.getName());
        }

        @Test
        public void testSetHp() {
            indamon1.setHp(20);
            assertEquals(20, indamon1.getHp());
        }

        @Test
        public void testSetAttack() {
            indamon1.setAttack(7);
            assertEquals(7, indamon1.getAttack());
        }

        @Test
        public void testSetDefense() {
            indamon1.setDefense(8);
            assertEquals(8, indamon1.getDefense());
        }

        @Test
        public void testSetFainted() {
            indamon1.setFainted(true);
            assertEquals(true, indamon1.getFainted());
        }

        @Test
        public void testAttack() {
            indamon1 = new Indamon("Glassey", 10, 5, 5);
            indamon2 = new Indamon("Siberov", 10, 5, 5);
            indamon1.attack(indamon2);
            assertEquals(9, indamon2.getHp()); 
            assertEquals(false, indamon2.getFainted());
        }
    }
    """

    # Combine the solution into a single prompt for test generation
    prompt = (
        f"Given the following Java solution, generate a set of high-quality unit tests. "
        f"Ensure the tests are thorough, robust, and cover all edge cases, including invalid inputs, boundary conditions, and performance considerations. "
        f"The tests should follow best practices, including descriptive naming conventions, setup and teardown methods if necessary, and detailed assertions to validate expected behavior. "
        f"Ensure that the tests use the correct imports and that each class is placed in the correct file as per Java naming conventions.\n\n"
        f"### Solution\n{solution}\n\n"
        f"### Example Tests (for inspiration only)\n{example_tests}\n\n"
        "IMPORTANT: The response must be plain Java code with no markdown formatting or ```java blocks. Ensure that the response is ready to be saved directly as a .java file."
    )

    response_content = generate_with_retries(client, prompt, max_retries=3)
    if response_content is None:
        print("Error: Failed to generate the tests after multiple retries.")
        sys.exit(1)

    # Ensure the tests use the correct package and imports
    response_content = adjust_package_and_imports(response_content, package_name)

    # Write the generated tests to a Java file in the gen_test directory
    gen_test_dir = os.path.join("gen_test")
    write_generated_tests_to_file(gen_test_dir, response_content, class_name)

    # Commit and push changes
    commit_and_push_changes(branch_name, gen_test_dir)

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
            print(f"Error generating the tests: {e}")
            if attempt < max_retries - 1:
                print("Retrying...")
    return None

def extract_package_name(java_code):
    """Extract the package name from the given Java code."""
    match = re.search(r'\bpackage\s+(\w+(\.\w+)*);', java_code)
    if match:
        return match.group(1)
    return None

def extract_class_name(java_code):
    """Extract the class name from the given Java code."""
    match = re.search(r'\bclass\s+(\w+)', java_code)
    if match:
        return match.group(1)
    return "GeneratedTests"

def adjust_package_and_imports(test_code, package_name):
    """Adjust the package declaration and imports in the generated test code."""
    if package_name:
        test_code = f"package {package_name};\n\n" + test_code
        test_code = test_code.replace("import main.", f"import {package_name}.")
    return test_code

def write_generated_tests_to_file(directory, code_content, class_name):
    """Write all generated Java tests to a single file in the specified directory with an appropriate name."""
    file_name = f"{class_name}Test.java"
    file_path = os.path.join(directory, file_name)

    # Ensure the directory exists
    os.makedirs(directory, exist_ok=True)

    # Extract package and import statements
    package_declaration = ""
    import_statements = set()
    class_definitions = []

    lines = code_content.splitlines()
    for line in lines:
        if line.startswith("package "):
            package_declaration = line
        elif line.startswith("import "):
            import_statements.add(line)
        else:
            class_definitions.append(line)

    # Reconstruct the file content with proper structure
    final_content = "\n".join([package_declaration] + sorted(import_statements) + [""] + class_definitions)

    try:
        with open(file_path, "w") as java_file:
            java_file.write(final_content)
    except IOError as e:
        print(f"Error writing file {file_name}: {e}")

def commit_and_push_changes(branch_name, directory):
    try:
        subprocess.run(["git", "config", "--global", "user.email", "actions@github.com"], check=True)
        subprocess.run(["git", "config", "--global", "user.name", "github-actions"], check=True)

        subprocess.run(["git", "add", directory], check=True)
        subprocess.run(["git", "commit", "-m", "Add generated tests"], check=True)
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