# 📚 Java Library Management System

In this exercise, you will practice modeling objects in Java by designing a simple library management system. You will use this opportunity to reinforce your understanding of Java classes and the concepts of encapsulation, constructors, getters, setters, and the use of the `main` method.

### 💀 Deadline
This task should be completed by **Friday 16th October**.

### 👩‍🏫 Instructions
Please refer to the [assignments section of the course instructions](https://gits-15.sys.kth.se/course-instructions) for guidance on completing and submitting this assignment.

### 📝 Preparation
Before you start working on the assignment, ensure that you have thoroughly reviewed the following material:

- Read [Classes](https://docs.oracle.com/javase/tutorial/java/javaOO/classes.html) and [Objects](https://docs.oracle.com/javase/tutorial/java/javaOO/objects.html) in the Oracle Java documentation.
- Explore [Java Constructors](https://docs.oracle.com/javase/tutorial/java/javaOO/constructors.html) and [Encapsulation](https://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html).

> **Note:** The learning resources will provide a foundational understanding to help you complete this exercise successfully.

### ✅ Learning Goals

By the end of this assignment, you will be able to:
- Design Java classes
- Add instance fields
- Implement a constructor method
- Create *getters* and *setters*
- Print to the terminal
- Utilize the `main` method effectively
- Understand scope and variable shadowing in Java

### 🚨 Troubleshooting Guide
In case you encounter challenges while working on the assignment, follow these steps:

1. Check the [posted issues page](https://gits-15.sys.kth.se/help/issues) to see if your classmates have raised similar concerns.
2. If not, consider opening a [New Issue](https://gits-15.sys.kth.se/help/issues/new) detailing your problem. Give your issue a concise title starting with "Task *x*: *problem description*."
3. Seek assistance from a TA during your [designated lab sessions](https://queue.csc.kth.se/Queue/INDA).

Discuss with peers but refrain from sharing direct solutions.

### 📚 Assignment Overview

Imagining a bustling library at the heart of a quaint town, you are to create a basic Library Management System to manage a collection of books. In this system, you will model the attributes and actions that a book might have.

#### Exercise 1.0 -- Fields
Start by developing a class called `Book.java` within your `src` directory. Your class should correctly define the following fields to model book attributes:

- `String title`
- `String author`
- `int yearPublished`
- `String isbn`
- `boolean isCheckedOut`

If done correctly, the main method provided in Example 1 should compile successfully.

<details>
  <summary> 🛠 Example 1 </summary>

  ```java
  public class Book {

    // Define your fields here!

    public static void main(String[] args) {
      // Create a new Book instance
      Book book = new Book();

      // Assign values to the book's fields
      book.title = "Java Programming";
      book.author = "James Gosling";
      book.yearPublished = 1995;
      book.isbn = "123-4567891234";

      // Print book details to the terminal
      System.out.println("Title: " + book.title);
      System.out.println("Author: " + book.author);
      System.out.println("Year Published: " + book.yearPublished);
      System.out.println("ISBN: " + book.isbn);
    } // end main method

  } // end class
  ```
</details>

#### Exercise 1.1 -- Getters and Setters
To encapsulate the fields within your `Book` class, start by setting the fields' access modifiers to `private`. Implement the required accessors and mutators (*getters* and *setters*) for each field, making a total of ten methods in your class. Validate your implementation against the provided main method in Example 2.

<details>
  <summary> 🛠 Example 2 </summary>

  ```java
  public class Book {

    // Define your private fields here!

    // Implement your getters and setters here!

    public static void main(String[] args) {
      // Create a new Book object
      Book book = new Book();

      // Assign values using setters
      book.setTitle("Java Programming");
      book.setAuthor("James Gosling");
      book.setYearPublished(1995);
      book.setIsbn("123-4567891234");

      // Retrieve information using getters
      System.out.println("Title: " + book.getTitle());
      System.out.println("Author: " + book.getAuthor());
      System.out.println("Year Published: " + book.getYearPublished());
      System.out.println("ISBN: " + book.getIsbn());
    } // end main method

  } // end class
  ```
</details>

#### Exercise 1.2 -- Constructor
Simplify object instantiation by implementing a constructor that initializes all the book's attribute values at once. Re-examine Example 2 and instantiate objects using the newly defined constructor.

#### Exercise 1.3 -- `printDetails()`
Create a method called `printDetails()` that prints all the book's information to the terminal in a formatted manner. Refer to Example 3:

<details>
  <summary> 🛠 Example 3 </summary>

  ```java
  public static void main(String[] args){
    // Create a new Book object using the constructor
    Book book = new Book("Java Programming", "James Gosling", 1995, "123-4567891234");

    // Print book information using printDetails
    book.printDetails();
  }
  ```

  Expected console output:

  ```
  > BOOK DETAILS
  > Title: Java Programming
  > Author: James Gosling
  > Year Published: 1995
  > ISBN: 123-4567891234
  > Checked Out: No
  ```
</details>

#### Exercise 1.4 -- Scenarios of Checking Out
Implement a method to simulate the action of checking out a book called `checkOut()`, which will update the `isCheckedOut` field to `true`. Similarly, define a method `returnBook()` to mark the book as available again.

<details>
  <summary> 🛠 Example 4 </summary>

  ```java
  public static void main(String[] args){
    // Create a new Book object using the constructor
    Book book = new Book("Java Programming", "James Gosling", 1995, "123-4567891234");

    // Check out the book and display its status
    book.checkOut();
    book.printDetails(); // Checked Out: Yes

    // Return the book and display its status
    book.returnBook();
    book.printDetails(); // Checked Out: No
  }
  ```
</details>

#### Exercise 1.5 -- Variable Shadowing
Explore the provided code snippets that demonstrate variable shadowing issues. Evaluate how these examples contribute to improper data handling and analyze how you might rectify them using resources mentioned earlier.

```Java
public class ShadowExample {
    private String message = "Instance Message"; // Original message I want to print

    public void printShadow() {
        String message = "Local Message"; // This shadows my intended message
        System.out.println(message); // It prints the shadowed local message
    }

    public static void main(String[] args){
        new ShadowExample().printShadow();
    }
}
```

And another example:

```Java
public class Library {
  private String address;

  public Library(String address) {
    address = address; // This doesn’t work :( Why?
  }

  public String getAddress() {
    return address;
  }

  public static void main(String[] args) {
    Library library = new Library("123 Book Street");
    System.out.println(library.getAddress()); // Prints null instead of intended address?
  }
}
```

> **Note:** Familiarize yourself with concepts of *local scope*, *global variables*, and the `this` keyword for resolving variable shadowing.

### 🌟 Exploring Further
Try extending your library management system with other functionalities like tracking multiple books, author details, or due dates for checked-out books. Implementing these additional features will deepen your understanding of Java's object-oriented capabilities.

### 🐞 Notice an Issue?
If you identify any issues or errors during this exercise, please take a moment to report them by creating a [New Issue](https://gits-15.sys.kth.se/help/issues/new) with a descriptive title. Recognized and useful contributions will be acknowledged in future iterations of this exercise.