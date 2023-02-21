import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    private Library library;
    private Book book1;
    private Book book2;
    private Book book3;

    @Before
    public void before(){
        library = new Library(2);
        book1 = new Book("To Kill a Mockingbird", "Harper Lee", "Drama");
        book2 = new Book("Catch-22", "Joseph Heller", "Comedy");
        book3 = new Book("Verity", "Coleen Hoover", "Spooky");
    }

    @Test
    public void can_count_total_books_in_library_when_empty(){
        assertEquals(0, library.getBookCount());
    }

    @Test
    public void can_add_books_to_library(){
        library.addBook(book1);
        library.addBook(book2);
        assertEquals(2, library.getBookCount());
    }

    @Test
    public void can_add_books_to_library_if_over_capacity(){
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        assertEquals(2, library.getBookCount());
    }


}
