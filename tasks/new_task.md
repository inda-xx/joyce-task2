# Game Time! Develop Your Simple Adventure Game 🎮

Welcome to your coding adventure! In this exercise, you'll be designing a simple game in Java featuring a player with movements, a scoring system, and interactions with enemies. This task will get you acquainted with fundamental Java classes and objects, fostering your skills in object-oriented programming.

### 💀 Deadline
Complete this task prior to the next class session, on **Friday 20th November**.

### 👩‍🏫 Instructions
Instructions on how to submit this assignment can be found in the [course assignments section](https://example.com).

### 📝 Preparation

Before you dive into this task, make sure to revise the following Java concepts:

- [Introduction to Classes and Objects](https://docs.oracle.com/javase/tutorial/java/javaOO/classdecl.html)
- [Methods, Getters, and Setters](https://docs.oracle.com/javase/tutorial/java/javaOO/methods.html)
- [Understanding Constructors](https://docs.oracle.com/javase/tutorial/java/javaOO/constructors.html)

This foundational knowledge will set you up for success!

### ✅ Learning Goals

This task aims to solidify your understanding of the following:

- Designing Java classes
- Adding instance fields
- Crafting a constructor method
- Creating getters and setters
- Printing information to the terminal
- Using the `main` method
- Understanding scope and variable shadowing

### 🚨 Troubleshooting Guide

If you encounter any issues, follow these steps:

1. Check the [class forum](https://example.com) to see if anyone else has encountered similar issues.
2. Still stuck? Post your question there, starting with "Task Issue: *summary of problem*."
3. Consult your peers in a study group, but remember: **don't share solutions.**

### 🎮 Assignment - Simple Adventure Game

You're tasked with creating an adventure game where the player navigates a world, earns points, and fends off enemies. Let's design a basic version to get you started:

#### Exercise 1: Class Construction
First, set up basic structures in the `src` folder by creating classes for the `Player`, `Enemy`, and `Game`.

##### Player Class

- Attributes: `String name`, `int score`, `int health`, `int xPosition`, `int yPosition`.
- Constructor: Initiates player's name, score, health, and starting position.
- Methods: Move the player (`moveUp`, `moveDown`, `moveLeft`, `moveRight`), a method to print player info.

##### Enemy Class

- Attributes: `String type`, `int strength`, `int xPosition`, `int yPosition`.
- Constructor: Initializes the enemy's properties.
- Methods: Set behavior methods for interaction with the player (e.g., `interact(Player player)`).

##### Game Class

- Attributes: `String name`, `Player player`, `List<Enemy> enemies`.
- Constructor: Initializes the game with a player and a series of enemies.
- Main game loop method within which the game runs (`runGame()`).

<details>
  <summary>🛠 Example Setup</summary>

  ```java
  public class Player {
      // Fields
      private String name;
      private int score;
      private int health;
      private int xPosition;
      private int yPosition;

      // Constructor
      public Player(String name) {
          this.name = name;
          this.score = 0;
          this.health = 100;
          this.xPosition = 0;
          this.yPosition = 0;
      }
      
      // Provide move, getters, setters, and printInfo methods
  }
  ```

  ```java
  public class Enemy {
      // Fields
      private String type;
      private int strength;
      private int xPosition;
      private int yPosition;

      // Constructor
      public Enemy(String type, int strength, int x, int y) {
          this.type = type;
          this.strength = strength;
          this.xPosition = x;
          this.yPosition = y;
      }
      
      // Define interact method here
  }
  ```

  ```java
  public class Game {
      // Fields
      private String name;
      private Player player;
      private List<Enemy> enemies;

      // Constructor
      public Game(String name, Player player) {
          this.name = name;
          this.player = player;
          this.enemies = new ArrayList<>();
      }

      // Method to run and manage the game
  }
  ```
</details>

#### Exercise 2: Getters, Setters, and Interaction
Add getter and setter methods for encapsulation, enabling safe access to private fields.

- Player: Create `getters` and `setters` for all fields.
- Enemy: Access and modify enemy attributes.
- Game: Manage interactions between players and enemies using methods like `interactWithEnemies()`.

<details>
  <summary> 🛠 Player Example </summary>

  ```java
  public class Player {
      // Fields
      private String name;
      private int score;
      private int health;
      private int xPosition;
      private int yPosition;

      // Constructor and move methods remain the same

      // Getters and Setters
      public String getName() { return name; }
      public void setName(String name) { this.name = name; }
      
      public int getScore() { return score; }
      public void setScore(int score) { this.score = score; }

      // Implement other getters/setters
  }
  ```
</details>

#### Exercise 3: Game Actions and Enemy Interaction
Define the player's ability to move and interact with enemies.

- Game: Within `runGame()`, include logic for moving, scoring, and enemy interactions.
- Create utility methods for score updates and position management within your game loop.

<details>
  <summary> 🛠 Simple Game Logic Example </summary>

  ```java
  public class Game {
      // Fields and constructor remain the same
      
      public void runGame() {
          System.out.println("Welcome to " + this.name + "!");
          // Add pseudo code here for game interaction and loop
          // Check player interaction with enemy and update score
      }
  }
  ```

  This code skeleton lets you implement movements and interactions creatively!
</details>

#### Exercise 4: Practice with Scope and Variable Shadowing
Illustrate examples of variable shadowing and solve issues using `this` keyword:

```java
public class Example {
    private int exampleVar = 100;

    public void demonstrateShadowing() {
        int exampleVar = 50;
        System.out.println(exampleVar); // Prints local variable, intended to use object variable.
    }
}
```

Consider correcting it by focusing on correct variable references within methods and constructors.

### 🐞 Bugs and Errors?
If you find a bug or inconsistency, report it in the [New Issue section](https://example.com) titled "Game Task Error: *summary of error*".

You're now set to build your adventure game in Java, combining movement, scoring, and enemy interaction mechanics! Enjoy your coding quest! 🎮