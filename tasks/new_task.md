# 🎮 Simple Java Game Development: Dodger's Adventure

For this exercise, you are going to dive into game development by creating a simple Java game named "Dodger's Adventure". This game will help you understand fundamental object-oriented programming concepts in Java.

### 💣 Deadline
This assignment should be completed by **Friday 23rd September**.

### 🎮 Instructions
For detailed instructions on how to submit the assignment, please visit the [assignments section of the course instructions](https://gits-15.sys.kth.se/inda-23/course-instructions#assignments).

### 📚 Preparation
Before starting, make sure you read the following module from our OLI resources:

- [Java Classes and Objects Basics](https://kth.oli.cmu.edu/jcourse/webui/syllabus/module.do?context=def01234567890abcdef)
  
Don't forget to register at https://kth.oli.cmu.edu/ using the course key `dd1337-ht23` if you have not already.

### 🎯 Learning Goals

The learning objectives you will cover this week include:
* Designing Java classes
* Adding instance fields
* Adding a constructor method
* Creating *getters* and *setters*
* Printing to the terminal
* Using the `main` method
* Understanding scope and *variable shadowing*

### 🔍 Troubleshooting Guide
If you encounter any issues, follow these steps:

1. Review this week's [posted issues](https://gits-15.sys.kth.se/inda-23/help/issues) to see if others have had the same problem.
2. If your problem is unique, create a new [New Issue](https://gits-15.sys.kth.se/inda-23/help/issues/new). Start your title with "Task *x*: *brief problem description*".
3. Consult a TA during the [weekly lab](https://queue.csc.kth.se/Queue/INDA). Check the schedule for lab times.

Discussing with classmates is encouraged, but **do not share solutions**!

### 🏁 Assignment

Welcome to "Dodger's Adventure"! Your mission is to build a simple terminal-based game application in Java where a player moves through a game environment while avoiding enemies and collecting points.

#### Exercise 1: Class Design and Fields

Create a new class named `Player.java` within the `src` directory. This class will represent the player character in the game. Define the following fields:

- `String name`
- `int position` (Representing the player's position in the game grid)
- `int score`

Next, create another class called `Enemy.java` with the following fields:

- `String type` (e.g., "Goblin", "Troll")
- `int position`

Finally, design a class named `Game.java` with these fields:

- `Player player`
- `ArrayList<Enemy> enemies` (to store multiple enemies)

#### Exercise 2: Constructor Methods

Implement constructors for each class:

- `Player(String name, int position)`
- `Enemy(String type, int position)`
- `Game(Player player)`

Create a `Game` object and a `Player` object in an updated `main` method in `Game.java`.

#### Exercise 3: Getters and Setters

For each class, implement *getters* and *setters* for their fields. This ensures encapsulation and access control.

#### Exercise 4: Movement Mechanics

Add a method to `Player` class called `move(int steps)` that updates the player’s position. Also, add a simple logic in the `main` method to invoke this method and print the player's new position.

<details>
  <summary> 🛠 Example 1 </summary>

  ```java
  public static void main(String[] args) {
      Player player = new Player("Hero", 0);
      Game game = new Game(player);

      player.move(5); // Move player forward 5 steps
      System.out.println("Player's new position: " + player.getPosition());
  }
  ```

  Expected output:
  ```
  Player's new position: 5
  ```
</details>

#### Exercise 5: Collision and Scoring

In the `Game` class, implement a method `updateScoreAndCheckCollisions()` that checks if a player has moved to the same position as any enemy in the `enemies` list. If so, print a collision message; otherwise, increment the player's score.

<details>
  <summary> 🛠 Example 2 </summary>

  ```java
  public void updateScoreAndCheckCollisions() {
      boolean collision = false;
      
      for(Enemy enemy : enemies) {
          if (player.getPosition() == enemy.getPosition()) {
              System.out.println("Collision with " + enemy.getType() + "!");
              collision = true;
              break;
          }
      }
      
      if (!collision) {
          player.setScore(player.getScore() + 10);
          System.out.println("Score: " + player.getScore());
      }
  }
  ```

  Test in `main`:
  ```java
  Enemy goblin = new Enemy("Goblin", 5);
  game.getEnemies().add(goblin);
  game.updateScoreAndCheckCollisions();
  ```
</details>

#### Exercise 6: Scope and Variable Shadowing

Reflect on the `Player` class's `move` and `updateScoreAndCheckCollisions` methods. Create a scenario with variable shadowing.

For example, explain how using variable names like `position` could lead to errors or misunderstandings. Use the keyword `this` to clarify which `position` is being modified.

```java
public void move(int position) {
    this.position += position;
}
```

#### Reflective Exercise

Think about cases where variable shadowing could make your code harder to read and maintain. Document these instances and suggest improvements using the `this` keyword or by renaming variables for clarity.

### 🛠 Bugs and Feedback?

If you notice errors or inconsistencies in this exercise, open a [New Issue](https://gits-15.sys.kth.se/inda-23/help/issues/new) with a title like "Task Error: *brief description of issue*". We appreciate your feedback and will acknowledge contributors in future course materials.

Good luck with "Dodger's Adventure"! 🎮