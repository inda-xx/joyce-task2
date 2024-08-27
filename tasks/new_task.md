# 🗺️ Explore the City with Java!

In this programming task, you will dive into the basics of object-oriented programming by creating a virtual cityscape using Java. This task will help you understand how to define and work with Java classes, and explore concepts like constructors, methods, and scope.

### 📆 Deadline
Please complete your assignment by **Friday, 9th December**.

### 📚 Instructions
Please follow the instructions outlined in the [course assignments section](https://example.com/course-instructions#assignments) to submit your work. Ensure your code is well-documented and follows the coding standards discussed in the course.

### 💻 Preparation
Before embarking on this task, make sure to review Chapter 3 of your Java textbook, which deals with the basics of classes and objects.

- **Read:** [Java Classes and Objects](https://docs.oracle.com/javase/tutorial/java/javaOO/index.html)
- **Get started:** Set up your development environment if you haven't done so by following the [setup guide](https://example.com/setup).

### 🎯 Learning Goals

By the end of this task, you should be able to:
* Design Java classes
* Add instance fields
* Implement constructor methods
* Use getters and setters
* Print information to the terminal
* Utilize the `main` method
* Understand variable scope and shadowing

### 🔧 Troubleshooting Guide
Having issues? Follow these steps:
1. Check the [Q&A forum](https://example.com/forum) to see if others have encountered similar issues.
2. If your problem is unique, post a detailed question on the forum, including what you've tried and where exactly you're encountering issues.
3. Reach out during office hours with specific questions.

Encouraging collaboration is key, but remember to avoid sharing specific code solutions.

### 🌍 Assignment

Your mission, should you choose to accept it, is to model a dynamic city in Java. You'll be starting with a fundamental city class and expanding its capabilities.

#### Exercise 1: Define the City
In the `src` folder, create a new class named `City.java`. Model it with the following fields:
- `String name`
- `int population`
- `double area` (in square kilometers)
- `boolean capital` (indicating if it is a capital city)

<details>
  <summary> Sample Code Snippet </summary>

  ```java
  public class City {

    // Define your fields here

    public static void main(String[] args) {
      City stockholm = new City();
      
      // Assign values to fields
      stockholm.name = "Stockholm";
      stockholm.population = 975551;
      stockholm.area = 188.0;
      stockholm.capital = true;

      // Print city information
      System.out.println("City: " + stockholm.name);
      System.out.println("Population: " + stockholm.population);
      System.out.println("Area: " + stockholm.area);
      System.out.println("Capital: " + stockholm.capital);
    }
  }
  ```
</details>

#### Exercise 2: Implement Getters and Setters
Encapsulate the city attributes by making them private and adding public getter and setter methods for each. This will protect the fields while still providing controlled access.

<details>
  <summary> Sample Code Snippet </summary>

  ```java
  public class City {

    // Fields
    private String name;
    private int population;
    private double area;
    private boolean capital;

    // Getters and Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getPopulation() { return population; }
    public void setPopulation(int population) { this.population = population; }

    public double getArea() { return area; }
    public void setArea(double area) { this.area = area; }

    public boolean isCapital() { return capital; }
    public void setCapital(boolean capital) { this.capital = capital; }

    public static void main(String[] args) {
      City stockholm = new City();

      // Using setters
      stockholm.setName("Stockholm");
      stockholm.setPopulation(975551);
      stockholm.setArea(188.0);
      stockholm.setCapital(true);

      // Using getters
      System.out.println("City: " + stockholm.getName());
      System.out.println("Population: " + stockholm.getPopulation());
      System.out.println("Area: " + stockholm.getArea());
      System.out.println("Capital: " + stockholm.isCapital());
    }
  }
  ```
</details>

#### Exercise 3: Construct Your City
Create a constructor to initialize `City` objects with all the attributes in one go. This will make object creation more efficient.

<details>
  <summary> Sample Code Snippet </summary>

  ```java
  public City(String name, int population, double area, boolean capital) {
    this.name = name;
    this.population = population;
    this.area = area;
    this.capital = capital;
  }

  public static void main(String[] args) {
    City stockholm = new City("Stockholm", 975551, 188.0, true);

    stockhom.printInfo();
  }
  ```

  This will use the constructor to easily create a city and will print the city's details.
</details>

#### Exercise 4: Print City Info
Implement a method `printInfo()` to display city details in a structured format.

<details>
  <summary> Expected Output </summary>

  ```
  > City Information:
  > Name: Stockholm
  > Population: 975551
  > Area: 188.0 sq km
  > Capital City: Yes
  ```
</details>

#### Exercise 5: Variable Shadowing Analysis
Analyze and fix the following code snippets demonstrating variable shadowing:

```java
public class ShadowExample {
    private int population = 1000; // I want this

    public void printShadow() {
        int population = 2000;
        System.out.println(population); // prints the wrong number
    }

    public static void main(String[] args){
        new ShadowExample().printShadow();
    }
}
```

Another example to fix:

```java
public class Building {
  private String color;

  public Building(String color) {
    color = color; // This assignment doesn't work as intended
  }

  public void describe() {
    String color = "Green";
    System.out.println("The building is " + color);
  }
}
```

> **Assistant's Note:** Consider the role of `this` and how it can be used to reference class-level variables, avoiding shadowing issues.

### 🐛 Handling Errors
Discover a problem? Report it by creating a [new issue](https://example.com/issues/new) with specifics about what and where the issue is. Feedback is invaluable in improving the learning experience.