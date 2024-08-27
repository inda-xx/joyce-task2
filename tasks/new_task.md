# 🚀 SpaceExplorers Adventure

Welcome to your next programming task! You'll venture into the realm of Java by designing a class structure for a thrilling space exploration game. You'll build a `SpaceExplorer` to traverse the galaxies, manage its attributes, and enhance your understanding of object-oriented principles in Java.

### 🔗 Deadline
Please ensure that your work is submitted by **Friday 20th October**.

### 📖 Preparation
Make sure to review the following resources to prepare for this exercise:

- [Java Classes and Objects](https://docs.oracle.com/javase/tutorial/java/javaOO/index.html)
- [Encapsulation in Java](https://www.geeksforgeeks.org/encapsulation-in-java/)
- [Variable Shadowing](https://www.baeldung.com/java-variable-shadowing)

These readings will equip you with the knowledge needed to dive into this assignment.

### 🎯 Learning Goals

By completing this task, you'll achieve the following learning objectives:
* Designing Java classes
* Adding instance fields
* Adding a constructor method
* Creating *getters* and *setters*
* Printing to the terminal
* Using the `main` method
* Scope (or *variable shadowing*)

### 🧭 Assignment

The task is to create a `SpaceExplorer` Java class to simulate a space explorer's journey. Imagine your SpaceExplorer equipped with attributes and methods to persevere through the cosmos.

#### Exercise 1 -- Fields
Create a class called `SpaceExplorer.java` in the `src` folder. The class should include the following fields:

- `String` name
- `int` health
- `int` energy
- `int` speed
- `boolean` active

Here’s a starter template that should compile onto your class:

<details>
  <summary> 🛠 Example Code </summary>

  ```java
  class SpaceExplorer {

    // Declare your fields here!

    public static void main(String[] args) {
      SpaceExplorer nova = new SpaceExplorer();

      nova.name = "Nova";
      nova.health = 100;
      nova.energy = 80;
      nova.speed = 10;

      System.out.println("Name: " + nova.name);
      System.out.println("Health: " + nova.health);
      System.out.println("Energy: " + nova.energy);
      System.out.println("Speed: " + nova.speed);
    } // end main method

  } // end class
  ```
</details>

#### Exercise 2 -- Getters and Setters
Change your instance fields to private. Implement *getters* and *setters* for each field, ensuring encapsulation integrity.

<details>
  <summary> 🛠 Example Code </summary>

  ```java
  class SpaceExplorer {

    // Private fields

    // Getters and Setters

    public static void main(String[] args) {
      SpaceExplorer nova = new SpaceExplorer();

      nova.setName("Nova");
      nova.setHealth(100);
      nova.setEnergy(80);
      nova.setSpeed(10);

      System.out.println("Name: " + nova.getName());
      System.out.println("Health: " + nova.getHealth());
      System.out.println("Energy: " + nova.getEnergy());
      System.out.println("Speed: " + nova.getSpeed());
      System.out.println("Is active: " + nova.isActive());
    } // end main method

  } // end class
  ```
</details>

> **Note:** Notice the boolean field follows the naming convention `isActive()` and `setActive()`.

#### Exercise 3 -- Constructor
Leverage the power of a constructor to initialize your `SpaceExplorer` attributes in one step, minimizing repetitive code, and instantiate an explorer.

<details>
  <summary> 🛠 Example Usage </summary>

  ```java
  public static void main(String[] args) {
      SpaceExplorer nova = new SpaceExplorer("Nova", 100, 80, 10);

      nova.printInfo();
  }
  ```
</details>

#### Exercise 4 -- printInfo()
Craft a method called `printInfo()` to output a comprehensive summary of the `SpaceExplorer` attributes.

<details>
  <summary> 🛠 Example Output </summary>

  This method should produce a terminal output like:

  ```
  > SpaceExplorer Information:
  > Name: Nova
  > Health: 100
  > Energy: 80
  > Speed: 10
  > Active: true
  ```
</details>

#### Exercise 5 -- Energy Boost!
Introduce an `activateBoost()` method increasing the explorer's speed temporarily. If energy is above 50, increase the speed by 20% and decrease energy by 20.

<details>
  <summary> 🛠 Example Code </summary>

  ```java
  public void activateBoost() {
      if (energy > 50) {
          speed += speed / 5; // 20% boost
          energy -= 20;
          System.out.println(name + " activated boost! Speed is now " + speed + " and energy is " + energy + ".");
      } else {
          System.out.println("Not enough energy to activate boost.");
      }
  }

  public static void main(String[] args) {
      SpaceExplorer nova = new SpaceExplorer("Nova", 100, 80, 10);
      nova.activateBoost();
      nova.printInfo();
  }
  ```

  This call should print:

  ```
  > Nova activated a boost! Speed is now 12 and energy is 60.
  ```
</details>

#### Exercise 6 -- Variable Shadowing
Boost your understanding of scope by exploring the examples below. Be prepared to discuss and fix these in class:

```java
public class ShadowExample {
    private int shadowedNumber = 10; // I want this number!

    public void demonstrateShadowing() {
        int shadowedNumber = 5;
        System.out.println(shadowedNumber); // Why doesn't it print the number I want?
    }

    public static void main(String[] args){
        new ShadowExample().demonstrateShadowing();
    }
}
```

Another instance:

```java
public class Starship {
  private String model;
  private int year;

  public Starship(String model, int year) {
    model = model; // Why isn't this working?
    year = year;
  }

  public void salute() {
    String model = "Generic";
    System.out.println(model + " salutes!"); // Why doesn't it use the field model?
  }
}
```

> **Note:** Contemplate how *local variables*, *instance fields*, and the keyword `this` influence the result.

### 🤔 Questions?
If you encounter any issues or inconsistencies, or simply need guidance:

1. Check the [discussion board](https://gits-15.sys.kth.se/inda-22/help/issues) for similar issues.
2. Post a question or create a [New Issue](https://gits-15.sys.kth.se/inda-22/help/issues/new) mentioning the task number in the title.
3. Reach out to a TA during your [scheduled lab time](https://queue.csc.kth.se/Queue/INDA).

Feel free to collaborate with your peers but remember to submit original work!