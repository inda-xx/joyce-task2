# 🎮 Simple Game Challenge: Java Adventure 🎲

In this exercise, you'll create a simple game application in Java featuring player movement, a scoring system, and enemy interactions. As you develop this game, you’ll also master key Java programming concepts such as designing classes, using constructors, handling object properties with getters and setters, and understanding scope and variable shadowing.

### 🗓️ Deadline
Make sure you're ready to submit your project by **Friday, 15th December**.

### 📚 Preparation
To get equipped for this exercise, you should go through the following learning materials:

- Complete Module 3 in the OLI Java course on [Understanding Classes](https://kth.oli.cmu.edu/jcourse/webui/syllabus/module.do?context=f5e5a808ac1f088812f2a8ce315bac60).
- If you haven’t done so already, sign up at https://kth.oli.cmu.edu/ with the course key `game-java-ht22`.

### 🎯 Learning Goals

- Designing Java classes
- Adding instance fields
- Adding a constructor method
- Creating *getters* and *setters*
- Printing to the terminal
- Using the `main` method
- Understanding scope and handling variable shadowing

### 💡 Troubleshooting Guide
If you encounter issues during the assignment, follow these steps:

1. Check the [posted issues](https://gits-15.sys.kth.se/game-java/help/issues). 
2. If your issue isn’t listed, create a [New Issue](https://gits-15.sys.kth.se/game-java/help/issues/new) describing your problem.
3. Attend the weekly lab for direct assistance if needed.

Remember, collaboration is encouraged, but sharing code is not allowed!

### 🏆 Assignment: Build Your Game World!

Your mission is to develop a small game application using Java. You'll build character and enemy classes, manage score tracking, and handle player interactions.

#### Exercise 1.0 -- Designing Basic Game Entities
Let's start by modeling a `Player` and an `Enemy` with the following fields:

- `String name`
- `int health`
- `int attackPoints`
- `int defensePoints`
- `boolean defeated`

* Create two new classes `Player` and `Enemy` in your Java project.

<details>
  <summary> 🔨 Example </summary>

  ```java
  public class Player {

      // Fields
      private String name;
      private int health;
      private int attackPoints;
      private int defensePoints;
      private boolean defeated;

      // Add more code for methods below...
  }
  ```

  ```java
  public class Enemy {

      // Fields
      private String name;
      private int health;
      private int attackPoints;
      private int defensePoints;
      private boolean defeated;

      // Add more code for methods below...
  }
  ```
</details>

#### Exercise 1.1 -- Getters and Setters
Implement encapsulation for both classes by setting fields to `private` and creating `getter` and `setter` methods.

<details>
  <summary> 🔍 Code Example </summary>

  ```java
  public class Player {

      // Fields
      private String name;
      private int health;
      private int attackPoints;
      private int defensePoints;
      private boolean defeated;

      // Constructors, getters and setters here...
      
      public String getName() {
          return name;
      }

      public void setName(String name) {
          this.name = name;
      }

      // Add remaining getters and setters...

  }
  ```
</details>

#### Exercise 1.2 -- Constructor Method
Add constructors to initialize your `Player` and `Enemy` objects more efficiently.

<details>
  <summary> ✨ Example of Constructor </summary>

  ```java
  public Player(String name, int health, int attackPoints, int defensePoints) {
      this.name = name;
      this.health = health;
      this.attackPoints = attackPoints;
      this.defensePoints = defensePoints;
      this.defeated = false;
  }
  ```
</details>

#### Exercise 1.3 -- Player Movement and Scoring System
Create a `Game` class with a `main` method. Manage player movements (forward, back) and keep a score:

- Implement basic movement methods in the `Player` class.
- Maintain a score counter in the `Game` class.
- Update and print the score whenever the player moves.

<details>
  <summary> 🎯 Movement Example </summary>

  ```java
  public class Game {

      public static void main(String[] args) {
          Player player = new Player("Hero", 100, 10, 5);
          int score = 0;
          
          // Sample movement logic
          player.moveForward();
          score += 10;

          player.moveBack();
          score -= 5;
          
          System.out.println("Current Score: " + score);
      }
  }

  // In Player class
  public void moveForward() {
      System.out.println(name + " moves forward.");
  }

  public void moveBack() {
      System.out.println(name + " moves backward.");
  }

  ```
</details>

#### Exercise 1.4 -- Enemy Interactions
Implement an `interaction` method where the player can battle an enemy. Adapt your `attack` mechanics from previous understanding.

- The battle reduces health points based on attack and defense.
- If health drops to zero, mark the character as `defeated`.

<details>
  <summary> 🥊 Battle Example </summary>

  ```java
  public void attack(Player opponent) {
      int damage = this.attackPoints - opponent.getDefensePoints();
      if(damage < 0) damage = 0; // Prevent negative damage
      
      opponent.setHealth(opponent.getHealth() - damage);
      System.out.println(this.name + " attacks " + opponent.getName() + " for " + damage + " damage!");

      if(opponent.getHealth() <= 0) {
          opponent.setDefeated(true);
          System.out.println(opponent.getName() + " has been defeated!");
      }
  }
  ```
</details>

#### Exercise 1.5 -- Understanding Scope and Handling Variable Shadowing
Review these examples and identify scope issues and fix variable shadowing using `this` keyword correctly.

```java
public class Example {
    private int number = 42;

    public void displayNumber() {
        int number = 24;
        System.out.println(number); // This should print 42, but it prints 24. Why?
    }
}

public class Creature {
    private String species;
    private int age;

    public Creature(String species, int age) {
        species = species; // This doesn't work as expected. Why?
        age = age;
    }

    public void grow() {
        int age = 100; 
        System.out.println("Age is " + age); // This prints 100. Fix it!
    }
}
```

> **Assistant's Note:** Focus on how local and global variables can be confused and use `this` to reference instance variables correctly.

### 🐾 Find Bugs?

If you notice any errors or inconsistencies, please report through a [New Issue](https://gits-15.sys.kth.se/game-java/help/issues/new) with the title "Task Error: *description*". Your contributions will be acknowledged!

Good luck and have fun building your game!