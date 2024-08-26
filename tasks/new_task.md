# 🕹️ Java Adventures: Simple Game Application

For this task, you'll dive into creating a simple game application using Java. You'll focus on implementing essential functionalities such as player movement, a scoring system, and enemy interactions. 

### 💀 Deadline

Please complete this assignment before the exercise session on **Friday 20th October**.

### 👩‍🏫 Instructions

For instructions on submission, refer to the [assignments section of the course instructions](https://your_course_instructions_link_here).

### 📝 Preparation

Make sure to review these materials to succeed in this task:
- Read [Object-Oriented Programming in Java](https://docs.oracle.com/javase/tutorial/java/javaOO/index.html)
- Complete the exercises in Module 3 of your course book.

> **Note:** You may sometimes read ahead or find discrepancies, which is an opportunity to explore and learn.

### ✅ Learning Goals

This week's learning objectives include:

- Designing Java classes
- Adding instance fields
- Adding a constructor method
- Creating getters and setters
- Printing to the terminal
- Using the `main` method
- Understanding scope (or variable shadowing)

### 🚨 Troubleshooting Guide

If you have any queries or run into issues, follow these steps:

1. Check this week's [forum issues](https://your_forum_issues_link_here) to see if other students have similar problems.
2. If not, open a [New Issue](https://your_new_issue_link_here). Add a summary with a descriptive title.
3. Consult a TA during weekly lab sessions. Refer to your schedule for the exact timing.

Collaboration is encouraged, but **do not share direct solutions!**

### 🎮 Assignment: Simple Game Design

For this task, you'll implement a basic gaming application. Your application must allow player movement, interaction with enemies, and a scoring system. Let's embark on this adventure!

#### Exercise 1.0 -- Player Class

In your `src` directory, create a `Player.java` class. Define a player with the following instance fields:

- `String name`
- `int score`
- `int positionX` and `positionY` for tracking player movement.

Implement a constructor that initializes these fields, and add getter and setter methods for each. Below is an example method, replicate this for all fields:

```java
public class Player {

    private String name;
    private int score;
    private int positionX;
    private int positionY;

    // Constructor
    public Player(String name, int positionX, int positionY) {
        this.name = name;
        this.positionX = positionX;
        this.positionY = positionY;
        this.score = 0; // Starting score
    }

    // Getter for score
    public int getScore() {
        return score;
    }

    // Setter for score
    public void setScore(int score) {
        this.score = score;
    }

    // Additional getters and setters
    // ...
}
```

#### Exercise 1.1 -- Enemy Interaction

Create an `Enemy.java` class with the following fields:

- `int positionX` and `int positionY`
- `String type` (e.g., "Goblin", "Orc")

Add a method `interact(Player player)` that determines if a player encountered an enemy. If so, decrease player score by a certain amount, e.g., -10 points.

```java
public class Enemy {

    private int positionX;
    private int positionY;
    private String type;

    // Constructor
    public Enemy(String type, int positionX, int positionY) {
        this.type = type;
        this.positionX = positionX;
        this.positionY = positionY;
    }

    // Interaction with player
    public void interact(Player player) {
        if (player.getPositionX() == this.positionX && player.getPositionY() == this.positionY) {
            player.setScore(player.getScore() - 10);
            System.out.println(player.getName() + " encountered a " + type + "! Score: " + player.getScore());
        }
    }
}
```

#### Exercise 1.2 -- Movement System

In the `Player` class, implement methods `moveUp()`, `moveDown()`, `moveLeft()`, and `moveRight()` that alter the player's position. Each method should update position coordinates and print the player’s current position.

#### Exercise 1.3 -- Game Launcher

Create a `Game.java` class with the `main` method where you will instantiate a player and a few enemies. Manage player movements and interactions, and print out each step in the console.

```java
public class Game {

    public static void main(String[] args) {
        Player player = new Player("Hero", 0, 0);
        Enemy goblin = new Enemy("Goblin", 1, 0);
        Enemy orc = new Enemy("Orc", 0, 1);

        // Example movement
        player.moveRight();
        goblin.interact(player);

        player.moveDown();
        orc.interact(player);

        // Additional game logic...
    }
}
```

#### Exercise 1.4 -- Variable Shadowing

Review these examples on variable shadowing and consider how you might approach similar problems in your game code.

```java
public class Example {

    private int number = 0;

    public void showNumber() {
        int number = 5;
        System.out.println(number); // This will print 5, not 0
    }

    public static void main(String[] args) {
        new Example().showNumber();
    }
}
```

```java
public class Animal {

    private String type;

    public Animal(String type) {
        type = type; // This won’t correctly assign the instance variable
    }

    public void makeSound() {
        String type = "Dog"; 
        System.out.println(type + " barks!"); // It’ll print “Dog barks!” instead
    }
}
```

> **Note:** Reflect on local vs. instance variables and how `this` keyword resolves shadowing.

### 🐞 Bugs and errors?

If any inconsistencies or errors arise, please open a [New Issue](https://your_new_issue_link_here) with a detailed description. Bug reporters will be acknowledged.

Good luck, and enjoy crafting your simple game! 🎮