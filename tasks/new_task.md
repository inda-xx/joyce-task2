# Let's Play Java Game! 🕹️ 

This is your challenge for today, programmer! It's time to step into the magical world of **Java Programming** and test your skills. Are you ready?

### 📅 Deadline
Get this task completed before the due date, which is on **Tuesday 20th September**.

### 👨‍💼 Instructions
Please review the [course instructions section](https://gits-15.sys.kth.se/inda-22/course-instructions#assignments) to understand how to do and submit assignments. Make sure you adhere to every detail.

### 🎓 Preparation
Before getting started with this assignment, here's what you need to do:

- Read [Using Objects](https://kth.oli.cmu.edu/jcourse/webui/syllabus/module.do?context=a2b40d76a4200020a49c27f0000168af)
- Sign up and get registered for the course key `dd1337-ht22` at https://kth.oli.cmu.edu/, in case you haven't done it yet. 

### 📌 Learning Goals
The learning goals for this week's tasks are:
* Designing Java classes
* Adding instance fields
* Adding a constructor method
* Creating getters and setters
* Printing to the terminal
* Utilising the `main` method
* Scope (or variable shadowing)

### 🔧 Troubleshooting Guide
If you find yourself stuck or facing any difficulties:

1. Check out this week's [posted issues](https://gits-15.sys.kth.se/inda-22/help/issues). The solution to your problem might be there already.
2. If not, feel free to post your issue [here](https://gits-15.sys.kth.se/inda-22/help/issues/new). Make sure title begins with "Task *x*: *summary of your problem*".
3. You can always ask a teacher assistant in person during the [weekly lab](https://queue.csc.kth.se/Queue/INDA). Check your schedule for the timings of the next lab.

Feel free to discuss with your fellow students, but remember to **respect the rules against plagiarism**!

### 👾 Assignment

The name of the game is **Java Gold Digger!**. You are composing the code of a fearless explorer digging for gold while dodging hidden traps. 

#### Exercise 1.0 -- Character Class

In the [`src`](src) folder, create a class named `Character.java`. This class will model the game character and should include these attributes:

- `String` name
- `int` xPos (representing the character's x-position in the game)
- `int` yPos (y-position)
- `int` gold (amount of gold collected)
- `boolean` isAlive (if character is still alive)

A simple `main` method for `Character.java` should compile correctly if done right. This method is given below for your reference.

<details>
  <summary>🛠️ Example 1</summary>
  
  ```java
  class Character {
    // Put your fields here!

    public static void main(String[] args) {
      // create a new "Character" object
      Character digger = new Character();
      
      // assign field variables to some values
      digger.name = "digger";
      digger.xPos = 0;
      digger.yPos = 0;
      digger.gold = 0;
      digger.isAlive = true;
      
      // print the information of the assigned values
      System.out.println("Character name: " + digger.name);
      System.out.println("Character Position: (" + digger.xPos + ", " + digger.yPos + ")");
      System.out.println("Gold collected: " + digger.gold);
      System.out.println("Character alive? " + digger.isAlive);
    } 
  } 
  ```
</details>

#### Exercise 1.1 -- Getters and Setters 

Implement getters and setters for each field in your `Character` class. Your `Character` class should now have private fields and all the 10 *getters* and *setters* methods. 

A copied version of Example 1 into your `Character.java` file should compile correctly, if you've done this right.

<details>
  <summary>🛠️ Example 2</summary>
  
  ```java
  class Character {
    // Put your fields here!
  
    // Put your getters and setters here!
  
    public static void main(String[] args) {
      // create a new "Character" object
      Character digger = new Character();
      
      // assign field variables using setters
      digger.setName("digger");
      digger.setxPos(0);
      digger.setyPos(0);
      digger.setGold(0);
      digger.setAlive(true);
      
      // print the information of the assigned values using getters
      System.out.println("Character name: " + digger.getName());
      System.out.println("Character Position: (" + digger.getxPos() + ", " + digger.getyPos() + ")");
      System.out.println("Gold collected: " + digger.getGold());
      System.out.println("Character alive? " + digger.getIsAlive());
    } 
  } 
  ```
</details>
#### Exercise 1.2

Implement a constructor for your Character class. Overwrite your previous main method in accordance to this change.

#### Exercise 1.3 -- `printStatus()`

Add a method named `printStatus()`. This method should print all the information about the character to the console. 

#### Exercise 1.4 -- `move()`

Incorporate a `move()` method into your Character class. This method should receive a `char` as input ('N', 'S', 'E', 'W') and modify the character's position accordingly (North, South, East, or West). Implement bounds checking so the character cannot move outside the grid (which is 10x10 units for this exercise). 

#### Exercise 1.5 -- `dig()`
 
Introduce a `dig()` method. This method receives an `int` value as an argument, which corresponds to the amount of gold to be added to the player’s gold stash.

#### Exercise 1.6 -- Instance variable shadowing

Create an example of instance variable shadowing. Discuss this subject during the next lab session. 

### 🕷️ Bugs and Errors?

If you stumble upon any bugs or errors in this exercise, create a new issue with the title "Task *x*: Error - *summary of the error here*". Your contributions will be appreciated and acknowledged.