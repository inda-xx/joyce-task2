# Galactic Traveler Adventure! 🌌🚀

For this task, your mission is to design classes in Java to model a galactic traveler and their spaceship. You'll hone your skills in crafting Java classes while exploring the cosmos!

### 🔒 Deadline
Ensure you complete this task by **Friday 10th November**.

### 👨‍🏫 Instructions
Refer to the [course assignments section](https://example.com/course-instructions#assignments) for guidelines on completing and submitting your work.

### 📚 Preparation
Before beginning this task, make sure to study Module 4 of the OLI material and complete its exercises:

- Read [Understanding Java Classes](https://example.com/course-oli/class-modules)
- Log in to our OLI portal using the course key `galactic123`

### 🎯 Learning Goals

This week's goals encompass:
- Designing Java classes
- Adding instance fields
- Implementing a constructor method
- Creating getters and setters
- Printing to the terminal
- Utilizing the `main` method
- Understanding scope and variable shadowing

### 🔍 Troubleshooting
If you encounter issues, follow this protocol:

1. Check our [issue tracker](https://example.com/help/issues) to see if others have the same problem.
2. If not resolved, post your question by creating a [New Issue](https://example.com/help/issues/new). Provide a clear title, e.g., "Task *Galaxy*: *problem summary*"
3. Discuss in your study group but remember to follow the honor code—no sharing of exact answers!

### 🛸 Assignment Overview

You're tasked to model a cosmic traveler in Java! These travelers voyage across galaxies in their spaceships. The mission is to implement these in Java as classes.

#### Exercise 1.0 -- Fields and Class Design
In the [`src`](src) folder, create a class named `GalacticTraveler.java`. This class should contain fields representing:

- `String` travelerName
- `int` age
- `String` homePlanet
- `Spaceship` spaceship

Here's a glimpse of how the `Spaceship` class should look:

```java
class Spaceship {
    private String model;
    private double speed; // in light-years per hour
    private boolean operational;

    // getters, setters, and constructors to be implemented
}
```

#### Exercise 1.1 -- Constructors and Methods
Design a constructor for `GalacticTraveler` to initialize its fields. Similarly, provide a constructor for the `Spaceship` class. Ensure encapsulation by making fields private and use getters and setters to access them.

Example to initialize a traveler and print their details:

<details>
  <summary> 🛠 Example 1 </summary>

  ```java
  public class GalacticTraveler {

    // Fields declaration

    public GalacticTraveler(String travelerName, int age, String homePlanet, Spaceship spaceship) {
        // Initialize fields
    }

    // Place getters and setters here

    // Main method to demonstrate class usage
    public static void main(String[] args) {
        Spaceship voyager = new Spaceship("Voyager XL", 0.2, true);
        GalacticTraveler traveler = new GalacticTraveler("Luna Stark", 29, "Earth", voyager);

        System.out.println("Traveler: " + traveler.getTravelerName());
        System.out.println("Age: " + traveler.getAge());
        System.out.println("Home Planet: " + traveler.getHomePlanet());
    }
  }
  ```
</details>

#### Exercise 1.2 -- Travel Method
Implement a method `travelTo(String destination)` in the `GalacticTraveler` class. When called, this method should print a statement including the traveler's name and their spaceship's model, asserting they are embarking on a journey to the specified destination.

#### Exercise 1.3 -- Fleet Print
Create a method `printFleetInfo()` in the `Spaceship` class that outputs details about the spaceship's model, speed, and operational status. Use this method in the `main` method to print the fleet details of the traveler's spaceship.

#### Exercise 1.4 -- Explorations and Adventures Method
Add an `exploreGalaxy()` method in the `GalacticTraveler` class. This method should simulate a simple session of space exploration by printing messages to the terminal, such as discovering a new planet or navigating through an asteroid belt. Integrate fun and creativity in these prints!

#### Exercise 1.5 -- Scope and Shadow
Observe this example illustrating variable shadowing. You might need to explain how scope and shadowing functions in a learning session:

```java
public class ShadowGalaxy {
    private int galaxyCount = 100; // Define total known galaxies

    public void printShadowExample() {
        int galaxyCount = 50; // Local variable shadowing the instance variable
        System.out.println(galaxyCount); // It prints the local scope galaxyCount (50)
    }

    public static void main(String[] args){
        new ShadowGalaxy().printShadowExample();
    }
}
```

Reflect on why the instance field `galaxyCount` is overshadowed in the `printShadowExample` method and how you could fix this with the `this` keyword.

Take inspiration from these exercises to explore Java class design and encapsulate the magical realm of your galactic adventure. 🚀🌟

### 🐛 Reporting Bugs
Spot an error in these exercises? Open a [New Issue](https://example.com/help/issues/new) with "Task *Galaxy* Error: *error description*" in the title to gain recognition for your eagle-eyed spotting!