# 🚀 Space Explorer: Designing Java Classes for Spacecraft

For this task, you will model a spacecraft **Space Explorer** in Java. This exercise will help you become familiar with designing Java classes and implementing various methods to create a functional program.

### 📅 Deadline
This task should be completed by **Friday 20th October**.

### 📚 Instructions
For detailed instructions on executing and submitting the assignment, please refer to the [Assignments section](https://your-university-link/course-instructions#assignments) on our course portal.

### 📖 Preparation
Before you start, please ensure you complete the following readings:

- Read about [Java Classes and Objects](https://docs.oracle.com/javase/tutorial/java/javaOO/index.html).
- Cover the section on [Variable Scope](https://docs.oracle.com/javase/tutorial/java/javaOO/localclasses.html).
- If you haven't already, sign up at https://java-olibrary.com and register with the course key `java-basic-2023`.

### 🎯 Learning Goals

Through this assignment, you will develop your competency in:
* Designing Java classes
* Adding instance fields
* Adding a constructor method
* Creating *getters* and *setters*
* Printing to the terminal
* Using the `main` method
* Understanding Scope and Variable Shadowing

### 🛠 Troubleshooting

In case you encounter any issues, please follow these steps:

1. Review this week's [posted issues](https://your-university-link/help/issues) to see if others have the same problem.
2. Raise your concern by creating a [New Issue](https://your-university-link/help/issues/new) with an informative title starting with "Task Space Explorer: Summary of the problem".
3. Consult with a TA during the [scheduled lab sessions](https://queue.university-link/Queue/JavaLab).

Discuss with your peers, but remember not to share your solutions directly.

### 🌌 Assignment

Welcome aboard the journey to explore the universe! Your task is to design a Java program that models a spacecraft named **Space Explorer**. This spaceship can travel, refuel, and explore various planets. Follow these exercises to create this functionality.

#### Exercise 1 -- Fields
Create a new class called `Spacecraft.java`. The class should include the following instance fields:

- `String` name
- `double` fuelLevel (in percentages, e.g., 75.0 for 75%)
- `int` maxSpeed (in kilometers per hour)
- `String` currentPlanet

Implement these fields in the class. Afterward, verify your implementation using the provided main method.

<details>
  <summary> 🛠 Example 1 </summary>

  ```java
  class Spacecraft {

    // Declare your fields here!

    public static void main(String[] args) {
      Spacecraft voyager = new Spacecraft();

      // Assign values to each field
      voyager.name = "Voyager";
      voyager.fuelLevel = 100.0;
      voyager.maxSpeed = 20000;
      voyager.currentPlanet = "Earth";
      
      // Print out the information
      System.out.println("Name: " + voyager.name);
      System.out.println("Fuel Level: " + voyager.fuelLevel + "%");
      System.out.println("Max Speed: " + voyager.maxSpeed + " km/h");
      System.out.println("Current Planet: " + voyager.currentPlanet);
    } // end main method

  } // end class
  ```
</details>

#### Exercise 2 -- Getters and Setters
To encapsulate the fields, set their [access modifiers](https://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html) to `private`. Implement *getters* and *setters* for each field, allowing controlled access and modification.

<details>
  <summary> 🛠 Example 2 </summary>

  ```java
  class Spacecraft {

    // Define private fields here
    
    // Implement getters and setters here

    public static void main(String[] args) {
      Spacecraft voyager = new Spacecraft();
      
      voyager.setName("Voyager");
      voyager.setFuelLevel(100.0);
      voyager.setMaxSpeed(20000);
      voyager.setCurrentPlanet("Earth");

      System.out.println("Name: " + voyager.getName());
      System.out.println("Fuel Level: " + voyager.getFuelLevel() + "%");
      System.out.println("Max Speed: " + voyager.getMaxSpeed() + " km/h");
      System.out.println("Current Planet: " + voyager.getCurrentPlanet());
    } // end main method

  } // end class
  ```
</details>

#### Exercise 3 -- Constructor
Improve object instantiation by adding a constructor to initialize a spacecraft with specified values. Repeat the previous example using this constructor to instantiate the object's attributes.

#### Exercise 4 -- `printInfo()`
Create a `printInfo()` method in the class to display all the spacecraft's details neatly. Use the updated example to test this method.

<details>
  <summary> 🛠 Example 3 </summary>

  ```java
  public static void main(String[] args){
    Spacecraft voyager = new Spacecraft("Voyager", 100.0, 20000, "Earth");
    
    voyager.printInfo();
  }
  ```

  Expected output:
  ```
  > Spacecraft Info
  > Name: Voyager
  > Fuel Level: 100.0%
  > Max Speed: 20000 km/h
  > Current Planet: Earth
  ```
</details>

#### Exercise 5 -- Explore
Add a method called `explore()`, which receives a string parameter `newPlanet`. It simulates traveling to another planet if the spacecraft has sufficient fuel. Implement logic to reduce fuel and update `currentPlanet`.

<details>
  <summary> 🛠 Example 4 </summary>

  ```java
  public static void main(String[] args){
    Spacecraft voyager = new Spacecraft("Voyager", 80.0, 20000, "Earth");

    voyager.explore("Mars");
  }
  ```

  Expected output:
  ```
  > Voyager is exploring Mars!
  > Fuel Level now at: 70.0%
  ```
</details>

#### Exercise 6 -- Variable Shadowing
Review the following example and reason how variable shadowing is in effect. Prepare your thoughts for discussion in class.

```Java
public class FuelGauge {
    private double fuelLevel = 100.0;  // This is the field I want to use

    public void useFuel() {
        double fuelLevel = 10.0;
        System.out.println("Using " + fuelLevel + "% fuel."); // Why doesn't this use the correct field?
    }

    public static void main(String[] args){
        new FuelGauge().useFuel();
    }
}
```

Another example:

```Java
public class Astronaut {
  private String name;

  public Astronaut(String name) {
    name = name; // Fix this: why doesn't it set correctly?
  }

  public void callMe() {
    String name = "Unknown";
    System.out.println("Hello, " + name); // Why is this not the correct name?
  }
}
```

> **Assistant's Note:** Consider how local and class-level variables (fields) interact, using the `this` keyword to correctly reference class fields.

### 🐛 Found Bugs?

If you come across any errors or inconsistencies, please report them by creating a [New Issue](https://your-university-link/help/issues/new) with a descriptive title like "Task Space Explorer Bug: Summary of issue". Contributors who identify valid bugs will be acknowledged in the task credits.