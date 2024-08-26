# 🎮 Simple Java Game Development

In this exercise, you'll create a basic game application in Java. This game will allow you to model simple player movement, manage a scoring system, and handle enemy interactions. Through this project, you'll get hands-on experience with designing Java classes, implementing basic functionalities, and understanding important programming concepts.

### 💀 Deadline
Please complete this task by **Friday 30th September**.

### 👩‍🏫 Instructions
Follow the guidelines available in the [course instruction section](https://gits-15.sys.kth.se/inda-22/course-instructions#assignments) to submit your assignment.

### 📝 Preparation
Make sure to complete the OLI material for Module 3 before starting the assignment.

- Read [Designing Classes and Interfaces](https://kth.oli.cmu.edu/jcourse/webui/syllabus/module.do?context=f5e5a808ac1f088812f2a8ce315bac61)
- Use your course key `dd1337-ht22` to register if you haven't yet

### ✅ Learning Goals
After completing this assignment, you should be able to:

- Design Java classes with various components
- Add instance fields to represent object attributes
- Implement constructor methods for initializing objects
- Write getters and setters for accessing and modifying fields
- Print game elements and states to the terminal
- Use the main method as an entry point for your application
- Understand scope and learn to avoid variable shadowing

### 🚨 Troubleshooting Guide
Encounter a problem? Follow these steps:

1. Review this week's [posted issues](https://gits-15.sys.kth.se/inda-22/help/issues). Already raised by peers?
2. If not, create a [New Issue](https://gits-15.sys.kth.se/inda-22/help/issues/new). Use a descriptive title like "Task: *summary of problem*".
3. Consult with a TA during scheduled [weekly lab](https://queue.csc.kth.se/Queue/INDA).

Discuss the tasks with fellow students but remember: **do not share complete solutions!**

### 🏛 Assignment

Dive into the world of game development by creating a simple game with a player who can move, collect points, and interact with enemies. Your main focus will be practicing Java programming by implementing these exercises:

#### Exercise 3.0 -- Player Class
Create a `Player.java` class in your `src` folder. This class should have the following fields:

- `String` name
- `int` score
- `int[]` position (`x`, `y` coordinates)
- `boolean` isAlive

If implemented correctly, the Example 1 code will run successfully.

<details>
  <summary> 🛠 Example 1 </summary>

  ```java
  public class Player {
  
    // Declare fields here

    public static void main(String[] args) {
      Player john = new Player();

      // Set initial values
      john.name = "John";
      john.score = 0;
      john.position = new int[] {0, 0};
      john.isAlive = true;

      // Output player's initial state
      System.out.println("Player: " + john.name);
      System.out.println("Score: " + john.score);
      System.out.println("Position: (" + john.position[0] + ", " + john.position[1] + ")");
      System.out.println("Is Alive: " + john.isAlive);
    }
  }
  ```
</details>

#### Exercise 3.1 -- Getters and Setters
Implement getters and setters for encapsulation. All fields must be private, and manipulations should be through these methods. Ensure that Example 2 compiles with these implementations.

<details>
  <summary> 🛠 Example 2 </summary>

  ```java
  public class Player {

    // Declare fields and getters/setters here

    public static void main(String[] args) {
      Player john = new Player();
      
      // Set the values using setters
      john.setName("John");
      john.setScore(10);
      john.setPosition(new int[] {1, 3});

      // Get the values using getters
      System.out.println("Player: " + john.getName());
      System.out.println("Score: " + john.getScore());
      System.out.println("Position: (" + john.getPosition()[0] + ", " + john.getPosition()[1] + ")");
    }
  }
  ```
</details>

#### Exercise 3.2 -- Constructor
Automate player initialization with a constructor. Update your Example 2 to demonstrate this practice.

#### Exercise 3.3 -- Enemy Interactions
Design an `Enemy.java` class with fields:

- `String` type
- `int[]` position
- `boolean` isActive

Update the `Player` class to enable interactions. Implement an `interactWithEnemy` method to check if the enemy is in the same position as the player and handle the score or player's life.

#### Exercise 3.4 -- Scoring
Implement a scoring system:

- On neutral interaction with an enemy, gain 5 points.
- Avoid harmful interactions, or lose the game.

<details>
  <summary> 🛠 Example 4 </summary>

  ```java
  public class Player {

    public void interactWithEnemy(Enemy enemy) {
      if (Arrays.equals(this.position, enemy.getPosition())) {
        if (enemy.isActive()) {
          this.isAlive = false;
          System.out.println("You Lose!");
        } else {
          this.score += 5;
          System.out.println("Score: " + this.score);
        }
      }
    }
    
    public static void main(String[] args) {
      Player john = new Player("John", new int[] {0, 0});
      Enemy goblin = new Enemy("Goblin", new int[] {0, 0}, true); // Active enemy
      
      john.interactWithEnemy(goblin);
    }
  }
  ```
</details>

#### Exercise 3.5 -- Variable Shadowing
Study the variable shadowing examples. Analyze and fix them. Be prepared to discuss in class.

```Java
public class GameShadowing {
    private int level = 1; // Expecting this level
    
    public void startNewLevel() {
        int level = 5;
        System.out.println("Current level: " + level); // Wrong level printed! :(
    }
    
    public static void main(String[] args){
        new GameShadowing().startNewLevel();
    }
}
```

Another example:

```Java
public class Enemy {
    private String type;

    public Enemy(String type) {
        type = type; // Why doesn't this work?
    }

    public void displayType() {
        String type = "Unknown";
        System.out.println("Enemy Type: " + type); // Incorrect type displayed :(
    }
}
```

> **Assistant's Note:** Review concepts of scope, local and global variables, and use of the `this` keyword.

### 🐞 Bug Reporting
Find bugs or errors in this exercise? Open a [New Issue](https://gits-15.sys.kth.se/inda-22/help/issues/new) titled "Task Error: *summary of error here*". Bug reports get mentions in acknowledgements!