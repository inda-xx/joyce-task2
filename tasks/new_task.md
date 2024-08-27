# 🎮 Simple Game Adventure

Welcome to the Simple Game Adventure task! In this assignment, you will create a basic game application that entails player movement, scoring, and enemy interactions. This task will help you deepen your understanding of Java classes and object-oriented programming concepts.

### 👨‍🎓 Learning Goals

Through this task, you will learn to:
- Design Java classes
- Add instance fields
- Implement a constructor method
- Create getters and setters
- Print to the terminal
- Utilize the `main` method
- Understand scope and variable shadowing

### 📅 Deadline
Please complete this assignment by **Friday, October 20th**.

### 📖 Preparation

Before you dive in, make sure to review the following materials to solidify your understanding:

- [Java Classes Overview](https://docs.oracle.com/javase/tutorial/java/javaOO/classes.html)
- [Encapsulation in OOP](https://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html)

---

### 🕹️ Assignment Description

In this game, you will simulate a mini-world with a player that can move, score points, and interact with enemies. Follow the exercises to build your game world step-by-step.

#### Exercise 1: Designing the Game World

1. **Create the Player Class**

   In the `src` folder, create a new Java class named `Player.java`. Implement the following fields:

   - `String name`
   - `int score`
   - `int xPos` (for x-coordinate movement)
   - `int yPos` (for y-coordinate movement)

   Reference Example 1 below for implementation guidance.

   <details>
     <summary> 🛠 Example 1: Designing Player Class </summary>

   ```java
   public class Player {
     private String name;
     private int score;
     private int xPos;
     private int yPos;

     // Getter and setter methods go here
   }
   ```
   </details>

2. **Implement Getters and Setters**

   Add getter and setter methods for each field. Ensure all fields are private for encapsulation.

   <details>
     <summary> 🛠 Example 2: Implementing Getters and Setters </summary>

   ```java
   public String getName() {
     return name;
   }

   public void setName(String name) {
     this.name = name;
   }

   public int getScore() {
     return score;
   }

   public void setScore(int score) {
     this.score = score;
   }

   // Additional getters and setters for xPos and yPos
   ```
   </details>

3. **Create a Player Constructor**

   Implement a constructor for the `Player` class to initialize all fields.

   <details>
     <summary> 🛠 Example 3: Player Constructor </summary>

   ```java
   public Player(String name, int x, int y) {
     this.name = name;
     this.score = 0;
     this.xPos = x;
     this.yPos = y;
   }
   ```
   </details>

---

#### Exercise 2: Implementing Game Logics

4. **Enemy Class**

   Create another class called `Enemy.java` with the following fields:

   - `String type`
   - `int xPos`
   - `int yPos`

   Provide constructors, getters, and setters.

5. **Player Movement and Interactions**

   Implement methods in the `Player` class for moving the player and interacting with enemies:

   - `void move(int deltaX, int deltaY)`: Update player's position based on input.

   - `void interact(Enemy enemy)`: Check for collision and interact with the enemy.

   <details>
     <summary> 🛠 Example 4: Player Interactions </summary>

   ```java
   public void move(int deltaX, int deltaY) {
     this.xPos += deltaX;
     this.yPos += deltaY;
   }

   public void interact(Enemy enemy) {
     // Check if player's position matches the enemy's position
     if (this.xPos == enemy.getXPos() && this.yPos == enemy.getYPos()) {
       System.out.println(this.name + " has encountered a " + enemy.getType() + "!");
       // Interaction logic (e.g., increase score, defeat enemy)
     }
   }
   ```
   </details>

6. **Scoring System**

   Update the `interact()` method to modify the player's score based on enemy type.

   <details>
     <summary> 🛠 Example 5: Scoring System </summary>

   ```java
   public void interact(Enemy enemy) {
     if (this.xPos == enemy.getXPos() && this.yPos == enemy.getYPos()) {
       System.out.println(this.name + " has encountered a " + enemy.getType() + "!");
       this.score += 10; // Example logic for scoring
     }
   }
   ```
   </details>

---

#### Exercise 3: Running Your Game

7. **Main Method to Simulate Gameplay**

   Write the `main` method in a `Game.java` class to simulate player movement and interactions within your game.

   <details>
     <summary> 🛠 Example 6: Main Method Simulation </summary>

   ```java
   public class Game {
     public static void main(String[] args) {
       Player player = new Player("Hero", 0, 0);
       Enemy goblin = new Enemy("Goblin", 1, 0);

       player.move(1, 0); // Move right
       player.interact(goblin);

       System.out.println("Score: " + player.getScore());
     }
   }
   ```
   </details>

Ensure to test edge cases in interactions, such as moving outside boundaries or repeated encounter scores.

### 🎯 Completion

Ensure you have implemented all classes and methods as described. Test your game thoroughly and make improvements as needed.

### 🐞 Troubleshooting & FAQs

- **Issues with Method Invocation:** Ensure that object fields are properly initialized before use.
- **Incorrect Score Calculation:** Double-check the logic within your `interact()` method.

### 🚀 Wrapping Up

Once you have completed your task, share your experience and reflect on areas that you found challenging or intriguing!

If you encounter any issues or have questions, be sure to follow the troubleshooting steps detailed above. Remember, discussing with peers is encouraged, but sharing of answers is not. Enjoy your game development journey!