name: Pull Request Review

on:
  pull_request:
    branches:
      - task-* # This triggers the workflow on PRs to task branches

permissions:
  contents: write  # Grant write permission for the GITHUB_TOKEN
  pull-requests: write  # Making sure the PR comments can be added

jobs:
  run-tests:
    runs-on: ubuntu-latest

    steps:
      - name: Checkout the code
        uses: actions/checkout@v3
        with:
          ref: ${{ github.head_ref }}

      - name: Set up Java
        uses: actions/setup-java@v3
        with:
          distribution: 'adopt'
          java-version: '11'

      - name: Download JUnit
        run: |
          wget -O junit-4.13.2.jar https://repo1.maven.org/maven2/junit/junit/4.13.2/junit-4.13.2.jar
          wget -O hamcrest-core-1.3.jar https://repo1.maven.org/maven2/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar

      - name: Compile the Source Code
        run: |
          # Rename files with .java2 extension to .java
          for file in gen_src/*.java2; do mv "$file" "${file%.java2}.java"; done
          for file in gen_test/*.java2; do mv "$file" "${file%.java2}.java"; done

          # Compile source files into the correct package structure
          javac -cp .:junit-4.13.2.jar:hamcrest-core-1.3.jar -d build/ gen_src/*.java

          # Compile test files into the correct package structure
          javac -cp .:build/:junit-4.13.2.jar:hamcrest-core-1.3.jar -d build/ gen_test/*.java

      - name: Run Tests
        run: |
          # Run each test class found in the gen_test directory
          for testfile in gen_test/*.java; do
            testname=$(basename "$testfile" .java)
            java -cp build/:junit-4.13.2.jar:hamcrest-core-1.3.jar org.junit.runner.JUnitCore test.$testname
          done
