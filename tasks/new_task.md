# 🏰 Kingdom Builder: Create Your Realm!

In this exercise, you'll learn to build and manage your kingdom using Java. You will learn about Java class components and will create a detailed kingdom simulation.

### ⏳ Deadline
This task should be submitted by **Monday 20th November**.

### 📖 Instructions
Refer to the [course instructions section](https://gits-15.sys.kth.se/inda-22/course-instructions#assignments) for details on how to submit.

### 📚 Preparation
Before you begin, make sure to:

- Complete the reading on [Classes and Objects](https://docs.oracle.com/javase/tutorial/java/javaOO/index.html)
- Ensure you're registered with KTH learning resources using the course key `dd1337-ht22`.

### 🎯 Learning Goals

Through this exercise, you will:

- Design Java classes
- Add instance fields
- Construct a constructor method
- Create getters and setters
- Print outputs to the console
- Use the `main` method
- Understand scope and variable shadowing

### 🔧 Troubleshooting
In case of questions:

1. Review the [open issues](https://gits-15.sys.kth.se/inda-22/help/issues) from fellow students.
2. Post your questions by creating a [New Issue](https://gits-15.sys.kth.se/inda-22/help/issues/new).
3. Visit the weekly lab session to ask TAs for help. Refer to your schedule for exact timings.

Work together with classmates, but remember, **sharing answers is not permitted**!

### 🏗 Assignment

In a faraway land, your kingdom awaits its ruler! Develop a Java program to simulate and manage your kingdom's growth and prosperity.

#### Exercise 1: Designing the Kingdom Class

Create a new class `Kingdom.java`. The attributes of your kingdom should include:

- `String` kingdomName
- `int` population
- `double` treasury (in millions)
- `String` rulerName
- `boolean` prosperityStatus

To verify your implementation of fields, test with the `main` method in Example 1.

<details>
  <summary> ⚙️ Example 1 </summary>

```java
class Kingdom {

    // Declare your fields here

    public static void main(String[] args) {
        Kingdom myKingdom = new Kingdom();

        myKingdom.kingdomName = "Serenia";
        myKingdom.population = 2000;
        myKingdom.treasury = 3.5;
        myKingdom.rulerName = "Queen Athena";

        System.out.println("Welcome to the Kingdom of " + myKingdom.kingdomName);
        System.out.println("Population: " + myKingdom.population);
        System.out.println("Treasury: $" + myKingdom.treasury + " million");
        System.out.println("Ruled by: " + myKingdom.rulerName);
    }
}
```

</details>

#### Exercise 2: Implementing Getters and Setters

To enable encapsulation, set fields in the `Kingdom` class as `private`. Implement getters and setters for each field to allow controlled access. Test your getters and setters with Example 2.

<details>
  <summary> ⚙️ Example 2 </summary>

```java
class Kingdom {

    // Private fields

    // Getters and Setters for each field

    public static void main(String[] args) {
        Kingdom myKingdom = new Kingdom();

        myKingdom.setKingdomName("Serenia");
        myKingdom.setPopulation(2000);
        myKingdom.setTreasury(3.5);
        myKingdom.setRulerName("Queen Athena");

        System.out.println("Kingdom: " + myKingdom.getKingdomName());
        System.out.println("Population: " + myKingdom.getPopulation());
        System.out.println("Treasury: $" + myKingdom.getTreasury() + " million");
        System.out.println("Ruled by: " + myKingdom.getRulerName());
    }
}
```

</details>

#### Exercise 3: Adding a Constructor

Introduce a constructor to initialize your kingdom's attributes efficiently. Reimplement Example 2 utilizing the constructor.

#### Exercise 4: Display Kingdom Information

Develop a `displayInfo()` method to print the kingdom's full information succinctly. Example 3 illustrates this implementation.

<details>
  <summary> ⚙️ Example 3 </summary>

```java
public static void main(String[] args) {
    Kingdom serenia = new Kingdom("Serenia", 2000, 3.5, "Queen Athena");

    serenia.displayInfo();
}
```

Expected console output:

```
Welcome to the Kingdom of Serenia!
Population: 2000
Treasury: $3.5 million
Ruled by: Queen Athena
Prosperous: false
```

</details>

#### Exercise 5: Managing Prosperity

Implement a method `declareProsperous()` which prints a message to the console declaring the prosperity of the kingdom based on its treasury:

- If the treasury is above 5 million, the kingdom is prosperous.

Adjust the `prosperityStatus` accordingly, impacting the output of `displayInfo()`.

#### Exercise 6: Handling Variable Shadowing

Review the provided examples of variable shadowing below. Be prepared to discuss fixes in class.

```java
public class Castle {
    private int towerCount = 6; // I need this number to be used :(

    public void buildWalls() {
        int towerCount = 10;
        System.out.println(towerCount); // It's not displaying the intended value :(
    }

    public static void main(String[] args){
        new Castle().buildWalls();
    }
}
```

Another scenario:

```java
public class Knight {
    private String title;

    public Knight(String title) {
        title = title; // Why doesn't this work? :(
    }

    public void battleCry() {
        String title = "Sir Unie";
        System.out.println(title + " charges valiantly!"); // Unexpected name :(
    }
}
```

> **Assistant's Note:** Consider the implications of local and global scopes, as well as the use of the `this` keyword in resolving these issues.

### 🛠 Errors or Feedback?
Please report any errors or provide feedback through a [New Issue](https://gits-15.sys.kth.se/inda-22/help/issues/new) titled "Task *x*: *Error Description*". Your contributions will be acknowledged with gratitude.