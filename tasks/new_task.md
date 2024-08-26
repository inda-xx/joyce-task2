# 🎮 Simple Java Game: Player vs Enemies!

Welcome to your thrilling journey in creating a simple game using Java! In this task, you will learn vital concepts related to Java programming by designing and implementing a basic game. This game will allow player movements, manage a scoring system, and handle enemy interactions.

### 📅 Deadline
Complete your assignment by **Friday, 16th September**.

### 📚 Instructions
Refer to the [course assignment page](https://gits-15.sys.kth.se/inda-22/course-instructions#assignments) for submission protocols and additional resources.

### 🧠 Preparation
Before diving into the coding exercises, ensure you understand the following concepts:

- [Introduction to Java Classes](https://docs.oracle.com/javase/tutorial/java/javaOO/classes.html)
- [Using Objects](https://docs.oracle.com/javase/tutorial/java/javaOO/usingobject.html)

> **Note:** Reviewing additional materials will enhance your understanding and make the exercises more manageable.

### 🎯 Learning Goals

This assignment will strengthen your proficiency in:
* Designing Java classes
* Adding instance fields
* Implementing a constructor method
* Creating *getters* and *setters*
* Printing to the terminal
* Using the `main` method
* Understanding scope (or *variable shadowing*)

### 🔧 Troubleshooting Guide
For any queries:

1. Check this week's [posted issues](https://gits-15.sys.kth.se/inda-22/help/issues).
2. Post your question by creating a new [issue](https://gits-15.sys.kth.se/inda-22/help/issues/new).
3. Seek support during the [weekly lab sessions](https://queue.csc.kth.se/Queue/INDA), if needed.

Remember to discuss with classmates but refrain from sharing exact solutions.

### 🎮 Assignment: Develop Your Own Game

You will build a simple game consisting of a player and enemies, in which the player can move, interact with enemies, and maintain a score.

#### Exercise 1.0 -- Design the Player Class
In the `src` folder, create a new class called `Player.java`. This class will have the following fields:

- `String` playerName
- `int` score
- `int[]` position (representing x and y coordinates)
- `boolean` isAlive

In this class, write a `main` method to create a `Player` object, initialize its fields, and print them to the console. Use Example 1 for reference.

<details>
  <summary> 🛠 Example 1 </summary>

  ```java
  class Player {

    String playerName;
    int score;
    int[] position;
    boolean isAlive;

    public static void main(String[] args) {
      Player p1 = new Player();

      p1.playerName = "Hero";
      p1.score = 0;
      p1.position = new int[]{0, 0}; // starting at origin
      p1.isAlive = true;

      System.out.println("Player Name: " + p1.playerName);
      System.out.println("Score: " + p1.score);
      System.out.println("Position: " + "(" + p1.position[0] + ", " + p1.position[1] + ")");
      System.out.println("Is Alive: " + p1.isAlive);
    }

  }
  ```
</details>

#### Exercise 1.1 -- Implement Getters and Setters
To encapsulate the fields in your `Player` class, set them to `private` and create their respective getters and setters.

If successful, the adjustments will allow the sample main method in Example 2 to compile.

<details>
  <summary> 🛠 Example 2 </summary>

  ```java
  class Player {

    private String playerName;
    private int score;
    private int[] position;
    private boolean isAlive;

    public String getPlayerName() {
      return playerName;
    }

    public void setPlayerName(String playerName) {
      this.playerName = playerName;
    }

    public int getScore() {
      return score;
    }

    public void setScore(int score) {
      this.score = score;
    }

    public int[] getPosition() {
      return position;
    }

    public void setPosition(int[] position) {
      this.position = position;
    }

    public boolean isAlive() {
      return isAlive;
    }

    public void setAlive(boolean isAlive) {
      this.isAlive = isAlive;
    }

    public static void main(String[] args) {
      Player p1 = new Player();

      p1.setPlayerName("Hero");
      p1.setScore(0);
      p1.setPosition(new int[]{0, 0});
      p1.setAlive(true);

      System.out.println("Player Name: " + p1.getPlayerName());
      System.out.println("Score: " + p1.getScore());
      System.out.println("Position: " + "(" + p1.getPosition()[0] + ", " + p1.getPosition()[1] + ")");
      System.out.println("Is Alive: " + p1.isAlive());
    }

  }
  ```
</details>

#### Exercise 1.2 -- Player Constructor
Implement a constructor in the `Player` class that initializes the player's name and position upon creation. Then update the `main` method provided in Example 2 to use your new constructor.

#### Exercise 1.3 -- Move Method
Develop a `move` method that changes the player's position on the board. It should accept `x` and `y` as arguments to update the player's current position.

<details>
  <summary> 🛠 Example 3 </summary>

  ```java
  public static void main(String[] args){
    Player hero = new Player("Hero", new int[]{0, 0});
    hero.move(5, 3);
    System.out.println("New Position: " + "(" + hero.getPosition()[0] + ", " + hero.getPosition()[1] + ")");
  }
  ```

  Expected output:
  ```
  > New Position: (5, 3)
  ```
</details>

#### Exercise 1.4 -- Implement Enemy Class
Create an `Enemy.java` class with these fields:

- `String` enemyName
- `int` damage
- `int[]` position

Generate getters and setters for these fields, and construct the class using a suitable constructor.

#### Exercise 1.5 -- Enemy Interaction
Add an `interactWithEnemy` method in the `Player` class. This will take an `Enemy` object as an argument. If the player's position matches an enemy's position, the player loses a life. Update the player's score based on this interaction.

<details>
  <summary> 🛠 Example 4 </summary>

  ```java
  public static void main(String[] args){
    Player hero = new Player("Hero", new int[]{0, 0});
    Enemy villain = new Enemy("Villain", 10, new int[]{0, 0});

    hero.interactWithEnemy(villain);
    System.out.println("Player Lives: " + hero.isAlive());
  }
  ```

  Expected output:
  ```
  > Player Lives: false
  ```
</details>

#### Exercise 1.6 -- Scope and Variable Shadowing
Understand the concept by fixing potential issues in Example 5 below where variable names overlap, causing scope confusion.

```Java
class ScopeExample {
    private int value = 10;

    public void show() {
        int value = 20;
        System.out.println(value); // outputs the wrong value
        System.out.println(this.value); // use 'this' to access the correct field
    }
}
```

### 🐛 Bugs and Errors?
Notify us via a [New Issue](https://gits-15.sys.kth.se/inda-22/help/issues/new) with the title "Task 1 Error: [brief description here]". We appreciate your discoveries and participation!