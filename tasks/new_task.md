# 🎮 Simple Java Game: Player vs Enemies

In this task, you will build a simple game in Java. You will learn how to structure your code to implement player movement, a scoring system, and manage interactions with enemies.

### 🎯 Goal
Complete the task by *Friday, November 3rd*.

### 📚 Preparation
You should familiarize yourself with the following Java concepts:

- Classes and Objects
- Constructors
- Instance Fields
- Getters and Setters

The following resources will be helpful:

- [Java Classes and Objects](https://docs.oracle.com/javase/tutorial/java/javaOO/classes.html).
- [Java Constructors](https://docs.oracle.com/javase/tutorial/java/javaOO/constructors.html).

### 📊 Learning Goals

The objectives of this task are:
- Designing Java classes.
- Adding instance fields and constructors.
- Creating getters and setters.
- Printing details to the terminal.
- Understanding scope and variable shadowing.

### 🔧 Troubleshooting
If you encounter any issues:

1. Check the frequently asked questions in the shared document with your classmates.
2. Post your query in the class forum using a descriptive title and explanation.
3. Reach out to a teaching assistant during office hours for additional help.

Remember, discussing with peers is encouraged, but sharing code is not allowed!

### 🏆 Assignment

You're tasked with creating a simple game that includes a player, enemies, and scores. The user must control the player to accumulate points while avoiding or battling enemies.

#### Exercise 1: Define Your Characters
1. Create the following classes:
   - `Player`
   - `Enemy`

#### Exercise 1.1: Player Class

In the `Player` class, include:

- Fields:
  - `String name`
  - `int score`
  - `int health`

Design a constructor to initialize these fields and implement getters and setters.

<details>
  <summary> 🛠 Example Code </summary>

  ```java
  public class Player {
      private String name;
      private int score;
      private int health;

      public Player(String name, int health) {
          this.name = name;
          this.score = 0; // Initial score is 0
          this.health = health;
      }

      public String getName() { return name; }
      public void setName(String name) { this.name = name; }

      public int getScore() { return score; }
      public void setScore(int score) { this.score = score; }

      public int getHealth() { return health; }
      public void setHealth(int health) { this.health = health; }

      public void printInfo() {
          System.out.println("Player: " + name);
          System.out.println("Score: " + score);
          System.out.println("Health: " + health + "\n");
      }
  }
  ```
</details>

#### Exercise 1.2: Enemy Class

In the `Enemy` class, include:

- Fields:
  - `String type`
  - `int power`

Design a constructor, along with getters and setters.

<details>
  <summary> 🛠 Example Code </summary>

  ```java
  public class Enemy {
      private String type;
      private int power;

      public Enemy(String type, int power) {
          this.type = type;
          this.power = power;
      }

      public String getType() { return type; }
      public void setType(String type) { this.type = type; }

      public int getPower() { return power; }
      public void setPower(int power) { this.power = power; }

      public void printInfo() {
          System.out.println("Enemy: " + type);
          System.out.println("Power: " + power + "\n");
      }
  }
  ```
</details>

#### Exercise 2: Implement Player Actions
Create methods in the `Player` class to perform actions:

- `move(int dx, int dy)`: Prints the player’s new position.
- `attack(Enemy enemy)`: Reduces the enemy’s impact on the player and prints the result.

<details>
  <summary> 🛠 Example Code </summary>

  ```java
  public void move(int dx, int dy) {
      // Assuming (0,0) as start position for simplicity
      System.out.println(name + " moved to new position: (" + dx + ", " + dy + ")");
  }

  public void attack(Enemy enemy) {
      int damage = enemy.getPower() / 2;
      this.health -= damage;
      System.out.println(name + " attacked by " + enemy.getType() + " for " + damage + " damage!");
      if (health <= 0) {
          System.out.println(name + " has been defeated!");
      } else {
          score += 10;
          System.out.println(name + " scored 10 points! Total score: " + score);
      }
      printInfo();
  }
  ```
</details>

#### Exercise 3: Main Method and Game Loop
Create a `Game` class with the `main` method to instantiate players and enemies, and simulate movements, attacks, and score accumulation.

<details>
  <summary> 🛠 Example Code </summary>

  ```java
  public class Game {
      public static void main(String[] args) {
          Player player = new Player("Hero", 100);
          Enemy enemy1 = new Enemy("Orc", 20);
          Enemy enemy2 = new Enemy("Goblin", 10);

          player.printInfo();
          enemy1.printInfo();
          enemy2.printInfo();

          // Simulating game actions
          player.move(5, 7);
          player.attack(enemy1);
          player.attack(enemy2);

          player.printInfo();
      }
  }
  ```
</details>

#### Exercise 4: Variable Shadowing
Review how variable shadowing can occur and implement corrections using `this` keyword for clarity. Prepare a code explanation.

<details>
  <summary> 🛠 Example Shadowing Fix </summary>

  ```java
  public class ShadowExample {
      private int count;

      public ShadowExample(int count) {
          this.count = count; // Correctly assigning the instance variable
      }

      public void printShadow() {
          int count = 5; // Local variable with the same name
          System.out.println(this.count); // Referencing the instance variable with `this`
      }
  }
  ```
</details>

### 🐛 Errors?
Report any issues in the shared document—clarifications will help us improve future tasks.