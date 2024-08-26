// File: Book.java
class Book {
    // Fields for the Book class
    private String title;
    private String author;
    private int yearPublished;
    private String isbn;
    private boolean isCheckedOut;

    // Constructor
    public Book(String title, String author, int yearPublished, String isbn) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.isbn = isbn;
        this.isCheckedOut = false; // Default state is not checked out
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public String getIsbn() {
        return isbn;
    }

    public boolean getIsCheckedOut() {
        return isCheckedOut;
    }

    // Setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setCheckedOut(boolean isCheckedOut) {
        this.isCheckedOut = isCheckedOut;
    }

    // Method to print book details
    public void printDetails() {
        System.out.println("BOOK DETAILS");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year Published: " + yearPublished);
        System.out.println("ISBN: " + isbn);
        System.out.println("Checked Out: " + (isCheckedOut ? "Yes" : "No"));
    }

    // Method to check out the book
    public void checkOut() {
        if (!isCheckedOut) {
            this.isCheckedOut = true;
            System.out.println("The book '" + title + "' has been checked out.");
        } else {
            System.out.println("The book '" + title + "' is already checked out.");
        }
    }

    // Method to return the book
    public void returnBook() {
        if (isCheckedOut) {
            this.isCheckedOut = false;
            System.out.println("The book '" + title + "' has been returned.");
        } else {
            System.out.println("The book '" + title + "' was not checked out.");
        }
    }

    public static void main(String[] args) {
        // Demonstrating the use of Book class
        Book book = new Book("Java Programming", "James Gosling", 1995, "123-4567891234");
        book.printDetails();
        book.checkOut();
        book.printDetails();
        book.returnBook();
        book.printDetails();
    }
}