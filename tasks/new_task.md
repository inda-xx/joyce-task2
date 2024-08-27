# 🕹️ Create Your Own Adventure Game!

For this assignment, you will design and implement a simple text-based adventure game using Java. This task will help you practice object-oriented programming and familiarize yourself with Java classes and methods, while integrating core game functionalities such as player movement, a scoring system, and enemy interaction.

### 💀 Deadline
Ensure you complete this assignment before class on **Friday, 14th October**.

### 👩‍🏫 Instructions
For detailed instructions on how to proceed with and submit this assignment, please refer to the [Assignments Section](https://youruniversity.edu/course-instructions#assignments).

### 📝 Preparation
To set yourself up for success, ensure you review and comprehend the following resources:

- [Object-Oriented Programming Concepts](https://docs.oracle.com/javase/tutorial/java/concepts/)
- [Java Classes and Objects](https://docs.oracle.com/javase/tutorial/java/javaOO/classes.html)

> **Assistant's Note:** These readings are foundational to understanding the structure and implementation of your classes.

### ✅ Learning Goals

This week's learning goals include:

- Designing Java classes
- Adding instance fields
- Adding a constructor method
- Creating *getters* and *setters*
- Printing to the terminal
- Using the main method
- Understanding scope (including *variable shadowing*)

### 🚨 Troubleshooting Guide
If you encounter difficulties, follow this checklist:

1. Review this week's [online forum](https://yourcourseforum.com/help/issues) to see if others have resolved similar issues.
2. If your question is unique, create a [New Issue](https://yourcourseforum.com/help/issues/new). Make your title descriptive, e.g., "Task *3*: *Brief Description of Problem*".
3. Consult with your Teaching Assistant during lab hours. Schedule details can be found [here](https://youruniversity.edu/lab-schedule).

Remember, cooperation with peers is encouraged, but direct sharing of solutions is prohibited!

### 🎮 Assignment

Create a dynamic and interactive game world with multiple game elements. Your goal is to develop a text-based adventure game featuring player movement, a scoring system, and enemy interactions.

#### Exercise 3.0 -- Fields and Initial Setup
Begin by creating a new class called `GameCharacter.java` in the `src` folder. The `GameCharacter` class should represent any entity in your game world, such as a player or an enemy. The necessary fields are:

- `String` name
- `int` healthPoints
- `int` score
- `boolean` isEnemy

Example of how these fields could be initialized in the `main` method:

<details>
  <summary> 🛠 GameCharacter Example </summary>

  ```java
  public class GameCharacter {

      // Define fields here
      String name;
      int healthPoints;
      int score;
      boolean isEnemy;

      public static void main(String[] args) {
          // Create a player character
          GameCharacter player = new GameCharacter();
          player.name = "Adventurer";
          player.healthPoints = 100;
          player.score = 0;
          player.isEnemy = false;

          // Output player's initial state
          System.out.println("Character: " + player.name);
          System.out.println("Health: " + player.healthPoints);
          System.out.println("Score: " + player.score);
          System.out.println("Is Enemy: " + player.isEnemy);
      }
  }
  ```
</details>

#### Exercise 3.1 -- Getters and Setters
To adhere to encapsulation principles, modify the fields to private and implement getters and setters for all fields in the `GameCharacter` class.

<details>
  <summary> 🛠 Encapsulation Example </summary>

  ```java
  public class GameCharacter {

      // Define fields here
      private String name;
      private int healthPoints;
      private int score;
      private boolean isEnemy;

      // Getters and setters
      public String getName() { return name; }
      public void setName(String name) { this.name = name; }

      public int getHealthPoints() { return healthPoints; }
      public void setHealthPoints(int healthPoints) { this.healthPoints = healthPoints; }

      public int getScore() { return score; }
      public void setScore(int score) { this.score = score; }

      public boolean getIsEnemy() { return isEnemy; }
      public void setIsEnemy(boolean isEnemy) { this.isEnemy = isEnemy; }
  }
  ```
</details>

#### Exercise 3.2 -- Constructors
Implement a constructor for `GameCharacter` that initializes all fields using parameters. Replace the example constructor calls with this new constructor method.

<details>
  <summary> 🛠 Constructor Example </summary>

  ```java
  public GameCharacter(String name, int healthPoints, int score, boolean isEnemy) {
      this.name = name;
      this.healthPoints = healthPoints;
      this.score = score;
      this.isEnemy = isEnemy;
  }

  public static void main(String[] args) {
      GameCharacter player = new GameCharacter("Adventurer", 100, 0, false);
      System.out.println("Character: " + player.getName());
  }
  ```
</details>

#### Exercise 3.3 -- Player Movement
Add a new method called `movePlayer(String direction)` to the `GameCharacter` class. This method should print the direction in which the player moves.

<details>
  <summary> 🛠 Player Movement Example </summary>

  ```java
  public void movePlayer(String direction) {
      System.out.println(name + " moves " + direction);
  }

  public static void main(String[] args) {
      GameCharacter player = new GameCharacter("Adventurer", 100, 0, false);
      player.movePlayer("north");
  }
  ```
</details>

#### Exercise 3.4 -- Enemy Interaction
Add a method called `interact(GameCharacter otherCharacter)` that interacts with another `GameCharacter`, decreasing `healthPoints` if `otherCharacter` is an enemy.

<details>
  <summary> 🛠 Interaction Example </summary>

  ```java
  public void interact(GameCharacter otherCharacter) {
      if (otherCharacter.getIsEnemy()) {
          System.out.println(name + " encounters an enemy: " + otherCharacter.getName());
          this.healthPoints -= 10;
          System.out.println("Health now: " + this.healthPoints);
      }
  }

  public static void main(String[] args) {
      GameCharacter player = new GameCharacter("Adventurer", 100, 0, false);
      GameCharacter enemy = new GameCharacter("Goblin", 30, 0, true);
      player.interact(enemy);
  }
  ```
</details>

#### Exercise 3.5 -- Scope and Variable Shadowing
Investigate and resolve variable shadowing issues that might arise when implementing these features. Applying the `this` keyword correctly will help you manage the class fields and local variables effectively.

<details>
  <summary> 🛠 Scope Example </summary>

  ```java
  public class Game {

      private int level = 1;

      public void advanceLevel(int level) { // This causes variable shadowing
          this.level = level;
          System.out.println("Advanced to level: " + this.level);
      }
  }

  public static void main(String[] args) {
      Game gameInstance = new Game();
      gameInstance.advanceLevel(2); // Fix the shadowing problem to ensure correct output
  }
  ```
</details>

> **Assistant's Note:** For both local and instance variables, understand how scope and variable shadowing work in Java!

### 🐞 Bugs and Errors?
In case you discover inconsistencies or errors, kindly open a [New Issue](https://youruniversity.edu/help/issues/new) with the subject line "Task 3 Error: [Brief Error Description]". All verifiable bug reports will be rewarded via acknowledgments in the course materials!