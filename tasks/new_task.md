# 🎨 Design Your Own Characters!

In this assignment, you will dive into the world of custom character design using Java classes. You will learn to model characters with various attributes and behaviors, practicing essential object-oriented programming concepts.

### 🌟 Deadline
Please submit your completed task by **Friday 20th October**.

### 📜 Instructions
To find detailed instructions on completing and submitting the assignment, refer to the [course assignments section](https://your-course-link.com).

### 📚 Preparation
Before starting this task, ensure you have reviewed the relevant materials and answer the following questions:

- Read about [Java Classes and Objects](https://docs.oracle.com/javase/tutorial/java/javaOO/index.html).
- Familiarize yourself with [Instance Variables](https://docs.oracle.com/javase/tutorial/java/javaOO/classvars.html).
- If you're new to Java, get started with [Setting Up Java](https://docs.oracle.com/javase/tutorial/getStarted/index.html).

### 🎯 Learning Goals
This week's learning objectives are:
- Designing Java classes that represent complex objects
- Adding instance fields to store state
- Writing constructor methods for initialization
- Creating getters and setters for encapsulation
- Printing to the terminal for output
- Utilizing the main method to execute your program
- Understanding and resolving scope/variable shadowing issues

### 🚑 Troubleshooting Guide
If you run into issues, follow this troubleshooting workflow:

1. Check the [help forum](https://your-course-help-forum.com) to see if a solution to your problem already exists.
2. If not, create a new question with "Character Design Task: [Brief Problem Description]" as the title.
3. Seek help during office hours or lab sessions as per your schedule.

Share knowledge with your peers, but please, do not share direct answers.

### 🏗️ Assignment: Build Your Own Character

In this assignment, you'll design and implement a Java class called `Character` that models a character with various attributes. You'll define a fictional character to bring to life in code!

#### Exercise 1 -- Creating Fields
In the `src` folder, create a new class file named `Character.java`. Your `Character` class should have the following fields:

- `String` name
- `int` age
- `String` type (e.g., 'Warrior', 'Mage', etc.)
- `int` strength
- `int` intelligence
- `boolean` isActive

Ensure the class field visibility is set to `private`.

<details>
  <summary>🛠 Example Code Structure</summary>

  ```java
  public class Character {
      // Instance variables
      private String name;
      private int age;
      private String type;
      private int strength;
      private int intelligence;
      private boolean isActive;

      // Your methods will go here!
  }
  ```
</details>

#### Exercise 2 -- Constructor Method
Create a constructor for your `Character` class that initializes all the fields. Use parameters to assign values on creation.

<details>
  <summary>🛠 Example Constructor</summary>

  ```java
  public Character(String name, int age, String type, int strength, int intelligence, boolean isActive) {
      this.name = name;
      this.age = age;
      this.type = type;
      this.strength = strength;
      this.intelligence = intelligence;
      this.isActive = isActive;
  }
  ```
</details>

#### Exercise 3 -- Getters and Setters
Implement getters and setters for each field. These methods help encapsulate your data, providing controlled access to it.

<details>
  <summary>🛠 Example Getter and Setter</summary>

  ```java
  public String getName() {
      return name;
  }

  public void setName(String name) {
      this.name = name;
  }
  ```
</details>

#### Exercise 4 -- Print Details
Add a method called `public void printDetails()` that prints all the character's information to the console in a formatted manner.

<details>
  <summary>🛠 Example Output Format</summary>

  ```java
  public void printDetails() {
      System.out.println("Character Details:");
      System.out.println("Name: " + name);
      System.out.println("Age: " + age);
      System.out.println("Type: " + type);
      System.out.println("Strength: " + strength);
      System.out.println("Intelligence: " + intelligence);
      System.out.println("Active: " + isActive);
  }
  ```
</details>

#### Exercise 5 -- Battle Interaction
Implement a `battle` method that takes another `Character` as a parameter. This method should compare and print which character is likely to win based on their strength and intelligence combined.

<details>
  <summary>🛠 Example Battle Method</summary>

  ```java
  public void battle(Character opponent) {
      int thisPower = this.strength + this.intelligence;
      int opponentPower = opponent.strength + opponent.intelligence;
      
      System.out.println(this.name + " battles " + opponent.getName() + "!");
      if (thisPower > opponentPower) {
          System.out.println(this.name + " is likely to win the battle.");
      } else if (thisPower < opponentPower) {
          System.out.println(opponent.getName() + " is likely to win the battle.");
      } else {
          System.out.println("It's a tie!");
      }
  }
  ```
</details>

#### Exercise 6 -- Scope and Shadowing
Review the following example of variable shadowing and resolve it using the `this` keyword. Understand the concept of variable shadowing and how it can affect your code.

```java
public class ShadowExample {
    private String name;

    public ShadowExample(String name) {
        name = name; // Fix this
    }

    public void printName() {
        String name = "Temporary Name";
        System.out.println(name); // How to print the instance variable instead?
    }

    public static void main(String[] args) {
        new ShadowExample("Real Name").printName();
    }
}
```

> **Hint:** Consider the scope where each variable is defined and use `this` to refer to instance variables.

### 📝 Conclusion
By the end of this exercise, you will have a fully functional character model with the ability to interact in simple simulations. Remember to test your class thoroughly in the `main` method and ensure your understanding of object-oriented principles is solid. If you encounter issues, refer back to the documentation provided in the preparation section.

### 🐛 Found a Bug?
If you detect any inconsistencies or mistakes in this material, please open a [New Issue](https://your-course-help-forum.com/issues/new) with a clear description.