# 🕹️ Simple Java Adventure Game

In this assignment, you will create a simple text-based game in Java. You will implement basic game functionalities such as player movement, a scoring system, and interactions with enemies. This will help you become familiar with designing Java classes and understanding key concepts like instance fields, constructors, getters and setters, printing to the console, and managing variable scope.

### 🎯 Learning Goals

By completing this assignment, you will learn:
* Designing Java classes to represent game entities
* Adding instance fields to store data related to game objects
* Creating a constructor method to initialize object state
* Defining *getters* and *setters* for encapsulation
* Understanding and managing scope and variable shadowing
* Using the `main` method effectively
* Printing information to the terminal

### 📚 Preparation
Before starting, make sure you have:
- Installed a Java IDE (such as IntelliJ IDEA or Eclipse)
- Completed the introductory readings on Java classes and object-oriented programming
- Familiarized yourself with using the terminal or console for inputs and outputs

### 🏗️ Assignment Structure

You will develop a simple game with the following components:
- A **Player** class that allows movement and tracks the score
- An **Enemy** class that the player can interact with
- A **Game** class to run the simulation

### 📋 Instructions

#### Exercise 1: Player Class

Create a `Player.java` class with the following:
- Fields: `String name`, `int score`, `int positionX`, `int positionY`.
- Constructor: Initialize a player with a default score of 0 and starting position (0,0).
- Getters and Setters: Provide access to change and retrieve the player's name, score, and position.
- Methods: 
  - `move(int deltaX, int deltaY)`: Updates the player's position.
  - `printStatus()`: Prints the player’s name, position, and score to the terminal.

<details>
  <summary>🛠 Example Code</summary>

```java
public class Player {
  // Fields
  private String name;
  private int score;
  private int positionX;
  private int positionY;

  // Constructor
  public Player(String name) {
    this.name = name;
    this.score = 0;
    this.positionX = 0;
    this.positionY = 0;
  }
  
  // Getters and Setters
  public String getName() { return name; }
  public void setName(String name) { this.name = name; }
  public int getScore() { return score; }
  public void setScore(int score) { this.score = score; }
  public int getPositionX() { return positionX; }
  public void setPositionX(int positionX) { this.positionX = positionX; }
  public int getPositionY() { return positionY; }
  public void setPositionY(int positionY) { this.positionY = positionY; }

  // Methods
  public void move(int deltaX, int deltaY) {
    this.positionX += deltaX;
    this.positionY += deltaY;
  }

  public void printStatus() {
    System.out.println("Player: " + name);
    System.out.println("Score: " + score);
    System.out.println("Position: (" + positionX + ", " + positionY + ")");
  }
}
```
</details>

#### Exercise 2: Enemy Class

Create an `Enemy.java` class with:
- Fields: `String type`, `int positionX`, `int positionY`.
- Constructor: Initialize an enemy with a type and position.
- Getters and Setters: For type and position.
- Method: `isCollided(Player player)`: Returns true if the enemy's position matches the player's position.

<details>
  <summary>🛠 Example Code</summary>

```java
public class Enemy {
  // Fields
  private String type;
  private int positionX;
  private int positionY;

  // Constructor
  public Enemy(String type, int positionX, int positionY) {
    this.type = type;
    this.positionX = positionX;
    this.positionY = positionY;
  }

  // Getters and Setters
  public String getType() { return type; }
  public void setType(String type) { this.type = type; }
  public int getPositionX() { return positionX; }
  public void setPositionX(int positionX) { this.positionX = positionX; }
  public int getPositionY() { return positionY; }
  public void setPositionY(int positionY) { this.positionY = positionY; }

  // Methods
  public boolean isCollided(Player player) {
    return this.positionX == player.getPositionX() && this.positionY == player.getPositionY();
  }
}
```
</details>

#### Exercise 3: Game Class

Finally, create a `Game.java` class to simulate player and enemy interactions.
- Fields: `Player player`, `Enemy enemy`.
- Constructor: Initialize the game with a player and an enemy.
- Method: `runGame()`: Loop to allow player movements and check for collisions, updating the score.

<details>
  <summary>🛠 Example Code</summary>

```java
import java.util.Scanner;

public class Game {
  private Player player;
  private Enemy enemy;
  
  public Game(Player player, Enemy enemy) {
    this.player = player;
    this.enemy = enemy;
  }

  public void runGame() {
    Scanner scanner = new Scanner(System.in);
    while (true) {
      player.printStatus();
      System.out.println("Enter move direction (x y): ");
      int deltaX = scanner.nextInt();
      int deltaY = scanner.nextInt();
      player.move(deltaX, deltaY);

      if (enemy.isCollided(player)) {
        System.out.println("Collision with enemy " + enemy.getType() + "!");
        player.setScore(player.getScore() + 10);
        System.out.println("Score: " + player.getScore());
      }
    }
  }
  
  public static void main(String[] args) {
    Player player = new Player("Hero");
    Enemy enemy = new Enemy("Goblin", 1, 1);
    Game game = new Game(player, enemy);
    game.runGame();
  }
}
```
</details>

### 🤔 Things to Consider

- **Variable Shadowing**: Pay attention to variable names to avoid shadowing. Use `this` keyword for clarity in methods like constructors.
- **Encapsulation**: Use private fields with public getters and setters to encapsulate your classes.
- **Scope**: Remember the scope of variables within methods to avoid accidental overwrites.

### 🚨 Troubleshooting Guide
If you encounter any issues:
1. Check error messages for clues.
2. Refer to the official Java documentation or Stack Overflow for help.
3. Discuss with your peers or seek assistance from your instructor.

> **Note:** Always test your classes using small code snippets to ensure they work as expected before integrating into the larger system.

Happy coding! 🎮