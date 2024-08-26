# 🎮 Simple Game Adventure

For this exercise, you will develop a basic Java game application that incorporates player movement, a scoring system, and enemy interactions. You are tasked with creating a game in which a player navigates a grid, encounters enemies, and earns points. This will be an excellent opportunity to practice working with Java classes and object-oriented programming concepts.

### 💀 Deadline
This work should be completed by **Friday, 30th September**.

### 👩‍🏫 Instructions
For instructions on how to submit the assignment, please refer to the [assignment guidelines on the course instructions page](https://course-instructions-link).

### 📝 Preparation
Ensure you have reviewed the relevant sections in your course textbook covering the basics of Java classes, methods, and object-oriented design principles.

- Read the chapter on [Java Classes and Objects](https://docs.oracle.com/javase/tutorial/java/javaOO/index.html).
- Familiarize yourself with [Method Declarations](https://docs.oracle.com/javase/tutorial/java/javaOO/methods.html).
- Study [Access Modifiers and Encapsulation](https://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html).

### ✅ Learning Goals

This week's learning objectives include:
* Designing Java classes
* Adding instance fields
* Adding a constructor method
* Creating *getters* and *setters*
* Printing to the terminal
* Using the `main` method
* Understanding scope and *variable shadowing*

### 🚨 Troubleshooting Guide
If you have any issues, please use the following resources:

1. Check the [discussion forum](https://forum-link) to see if others have faced similar problems.
2. If your issue hasn't been addressed, create a new thread with a detailed description.
3. Consult with a TA during the [scheduled labs](https://lab-schedule-link).

Feel free to discuss concepts with classmates, but ensure your submissions are unique.

### 🏛 Assignment: Create Your Game!

You'll be creating and managing a small adventure game with the following tasks:

#### Exercise 1: Basic Class Structure
Create the main framework for your game in `Game.java` with essential fields and methods.

1. **In `src` folder**: Create a `Game` class.
2. Add the following instance fields:
   - `Player` player
   - `List<Enemy>` enemies
   - `int score`
   - `int gridSize`

3. Implement a constructor that initializes the game with a default grid size and score. Ensure enemies and player objects are created appropriately.

```java
import java.util.ArrayList;
import java.util.List;

public class Game {
  
  private Player player;
  private List<Enemy> enemies;
  private int score;
  private int gridSize;
 
  public Game(int gridSize) {
    this.gridSize = gridSize;
    this.score = 0;
    this.player = new Player();
    this.enemies = new ArrayList<>();
    // Initialize enemies
  }

  // Main method
  public static void main(String[] args) {
    Game game = new Game(10);
    // Other game setup actions
  }
}
```

#### Exercise 2: Player and Enemy Classes
Design the `Player` and `Enemy` classes with required attributes and methods.

**Player.java:**

- Add instance fields: `int xPosition`, `int yPosition`, `int health`.
- Add constructor to initialize player's starting position and health.
- Create *getters* and *setters* for each field.
- Add `move()` method to change the player's position.

**Enemy.java:**

- Instance fields: `int xPosition`, `int yPosition`.
- Add constructor and the necessary *getters* and *setters*.

#### Exercise 3: Scoring System
Incorporate a scoring system into the game.

1. In `Game.java`, create a method `updateScore(int points)` that updates the score.
2. Adjust the score for each successful enemy encounter or player movement.

#### Exercise 4: Enemy Interaction
Develop interaction logic for when the player encounters an enemy.

- Implement a `checkCollision()` method in `Game` to check if the player's position matches any enemy's position.
- Apply logic for when an enemy is encountered, such as decreasing player health and removing the enemy.
- Print outcomes to the terminal using `System.out.println()`.

```java
public void checkCollision() {
  for (Enemy enemy : enemies) {
    if (player.getXPosition() == enemy.getXPosition() && player.getYPosition() == enemy.getYPosition()) {
      System.out.println("Player collided with an enemy!");
      player.setHealth(player.getHealth() - 1);
      enemies.remove(enemy);
      updateScore(10);
      break;
    }
  }
}
```

#### Exercise 5: Variable Shadowing
Explore and fix any potential *variable shadowing* issues within your game classes and methods.

1. Identify any scenarios where instance fields might be shadowed by local variables.
2. Use the `this` keyword to resolve these issues where applicable.

### 🐞 Bugs and Feedback
If you find any errors or inconsistencies in the exercise materials, please open a [New Issue](https://issue-tracker-link) with the title "Game Task Error: [brief summary]". Your contributions are appreciated!

Build and enjoy your simple game adventure, practicing vital Java skills along the way!