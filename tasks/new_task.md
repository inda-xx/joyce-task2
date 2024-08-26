# 🕹️ Simple Java Game: Battle the Enemies!

For this project, you will harness your Java skills to create a simple text-based game. The objective is to manage a player's movement, implement a scoring system, and create interactions with enemies. This exercise will sharpen your object-oriented programming skills and familiarize you with fundamental concepts in Java. 

### 💀 Deadline
Complete this assignment by **Friday, 16th September** for lab evaluation.

### 👩‍🏫 Instructions
Detailed instructions for submission are provided on the [course instruction page](https://gits-15.sys.kth.se/inda-22/course-instructions#assignments).

### 📝 Preparation
Before embarking on this task, complete the required readings in the OLI Module 2. This will equip you with a foundational understanding of Java classes:

- [From Classes to Objects](https://kth.oli.cmu.edu/jcourse/webui/syllabus/module.do?context=f5e5a808ac1f088812f2a8ce315bac60)

> **Assistant’s Note:** While the main course material is essential, do advance reading if required concepts appear unfamiliar.

### ✅ Learning Goals

Completing this task will help you achieve the following learning goals:

* Designing Java classes
* Adding instance fields
* Adding a constructor method
* Creating *getters* and *setters*
* Printing outputs in the terminal
* Utilizing the `main` method
* Understanding variable scope and shadowing

### 🚨 Troubleshooting Guide
For queries or technical assistance, follow these steps:

1. Review this week's [posted issues](https://gits-15.sys.kth.se/inda-22/help/issues).
2. If unresolved, post your query by creating a [New Issue](https://gits-15.sys.kth.se/inda-22/help/issues/new). Include a clear title starting with "Task *x*: *your issue*".
3. Consult a TA at the [weekly lab](https://queue.csc.kth.se/Queue/INDA). Refer to your schedule for lab timings.

Collaboration with classmates is encouraged, but please ensure **individual work submission**.

### 🎮 Assignment: Build Your Game!

Create your own basic game environment at the storied campus of the Royal Institute of Technology in Stockholm. The game will involve a player navigating through the map, interacting with enemies, and collecting points as they attempt to survive the perilous campus grounds.

#### Exercise 1.0 -- Designing Core Classes
In the [`src`](src) folder, set up classes to represent the Player, Enemy, and GameMap objects. 

Each class should have:

**Player:**
- `String` playerName
- `int` score
- `int` health

**Enemy:**
- `String` enemyType
- `int` health
- `int` damageLevel

**GameMap:**
- `char[][]` mapLayout to visualize the grid/map

Your main method should instantiate these objects and compile successfully.

<details>
  <summary> 🛠 Exercise 1.0 Template </summary>

  ```java
  class Player {
      // Fields for the Player class
      String playerName;
      int score;
      int health;
      
      // ...add methods and constructors here
  }

  class Enemy {
      // Fields for the Enemy class
      String enemyType;
      int health;
      int damageLevel;
      
      // ...add methods and constructors here
  }

  class GameMap {
      // Fields for the GameMap class
      char[][] mapLayout;
      
      // ...add methods and constructors here
  }

  public class Game {
      public static void main(String[] args) {
          // Create instances of Player, Enemy, and GameMap
          Player player = new Player();
          Enemy enemy = new Enemy();
          GameMap gameMap = new GameMap();
          
          // ...game logic here
          
          System.out.println("Welcome to the Game!");
      }
  }
  ```
</details>

#### Exercise 1.1 -- Methods for Interaction
Implement methods for each class for interaction.

**Player Class:**
- Move up, down, left, or right on the map (`moveUp()`, `moveDown()`, `moveLeft()`, `moveRight()`)
- Encounter with an enemy: lose health and print the status to the terminal

**Enemy Class:**
- Attack the player and print the damage on the player

**GameMap Class:**
- Create a simple 5x5 grid as a character array
- Print the current map status with player and enemies positioned

<details>
  <summary> 🛠 Exercise 1.1 Sample Usage </summary>

  ```java
  Player player = new Player("Hero", 0, 100);
  Enemy goblin = new Enemy("Goblin", 30, 10);

  player.moveUp(); // Update player's position
  goblin.attack(player); // Enemy attacks player
  
  GameMap gameMap = new GameMap();
  gameMap.printMap(); // Show current map layout
  
  System.out.println(player.getName() + " Scores: " + player.getScore());
  ```
</details>

#### Exercise 1.2 -- Scoring System
Enrich your Player class with a scoring system. Award points for successfully avoiding enemies or achieving a goal (like reaching a certain map position). Implement relevant methods for updating and retrieving scores.

<details>
  <summary> 🛠 Exercise 1.2 Sample Scoring </summary>

  ```java
  class Player {
      // Already existing fields
      
      // Method to add score
      public void increaseScore(int points) {
          this.score += points;
          System.out.println("Score increased by " + points + ". Total Score: " + this.score);
      }
  }
  ```
</details>

#### Exercise 1.3 -- Constructor and Access control
Improve each class by adding constructors to initialize objects with specific attributes. Employ encapsulation by making fields `private` and adding getter and setter methods.

<details>
  <summary> 🛠 Exercise 1.3 Constructors Example </summary>
  
  ```java
  class Player {
      private String playerName;
      private int score;
      private int health;

      // Constructor
      public Player(String playerName, int score, int health) {
          this.playerName = playerName;
          this.score = score;
          this.health = health;
      }
      
      // Getter for playerName
      public String getPlayerName() {
          return playerName;
      }
      
      // Additional getters and setters...
  }
  ```
</details>

#### Exercise 1.4 -- Game Initialization
Using the main method, bring your game to life by initializing the game map, placing players and enemies, and starting interactions.

<details>
  <summary> 🛠 Exercise 1.4 Game Interaction Example </summary>
  
  ```java
  public static void main(String[] args) {
      // Create and configure game objects
      Player hero = new Player("Hero", 0, 100);
      Enemy dragon = new Enemy("Dragon", 100, 15);

      // Initialize game map
      GameMap map = new GameMap();
      
      // Print initial game status
      map.printMap();
      System.out.println("Game started! Good luck, " + hero.getPlayerName());
      
      // Interaction sample
      hero.moveRight();
      dragon.attack(hero);
  }
  ```
</details>

#### Exercise 1.5 -- Scope and Variable Shadowing
Explore how variable shadowing might impact your game. Examine and fix any shadowing in your game classes making use of the `this` keyword where necessary.

```java
class Score {
    private int totalScore = 50; // Outermost score

    public void addBonus(int totalScore) {
        totalScore += 20; // Shadows the instance variable
        System.out.println("Total Score inside method: " + totalScore);
    }
    
    public void showTotalScore() {
        System.out.println("Actual Total Score: " + this.totalScore);
    }
}
```

> **Assistant's Note:** Understand the implications of the `this` keyword as you fix shadowing and improve your code.

### 🐞 Bugs and Errors?
Should you uncover any errors or experience issues as you progress through this task, please open a [New Issue](https://gits-15.sys.kth.se/inda-22/help/issues/new) with the subject "Task *x* Error: *issue summary*". Your contribution to refining the exercise will help future students.