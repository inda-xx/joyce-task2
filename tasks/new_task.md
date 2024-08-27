# Galactic Adventure: Designing Alien Species in Java 🚀

For this programming task, you'll step into the realm of interstellar game development by creating Java classes that model various alien species encountered during a cosmic journey.

### 💫 Deadline
This task must be completed by **Thursday, 25th November**.

### 🧑‍🏫 Instructions
To complete and submit this assignment, refer to our [course assignments manual](https://gits-15.sys.kth.se/cs101/course-instructions#assignments).

### 📚 Preparation
Make sure to cover the following materials from our online resources:

- Read [Creating Classes and Objects](https://kth.oli.cmu.edu/jcourse/webui/syllabus/module.do?context=f6e9a109bc2e088896f2b9de225bac61).
- For a detailed dive, go to https://kth.oli.cmu.edu/ and use the course key `cs101-ht23` for registration if you haven't already.

> **Assistant's Note:** Course materials may occasionally be updated, so feel free to browse ahead if you're keen.

### 🎯 Learning Goals

The objectives for this assignment include:
* Designing Java classes
* Adding instance fields
* Adding a constructor method
* Creating *getters* and *setters*
* Printing to the terminal
* Using the `main` method
* Understanding Scope and *Variable Shadowing*

### 🔍 Troubleshooting Guide
Having trouble? Follow these steps:

1. Check out the week's [discussion board](https://gits-15.sys.kth.se/cs101/help/issues) to find similar questions.
2. Submit your query by creating a [New Issue](https://gits-15.sys.kth.se/cs101/help/issues/new) titled "Task *x*: *brief description of your problem*".
3. Seek advice from a Teaching Assistant during weekly labs. Consult your schedule for more details.

While collaboration is encouraged, ensure your submissions remain personal and original!

### 👽 Assignment: Alien Encounters

Within the Galactic Federation's data archives, various alien species are documented, accompanied by their vital statistics. Embark on a mission to model these fascinating creatures in Java!

#### Exercise 1.0 -- Fields
Begin in the [`src`](src) directory by drafting a new `Alien` class (`Alien.java`). Specify its unique attributes using [fields](https://docs.oracle.com/javase/tutorial/java/javaOO/variables.html):

- `String` speciesName
- `int` energyLevel
- `int` strength
- `int` intelligence
- `boolean` peaceful

Upon completion, the introductory setup given in Example 1 should compile successfully if incorporated into `Alien.java`.

<details>
  <summary> 🛠 Example 1 </summary>

  ```java
  class Alien {

    // Add your fields here!

    public static void main(String[] args) {
      Alien zorb = new Alien();

      // Assign decent values to the attributes
      zorb.speciesName = "Zorb";
      zorb.energyLevel = 50;
      zorb.strength = 75;
      zorb.intelligence = 90;

      // Print attribute data
      System.out.println("Species: " + zorb.speciesName);
      System.out.println("Energy Level: " + zorb.energyLevel);
      System.out.println("Strength: " + zorb.strength);
      System.out.println("Intelligence: " + zorb.intelligence);
    } // end main method

  } // end class
  ```
</details>

#### Exercise 1.1 -- Getters and Setters
Object-oriented programming emphasizes [encapsulation](https://en.wikipedia.org/wiki/Encapsulation_(computer_programming)), restricting direct access to the object's state. Change the fields to `private` and implement *getters* and *setters* for each, totaling ten methods. The example in Example 2 should now run smoothly when fused with `Alien.java`.

<details>
  <summary> 🛠 Example 2 </summary>

  ```java
  class Alien {

    // Insert updated private fields here!

    // Add your getters and setters here!

    public static void main(String[] args) {
      Alien zorb = new Alien();

      zorb.setSpeciesName("Zorb");
      zorb.setEnergyLevel(50);
      zorb.setStrength(75);
      zorb.setIntelligence(90);

      System.out.println("Species: " + zorb.getSpeciesName());
      System.out.println("Energy Level: " + zorb.getEnergyLevel());
      System.out.println("Strength: " + zorb.getStrength());
      System.out.println("Intelligence: " + zorb.getIntelligence());
    } // end main method

  } // end class
  ```
</details>

> **Assistant's Note:** For `boolean` type fields, adhere to different conventions: `isPeaceful()` and `setPeaceful()` instead of the generic `getXXX()` and `setXXX()` styles.

#### Exercise 1.2 -- Constructor
Manually adding attributes repeatedly defies efficiency. Develop a *constructor*, and with this foundation, replicate Example 2's outcomes.

#### Exercise 1.3 -- `printDetails()`
Formulate a method, `printDetails()`, to succinctly display all alien details in the console. Its return type will be `void`.

<details>
  <summary> 🛠 Example 3 </summary>

  ```java
  public static void main(String[] args){
    // Create an alien object and initialize with constructor
    Alien zorb = new Alien("Zorb", 50, 75, 90);

    // Display its details
    zorb.printDetails();
  }
  ```

  Expected console output:

  ```
  > INFO
  > Species: Zorb
  > Energy Level: 50
  > Strength: 75
  > Intelligence: 90
  > Peaceful: false
  ```
</details>

#### Exercise 1.4 -- Alien Combat!
Imagine a space-battle scenario! Incorporate a `combat` method whereby one alien *attacks* another, reducing their energy. The method will compute:

```java
final double energyImpact = (attacker.getStrength() - defender.getIntelligence() / 2.0);
```

Display combat outcomes using the console.

<details>
  <summary> 🛠 Example 4 </summary>

  ```java
  public static void main(String[] args){
    Alien zorb = new Alien("Zorb", 80, 75, 85);
    Alien nebula = new Alien("Nebula", 70, 65, 80);

    zorb.combat(nebula);
  }
  ```

  This should generate:

  ```
  > Alien Zorb assaulted alien Nebula. Estimated impact was 32.5 energy units!
  > Alien Nebula now has 37.5 energy left!
  ```
</details>

#### Exercise 1.5 -- Grasping Variable Shadowing
Review the following Variable Shadowing examples and prepare for class discussions. Remedies may involve [this keyword](https://docs.oracle.com/javase/tutorial/java/javaOO/thiskey.html).

```Java
public class Example1 {
    private int count = 10; 

    public void shadowDemo() {
        int count = 20;
        System.out.println(count); // Why is 20 printed instead of 10?
    }

    public static void main(String[] args){
        new Example1().shadowDemo();
    }
}
```

Here's another:

```Java
import java.awt.Color;

public class Spaceship {
  private String name;
  private Color hullColor;

  public Spaceship(String name, Color hullColor) {
    name = name; // Encountering a problem here. Why doesn't it work?
    hullColor = hullColor;
  }

  public void travel() {
    String name = "Star Voyager";
    System.out.println(name + " sets sail across the stars!"); // Ever seen this in action?
  }
}
```

> **Assistant's Note:** Contemplate how *local scope*, *global variables*, and *instance fields* interrelate in these examples.

### 🛠 Bug Reporting?
Spot an error? Kindly create a [New Issue](https://gits-15.sys.kth.se/cs101/help/issues/new) titled "Task *x* Issue: *brief summary of error*". Earn accolades in our acknowledgments for identifying bugs!