# 🎮 Simple Adventure: Java Game Application

In this exercise, you are tasked with creating a simple 2D game in Java. The game will feature basic player movement, a scoring system, and interactions with enemies. You'll practice object design with Java classes and refine skills like setting up constructors, managing fields with getters and setters, and understanding variable scope and shadowing.

### 💀 Deadline
Please complete this assignment by **Friday, December 15th**.

### 👩‍🏫 Instructions
For instructions on how to submit your assignment, please refer to the [assignments section of the course instructions](https://your-university-link.com/assignments).

### 📝 Preparation
Before you begin the task, make sure to review the following materials:

- Read [Understanding Java Classes](https://docs.oracle.com/javase/tutorial/java/javaOO/classes.html)
- Review [Object-Oriented Programming Concepts](https://docs.oracle.com/javase/tutorial/java/concepts/) 

If you're registered in our course, ensure you have the necessary IDE setup to compile and run Java applications. Check the [installation guide](https://your-university-link.com/installation-guide) for assistance.

### ✅ Learning Goals

By completing this task, you will achieve the following learning outcomes:

- Designing Java classes
- Adding instance fields
- Adding a constructor method
- Creating getters and setters
- Printing to the terminal
- Using the `main` method
- Comprehending scope and variable shadowing

### 🚨 Troubleshooting Guide

If you run into issues, try the following steps:

1. Check the [current issues](https://your-university-link.com/help/issues) from other students. 
2. If the problem hasn't been addressed, create a [New Issue](https://your-university-link.com/help/issues/new) with a descriptive title, beginning with "Task Game: *summary of problem*".
3. You can discuss the issues with your peers, but avoid sharing direct solutions. For detailed help, ask a TA during lab sessions.

### 🏛 Assignment Description

In this assignment, you will develop a simple text-based game involving player movement, scoring, and interaction with enemies. You will encapsulate game elements like the player and enemies using well-defined Java classes.

#### 🚀 Exercise 1: Class Design and Fields

Create a class named `Player` in the `src` directory. Design this class to include the following fields:

- `String name`
- `int positionX` and `int positionY` for player coordinates
- `int score`
- `boolean isAlive`

Create another class named `Enemy` with similar fields:

- `String type`
- `int positionX` and `int positionY`
- `boolean isDefeated`

#### Exercise 2: Constructor and Getters/Setters

Implement constructors in both classes to initialize these fields. Ensure the fields are private and provide public getters and setters.

For `Player`, ensure the constructor initializes the `positionX` and `positionY` to zero, `score` to zero, and `isAlive` to true by default.

<details>
  <summary> 🛠 Example Constructor Implementation </summary>

  ```java
  public class Player {
      private String name;
      private int positionX, positionY, score;
      private boolean isAlive;

      public Player(String name) {
          this.name = name;
          this.positionX = 0;
          this.positionY = 0;
          this.score = 0;
          this.isAlive = true;
      }

      // getters and setters follow
  }
  ```

</details>

#### Exercise 3: Player Movement

Add a method `move(int deltaX, int deltaY)` to the `Player` class that updates the player's coordinates. Print the new position every time the player moves.

```java
public void move(int deltaX, int deltaY) {
    this.positionX += deltaX;
    this.positionY += deltaY;
    System.out.println("Player moved to (" + this.positionX + ", " + this.positionY + ")");
}
```

#### Exercise 4: Scoring System

Create a method `addScore(int points)` in the `Player` class to update and print the player's score.

```java
public void addScore(int points) {
    this.score += points;
    System.out.println("New score: " + this.score);
}
```

#### Exercise 5: Enemy Interaction

Implement a method `interactWith(Player player)` in the `Enemy` class. If the player is at the same position as the enemy, set the player's status to not alive and print a defeat message.

```java
public void interactWith(Player player) {
    if (this.positionX == player.getPositionX() && this.positionY == player.getPositionY()) {
        player.setAlive(false);
        System.out.println("Game Over! " + player.getName() + " was defeated by an enemy.");
    }
}
```

#### Exercise 6: Main Method and Scope

Create a `Game` class with a `main` method to instantiate a `Player` and an `Enemy`. Use player methods to simulate movement and interaction with the enemy.

Demonstrate variable shadowing within the classes and fix it using the `this` keyword:

```java
public void setName(String name) {
    this.name = name;
}

public void setPosition(int positionX, int positionY) {
    this.positionX = positionX;  // Correct variable shadowing here
    this.positionY = positionY;
}
```

Compile and run your code to ensure functionality and correctness.

### 🐞 Bugs or Suggestions?

If you notice any bugs or have suggestions for this exercise, please open a [New Issue](https://your-university-link.com/issues/new) titled "Game Project Error: *brief problem description*". We appreciate your feedback and contributions to improve this exercise!