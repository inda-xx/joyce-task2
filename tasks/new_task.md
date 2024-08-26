# 🎮 Simple Java Game: Let's Create a Mini Adventure!

For this engaging exercise, you will design and code a simple mini-game application in Java. You will practice and improve your skills in object-oriented programming by working with classes, methods, and encapsulation, while creating a basic interactive game with player movement, scoring, and enemy interactions.

### 💀 Deadline
Complete this exercise and submit your solution by **Friday, 22nd September**.

### 👩‍🏫 Instructions
Refer to the [course assignment instructions](https://your-course-link/assignments) for details on how to submit your work.

### 📝 Preparation
Before you start, make sure to:

- Review topics from Module 1 and Module 2.
- Study [Creating Classes and Objects](https://docs.oracle.com/javase/tutorial/java/javaOO/index.html).
- Sign up and log in to [Course Platform](https://your-course-login).

### ✅ Learning Goals

This mini-game project encourages you to:
* Design Java classes for different game elements
* Add instance fields to manage game state
* Add constructor methods for initializing objects
* Implement getters and setters for field access
* Print helpful game information to the terminal
* Use the main method effectively to run your application
* Understand and avoid variable shadowing issues

### 🚨 Troubleshooting Guide
If you encounter any issues, follow these steps:

1. Check out [this week's class issues](https://your-course-link/issues) to see if others have similar problems.
2. If your problem is unlisted, open a new issue in [New Issue](https://your-course-link/issues/new), with a descriptive title like "Task *x*: *description*".
3. Seek help from peers or TAs during [lab sessions](https://schedule.link).

Feel free to brainstorm with classmates, but remember: **do not share complete solutions**!

### 🎯 Assignment

Welcome to the world of adventure! Your task is to build a basic game application using Java. You will program classes for a `Player`, an `Enemy`, and a `Game`. Below you will find the necessary exercises and guidelines to create each part. Get ready to dive into Object-Oriented Programming!

#### Exercise 1.0 -- Game Setup
Create a `Player` class in the `src` folder. Your player will have simple move and score functionalities. Implement the following fields:

- `String` name
- `int` score
- `int` positionX
- `int` positionY

<details>
  <summary> 🎲 Example </summary>

  ```java
  class Player {
    // Add your fields here
    private String name;
    private int score;
    private int positionX;
    private int positionY;

    public static void main(String[] args) {
      Player hero = new Player();
      hero.name = "Hero";
      hero.score = 0;
      hero.positionX = 0;
      hero.positionY = 0;

      System.out.println("Player: " + hero.name + " starts at position (" 
                         + hero.positionX + "," + hero.positionY + ")");
    }
  }
  ```
</details>

#### Exercise 1.1 -- Getters and Setters
Ensure encapsulation for your `Player` attributes by making them `private` and creating getter and setter methods for each field. If done correctly, the following code should work:

<details>
  <summary> 🎮 Example </summary>

  ```java
  class Player {
    // Add private fields, getters, and setters here

    public static void main(String[] args) {
      Player hero = new Player();
      hero.setName("Hero");
      hero.setPosition(5, 10);

      System.out.println("Player: " + hero.getName() + " is at position (" 
                         + hero.getPositionX() + "," + hero.getPositionY() + ")");
    }
  }
  ```
</details>

#### Exercise 1.2 -- Constructor
Implement a constructor for the `Player` class to instantiate objects with attributes directly, streamlining object initialization. Repeat the previous example using this constructor:

<details>
  <summary> ⚔️ Example </summary>

  ```java
  public Player(String name, int startX, int startY) {
    this.name = name;
    this.positionX = startX;
    this.positionY = startY;
    this.score = 0;
  }
  ```

  ```java
  public static void main(String[] args) {
    Player hero = new Player("Hero", 5, 10);
    System.out.println(hero.getName() + " starts at (" 
                       + hero.getPositionX() + "," + hero.getPositionY() + ")");
  }
  ```
</details>

#### Exercise 2.0 -- Enemy Class
Construct an `Enemy` class with these fields:

- `String` type
- `int` strength
- `int` positionX
- `int` positionY

Add constructor, getters, and setters similar to the `Player` class.

<details>
  <summary> 👾 Example </summary>

  ```java
  class Enemy {
    // Add fields, constructor, getters and setters here

    public static void main(String[] args) {
      Enemy goblin = new Enemy("Goblin", 3, 8, 10);
      System.out.println("Enemy: " + goblin.getType() + " is at (" 
                         + goblin.getPositionX() + "," + goblin.getPositionY() + ")");
    }
  }
  ```
</details>

#### Exercise 3.0 -- Game Logic and Movement
Design a simple `Game` class that manages the game loop. Include logic for player movements (e.g., north, south, east, west) and interaction with enemies. Implement a method to print game state.

<details>
  <summary> 🕹 Example </summary>

  ```java
  class Game {
    private Player player;
    private List<Enemy> enemies;

    public Game(Player player) {
      this.player = player;
      this.enemies = new ArrayList<Enemy>();
    }

    public void movePlayer(String direction) {
      switch (direction.toLowerCase()) {
        case "north": player.setPosition(player.getPositionX(), player.getPositionY() + 1); break;
        case "south": player.setPosition(player.getPositionX(), player.getPositionY() - 1); break;
        case "east": player.setPosition(player.getPositionX() + 1, player.getPositionY()); break;
        case "west": player.setPosition(player.getPositionX() - 1, player.getPositionY()); break;
        default: System.out.println("Invalid direction!");
      }
    }

    public void printGameState() {
      System.out.println("Player location: (" + player.getPositionX() + "," + player.getPositionY() + ")");
      // Add logic for enemy positions and interactions here
    }

    public static void main(String[] args) {
      Player hero = new Player("Hero", 0, 0);
      Game game = new Game(hero);

      game.movePlayer("north");
      game.printGameState();
    }
  }
  ```
</details>

#### Exercise 4.0 -- Interactions and Scoring
Further develop the game mechanics, allowing the `Player` to interact with `Enemies`, perhaps earning points upon defeating them. Use setters to update scores.

#### Exercise 5.0 -- Variable Shadowing
Demonstrate understanding of scope and variable shadowing. Analyze the following shadowing example and think how to amend it using the `this` keyword.

```java
public class GameShadow {
    private String title = "Shadow Adventure";

    public void printTitle() {
        String title = "Local Adventure";
        System.out.println(title); // Prints: Local Adventure
    } 

    public static void main(String[] args) {
        new GameShadow().printTitle(); // How can you print "Shadow Adventure"?
    }
}
```

> **Assistant’s Note:** Contrast local variables and instance fields using the `this` reference to resolve shadowing.

### 🐞 Have you found bugs or issues?
If you spot any mistakes or bugs in these instructions, use the [New Issue](https://your-course-link/issues/new) page. Contributions to finding bugs may get you special mentions!