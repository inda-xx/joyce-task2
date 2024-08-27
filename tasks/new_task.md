# 🏗 Java Building Blocks: Craft Your Gadget!

In this task, you’ll dive into designing Java classes to model objects, focusing on crafting a virtual gadget for smart home enthusiasts. You'll get hands-on experience with Java's core concepts, from class design to handling scope and avoiding variable shadowing.

### 📅 Deadline
This assignment is due by **Friday, November 10th**.

### 📚 Instructions
To complete and submit your work, follow the guidelines in the [assignments section of the course instructions](https://example-university-java-course.com/assignments).

### 🔍 Preparation
Before you begin, please review and answer the questions in the course material for Module 3:

- Complete the readings on [Object-Oriented Programming Basics](https://example-university-java-course.com/module3/basics)
- Ensure you are registered on the course platform with the code `java-101-fall23`.

> **Note:** The course materials may have slightly shifted this semester; if needed, feel free to explore ahead to complete this task.

### 🎯 Learning Goals

Through this task, you will:

- Design Java classes
- Add instance fields
- Implement a constructor method
- Develop getters and setters
- Print to the terminal
- Work with the `main` method
- Understand scope and variable shadowing

### 🛠 Troubleshooting Guide
If issues arise during this task:

1. Check this week's [posted issues](https://example-university-help.com/issues) to see if others have encountered similar problems.
2. If your problem is new, create a [New Issue](https://example-university-help.com/issues/new) with a clear title starting with "Task *x*: *brief problem description*".
3. Attend a [scheduled lab](https://example-university.com/labs) for hands-on assistance from a TA.

Discuss with peers as needed, but remember to maintain academic integrity!

### 🏠 Assignment

Imagine you’re a designer for a smart home company. Your mission is to model a gadget, a "Smart Light", using Java. While real prototypes are being built, you’ll develop the digital twin to simulate how these lights might operate.

#### Exercise 3.0 -- Fields
In the [`src`](src) folder, create a new class named `SmartLight.java`. Define the following attributes as fields:

- `String` model
- `boolean` isOn
- `int` brightness (%) (0-100)
- `String` color
- `boolean` isConnected

Make sure the test code in Example 1 compiles and runs in `SmartLight.java`.

<details>
  <summary> 🛠 Example 1 </summary>

  ```java
  class SmartLight {

    // Declare your fields here!

    public static void main(String[] args) {
      // Instantiate a SmartLight object
      SmartLight livingRoomLight = new SmartLight();

      // Assign meaningful values to its attributes
      livingRoomLight.model = "LuxeBeam";
      livingRoomLight.isOn = true;
      livingRoomLight.brightness = 75;
      livingRoomLight.color = "Warm White";
      livingRoomLight.isConnected = true;

      // Print information about the SmartLight
      System.out.println("Model: " + livingRoomLight.model);
      System.out.println("Is On: " + livingRoomLight.isOn);
      System.out.println("Brightness: " + livingRoomLight.brightness + "%");
      System.out.println("Color: " + livingRoomLight.color);
      System.out.println("Connected: " + livingRoomLight.isConnected);
    } // end main method

  } // end class
  ```
</details>

#### Exercise 3.1 -- Getters and Setters
Encapsulate the `SmartLight` fields by making them `private`. Implement *getters* and *setters* for each field, facilitating access control while preserving state integrity. Adapt Example 2 to test your code.

<details>
  <summary> 🛠 Example 2 </summary>

  ```java
  class SmartLight {

    // Implement fields, encapsulating them as private

    // Implement getters and setters

    public static void main(String[] args) {
      // Create a SmartLight object
      SmartLight kitchenLight = new SmartLight();

      // Test getters and setters
      kitchenLight.setModel("EcoShine");
      kitchenLight.setOn(true);
      kitchenLight.setBrightness(65);
      kitchenLight.setColor("Cool Blue");
      kitchenLight.setConnected(true);

      // Print SmartLight details using getters
      System.out.println("Model: " + kitchenLight.getModel());
      System.out.println("Is On: " + kitchenLight.isOn());
      System.out.println("Brightness: " + kitchenLight.getBrightness() + "%");
      System.out.println("Color: " + kitchenLight.getColor());
      System.out.println("Connected: " + kitchenLight.isConnected());
    } // end main method

  } // end class
  ```
</details>

> **Note:** For `boolean` fields, the getter uses `is` prefix—for example, `isOn()`, `setOn()`.

#### Exercise 3.2 -- Constructor
Simplify object creation by implementing a constructor that initializes all fields. Recreate Example 2 using this constructor.

#### Exercise 3.3 -- `printDetails()`
Add a method `printDetails()` to print full information using a formatted output. See Example 3 for reference.

<details>
  <summary> 🛠 Example 3 </summary>

  ```java
  public static void main(String[] args){
    // Instantiate a SmartLight using its constructor
    SmartLight bedroomLight = new SmartLight("DreamLite", true, 50, "Pleasant Yellow", true);

    // Print all gadget details
    bedroomLight.printDetails();
  }
  ```

  Expecting:
  ```
  > Gadget Details:
  > Model: DreamLite
  > Power State: On
  > Brightness: 50%
  > Color: Pleasant Yellow
  > Connectivity Status: Connected
  ```
</details>

#### Exercise 3.4 -- Operating the SmartLight
Develop a method `togglePower()` that switches the `isOn` status of the `SmartLight`. Enhance Example 4 with this capability.

<details>
  <summary> 🛠 Example 4 </summary>

  ```java
  public static void main(String[] args){
    // Create an instance
    SmartLight workshopLight = new SmartLight("HighVision", false, 30, "Neutral White", true);

    // Toggle power state
    System.out.println("Toggling Power...");
    workshopLight.togglePower();

    // Verify if the light is now On
    System.out.println("Is the light On? " + workshopLight.isOn());
  }
  ```

  Expected:
  ```
  > Toggling Power...
  > Is the light On? true
  ```
</details>

#### Exercise 3.5 -- Handling Variable Shadowing
Familiarize yourself with variable shadowing and ensure your understanding by reviewing and correcting the following examples.

```Java
public class BrightnessControl {
    private int brightness = 100;

    public void setBrightness(int brightness) {
        brightness = brightness / 2; // This might not behave as intended
        System.out.println(brightness); // What value prints here?
    }

    public static void main(String[] args) {
        new BrightnessControl().setBrightness(80);
    }
}
```

Here’s another:

```Java
public class Gadget {
  private String name;
  private String type;

  public Gadget(String name, String type) {
    name = name; // Identifying what's wrong here
    type = type;
  }

  public void showGadget() {
    String name = "QuickFix";
    System.out.println(name + " is available!"); // What outputs here?
  }
}
```

> **Consider:** Reflect on *local* versus *global* scope and the role of `this` keyword in fixing such examples.

### 🐞 Spot a bug?
If you detect errors or inconsistencies, promptly file a [New Issue](https://example-university-help.com/issues/new) titled "Task *x* Bug: *brief summary here*". Discoverers of confirmed bugs will earn gratitude acknowledgments in course communications.

With these exercises, you sharpen your understanding of Java's fundamentals and prepare for larger object-oriented projects. Enjoy crafting your SmartLight!