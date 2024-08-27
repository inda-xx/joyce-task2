# 🎮 Simple Game: Hero vs Enemies!

For this exercise, you'll be creating a simple game in Java where players can move around, score points, and interact with enemies! This task will help you understand the components of a Java program by modeling game entities as objects.

### 🗓️ Deadline
Complete this task before the lab session on **Friday, 30th September**.

### 📋 Instructions
Refer to the [course submission guidelines](https://gits-15.sys.kth.se/inda-22/course-instructions#assignments) for instructions on how to submit your work.

### 🛠️ Preparation
Before you start, ensure you've reviewed:

- [Classes and Objects in Java](https://docs.oracle.com/javase/tutorial/java/javaOO/index.html)
- Understanding basic [object-oriented concepts](https://kth.oli.cmu.edu/).

### 🎯 Learning Goals

By completing this task, you will:

- Design and implement Java classes
- Add and use instance fields effectively
- Construct objects using constructors
- Create getters and setters for encapsulation
- Implement logic involving printing to the terminal
- Use the `main` method to run Java programs
- Understand the concept of variable scope and avoid variable shadowing

### 🔍 Troubleshooting
If you encounter issues:

1. Check the repository [issues page](https://gits-15.sys.kth.se/inda-22/help/issues) for similar problems.
2. Create a new issue if the problem isn't listed.
3. Consult with your peers, but remember to work individually.

### 🎮 Game Assignment

In this assignment, you'll build a simple game where a `Hero` moves around, earns points, and encounters `Enemy` objects in a grid-based environment.

#### Exercise 1 -- Design the Classes
Create the main Java classes for the game:

- `Hero.java`
- `Enemy.java`
- `Game.java`

These classes will serve various purposes within your game.

#### Exercise 1.1 -- Hero Fields and Constructor
In `Hero.java`, start by defining fields for your hero:

- `String name`
- `int xCoordinate`
- `int yCoordinate`
- `int score`

Add a constructor that initializes these fields.

<details>
  <summary> 🛠 Example Usage </summary>

  ```java
  public class Hero {
      private String name;
      private int xCoordinate;
      private int yCoordinate;
      private int score;

      public Hero(String name, int x, int y) {
          this.name = name;
          this.xCoordinate = x;
          this.yCoordinate = y;
          this.score = 0;
      }
  }
  ```
</details>

#### Exercise 1.2 -- Movement and Scoring
Add methods for hero movement and scoring:

- `move(int dx, int dy)`: Updates hero's position by `dx` and `dy`.
- `increaseScore(int points)`: Adds points to the hero's score.

```java
public void move(int dx, int dy) {
    xCoordinate += dx;
    yCoordinate += dy;
}

public void increaseScore(int points) {
    score += points;
}
```

#### Exercise 2 -- Creating Getters and Setters
Ensure all necessary fields in `Hero` and `Enemy` have getters and setters to maintain encapsulation.

<details>
  <summary> 🛠 Implement getters/setters </summary>

  ```java
  public String getName() {
      return name;
  }

  public void setName(String name) {
      this.name = name;
  }
  
  // Repeat for other fields
  ```
</details>

#### Exercise 3 -- Interaction with Enemies

In `Enemy.java`, define fields and methods for the enemy:

- `int xCoordinate`
- `int yCoordinate`

Implement `interact()` which alters the hero's state (e.g., moving the enemy to a new position).

<details>
  <summary> 🛠 Enemy Interaction </summary>

  ```java
  public class Enemy {
      private int xCoordinate;
      private int yCoordinate;

      public Enemy(int x, int y) {
          this.xCoordinate = x;
          this.yCoordinate = y;
      }

      public void interact(Hero hero) {
          System.out.println("Enemy at (" + xCoordinate + ", " + yCoordinate + ") encountered by " + hero.getName());
          // Implement interaction logic
      }
  }
  ```
</details>

#### Exercise 4 -- Main Method and Scope
In `Game.java`, implement the `main` method to create a hero and enemies and simulate interactions. Consider local and global scope to avoid variable shadowing.

```java
public class Game {
    public static void main(String[] args) {
        Hero hero = new Hero("John", 0, 0);
        Enemy enemy = new Enemy(2, 2);

        hero.move(2, 2);
        enemy.interact(hero);
        hero.increaseScore(100);

        System.out.println("Hero " + hero.getName() + " at (" + hero.getXCoordinate() + ", " + hero.getYCoordinate() + ") with score: " + hero.getScore());
    }
}
```

### 🤔 Reflection on Variable Shadowing
Review the concept with this sample code, where scope causes unexpected behavior:

```java
public class ShadowExample {
    private int memberValue = 1;

    public void modifyMember() {
        int memberValue = 5; // This shadows the class member
        System.out.println("Inside method: " + memberValue);
    }

    public static void main(String[] args) {
        ShadowExample example = new ShadowExample();
        example.modifyMember();
        System.out.println("Class member: " + example.memberValue);
    }
}
```

### 🕵️‍♂️ Spot Bugs
If you spot a bug or discrepancy, report it in the [New Issue](https://gits-15.sys.kth.se/inda-22/help/issues/new) section for potential credit in the acknowledgments!

Good luck, and have fun building your game! 🎯