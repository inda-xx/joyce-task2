package test;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class BookTest {

    private Book book;

    @Before
    public void setUp() {
        book = new Book("Java Programming", "James Gosling", 1995, "123-4567891234");
    }

    // Test for Constructor
    @Test
    public void testConstructorInitialization() {
        assertEquals("Java Programming", book.getTitle());
        assertEquals("James Gosling", book.getAuthor());
        assertEquals(1995, book.getYearPublished());
        assertEquals("123-4567891234", book.getIsbn());
        assertFalse(book.getIsCheckedOut());
    }

    // Test for Getters
    @Test
    public void testGetters() {
        assertEquals("Java Programming", book.getTitle());
        assertEquals("James Gosling", book.getAuthor());
        assertEquals(1995, book.getYearPublished());
        assertEquals("123-4567891234", book.getIsbn());
        assertFalse(book.getIsCheckedOut());
    }

    // Test for Setters
    @Test
    public void testSetters() {
        book.setTitle("Advanced Java");
        book.setAuthor("John Doe");
        book.setYearPublished(2000);
        book.setIsbn("987-6543219876");

        assertEquals("Advanced Java", book.getTitle());
        assertEquals("John Doe", book.getAuthor());
        assertEquals(2000, book.getYearPublished());
        assertEquals("987-6543219876", book.getIsbn());
    }

    @Test
    public void testSetCheckedOut() {
        book.setCheckedOut(true);
        assertTrue(book.getIsCheckedOut());

        book.setCheckedOut(false);
        assertFalse(book.getIsCheckedOut());
    }

    // Test for checkOut method
    @Test
    public void testCheckOut() {
        book.checkOut();
        assertTrue(book.getIsCheckedOut());

        // Check out again to test the message printed
        book.checkOut();
        assertTrue(book.getIsCheckedOut());
    }

    // Test for returnBook method
    @Test
    public void testReturnBook() {
        book.checkOut(); // Check out first
        book.returnBook();
        assertFalse(book.getIsCheckedOut());

        // Return again to test the message printed
        book.returnBook();
        assertFalse(book.getIsCheckedOut());
    }

    // Test for printDetails method
    @Test
    public void testPrintDetails() {
        // Mocking System.out to avoid actual printing
        PrintStream mockOut = mock(PrintStream.class);
        System.setOut(mockOut);

        book.printDetails();

        verify(mockOut).println("BOOK DETAILS");
        verify(mockOut).println("Title: Java Programming");
        verify(mockOut).println("Author: James Gosling");
        verify(mockOut).println("Year Published: 1995");
        verify(mockOut).println("ISBN: 123-4567891234");
        verify(mockOut).println("Checked Out: No");
    }

    // Test for edge cases and invalid inputs
    @Test(expected = IllegalArgumentException.class)
    public void testInvalidYearPublished() {
        book.setYearPublished(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidIsbn() {
        book.setIsbn("");
    }
}