# 🕹️ Simple Game Application: Player's Quest

For this exercise, you will practice creating a simple game application using Java. You will learn how to design classes representing the fundamental components of a game, such as a player, enemies, and the game's scoring system.

### 🚀 Deadline
Complete this exercise before the workshop on **Wednesday 20th November**.

### 📚 Instructions
For instructions on how to complete and submit the assignment, please refer to the [assignments section of the course instructions](https://gits-15.sys.kth.se/inda-22/course-instructions#assignments).

### 📝 Preparation
Before starting, ensure you have gone through the following resources:

- Read [Understanding Java Classes and Objects](https://docs.oracle.com/javase/tutorial/java/javaOO/classes.html)
- Complete the exercises on [Encapsulation in Java](https://kth.oli.cmu.edu/)

### 🎯 Learning Goals

This assignment will help you achieve the following learning goals:
- Designing Java classes
- Adding instance fields
- Adding a constructor method
- Creating *getters* and *setters*
- Printing to the terminal
- Using the `main` method
- Understanding Scope (including *variable shadowing*)

### 🛠 Troubleshooting Guide
If you face any difficulties or have questions, you should follow this procedure:

1. Check if your issue is addressed in this week's [posted issues](https://gits-15.sys.kth.se/inda-22/help/issues). Learn from others' queries.
2. Should your concern be new, raise a [New Issue](https://gits-15.sys.kth.se/inda-22/help/issues/new). Provide a clear, descriptive title, starting with "Task *x*: *brief summary of problem*."
3. Seek guidance from a TA during the [weekly lab](https://queue.csc.kth.se/Queue/INDA). Refer to your schedule for upcoming lab availability.

Collaborative discussion is encouraged; however, please **do not share answers**!

### 🎮 Assignment

In this task, you'll build a game application in Java featuring a player character, a scoring system, and enemy interactions. Imagine a simple 2D environment where the player can move, earn points, and encounter enemies.

#### Exercise 1 -- Player Class Design
Start by creating a class named `Player.java` in the `src` folder. Define this class with the following fields:

- `String` name
- `int` xPosition
- `int` yPosition
- `int` score

Below is an example to guide your setup:

<details>
  <summary> ✏️ Example 1 </summary>

  ```java
  class Player {

    // Put your fields here!

    public static void main(String[] args) {
      Player hero = new Player();
      hero.name = "Hero";
      hero.xPosition = 0;
      hero.yPosition = 0;
      hero.score = 0;

      System.out.println("Player Name: " + hero.name);
      System.out.println("Position: (" + hero.xPosition + ", " + hero.yPosition + ")");
      System.out.println("Score: " + hero.score);
    }

  }
  ```
</details>

#### Exercise 2 -- Utilizing Getters and Setters
Enhance your `Player` class following encapsulation principles. Make the fields private and provide getters and setters for each. 

<details>
  <summary> ✏️ Example 2 </summary>

  ```java
  class Player {

    // Declare private fields

    // Define getters and setters

    public static void main(String[] args) {
      Player hero = new Player();
      hero.setName("Hero");
      hero.setPosition(0, 0);
      hero.setScore(0);

      System.out.println("Player Name: " + hero.getName());
      System.out.println("Position: (" + hero.getX() + ", " + hero.getY() + ")");
      System.out.println("Score: " + hero.getScore());
    }

  }
  ```
</details>

#### Exercise 3 -- Building a Constructor
Create a constructor for the `Player` class to initialize the player's name and starting coordinates.

<details>
  <summary> ✏️ Example 3 </summary>

  ```java
  class Player {

    // Fields, getters, setters, etc.

    public Player(String name, int x, int y) {
      this.name = name;
      this.xPosition = x;
      this.yPosition = y;
      this.score = 0;
    }

    public static void main(String[] args) {
      Player hero = new Player("Hero", 0, 0);
      // Use player object
    }

  }
  ```
</details>

#### Exercise 4 -- Enemies: Building Interactions
Introduce an `Enemy` class. Like `Player`, this class should handle enemy positions and offer a method that alters the player's score during interaction.

<details>
  <summary> ✏️ Example 4 </summary>

  ```java
  class Enemy {

    // Define fields, e.g., xPosition, yPosition

    public Enemy(int x, int y) {
      // Initialize position
    }

    public void interact(Player player) {
      // Example interaction: decrease player's score
      player.setScore(player.getScore() - 10);
      System.out.println(player.getName() + " encountered an enemy! Score: " + player.getScore());
    }

  }
  ```
</details>

#### Exercise 5 -- Game Mechanics and the `main` Method
Bring everything together in a `Game` class to simulate interactions between a player and enemies. Implement basic movement and scoring updates.

<details>
  <summary> ✏️ Example 5 </summary>

  ```java
  public class Game {

    public static void main(String[] args) {
      Player hero = new Player("Hero", 0, 0);
      Enemy badGuy = new Enemy(5, 5);

      // Simulate player reaching enemy
      hero.setPosition(5, 5);
      badGuy.interact(hero);

      // Display final score
      System.out.println("Final Score: " + hero.getScore());
    }

  }
  ```
</details>

#### Exercise 6 -- Scope and Variable Shadowing
Review the following examples to understand variable shadowing. Prepare to discuss solutions in class.

```Java
public class ShadowExample {
    private int score = 100;

    public void printScore() {
        int score = 50;
        System.out.println(score); // Wrong score printed :( What to do?
    }

    public static void main(String[] args) {
        new ShadowExample().printScore();
    }
}
```

```Java
public class Character {
  private String name;
  private int score;

  public Character(String name, int score) {
    name = name; // Why doesn't this work?
    score = score;
  }

  public void displayName() {
    String name = "John Doe";
    System.out.println(name + " is ready!"); // Prints the wrong name, why?
  }
}
```

> **Assistant's Note:** Consider the distinctions between instance fields, local variables, and the `this` keyword in these examples.

### 🐛 Found anything unusual?
If there are any errors or issues, please report them by opening a [New Issue](https://gits-15.sys.kth.se/inda-22/help/issues/new) titled "Task *x* Error: *brief description*". Bug reporters will be acknowledged and honored appropriately.