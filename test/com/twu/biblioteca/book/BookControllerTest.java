package com.twu.biblioteca.book;
import com.twu.biblioteca.Menu.MenuParser;
import org.junit.*;

import java.util.ArrayList;

public class BookControllerTest {

    private static ArrayList<Book> bookListMock;
    private static ArrayList<Book> bookListCheckedOutMock;

    @BeforeClass
    public static void setUp() throws Exception {
        bookListMock = new ArrayList<>();
        bookListMock.add(new Book(1,"Alice in Wonderland", "Lewis Carroll", 1865));
        bookListMock.add(new Book(2,"Harry Potter and the Sorcerer's Stone", "J.K. Rowling", 1997));
        bookListMock.add(new Book(3,"Harry Potter and the Chamber of Secrets", "J.K. Rowling", 1999));
        bookListMock.add(new Book(4,"Harry Potter and the Prisoner of Azkaban", "J.K. Rowling", 2004));

        bookListCheckedOutMock = new ArrayList<>();
        bookListCheckedOutMock.add(new Book(1,"Alice in Wonderland", "Lewis Carroll", 1865, true));
        bookListCheckedOutMock.add(new Book(2,"Harry Potter and the Sorcerer's Stone", "J.K. Rowling", 1997, false));
        bookListCheckedOutMock.add(new Book(3,"Harry Potter and the Chamber of Secrets", "J.K. Rowling", 1999, false));
        bookListCheckedOutMock.add(new Book(4,"Harry Potter and the Prisoner of Azkaban", "J.K. Rowling", 2004, false));
    }

    @Test
    public void shouldReturnAllBooks() {
        BookController bookController = new BookController(new MenuParser());
        Assert.assertEquals(bookController.getAllBooks(), bookListMock);
    }

    @Test
    public void shouldChangeBookCheckOutStatusToTrue() {
        BookController bookController = new BookController(new MenuParser());
        Assert.assertTrue(bookController.changeBookCheckoutStatus(bookListMock, 1, true));
        Assert.assertTrue(bookListMock.get(0).isCheckedOut());
    }

    @Test
    public void shouldReturnBookListWithCheckedOutBooksFalseStatus() {
        BookController bookController = new BookController(new MenuParser());
        bookController.changeBookCheckoutStatus(bookListMock, 1, true);
        Assert.assertEquals(bookListMock, bookListCheckedOutMock);
    }

    @Test
    public void shouldChangeBookCheckOutStatusToFalse() {
        BookController bookController = new BookController(new MenuParser());
        bookController.changeBookCheckoutStatus(bookListMock, 1, true);
        Assert.assertTrue(bookController.changeBookCheckoutStatus(bookListMock, 1, false));
        Assert.assertFalse(bookListMock.get(0).isCheckedOut());
    }

    @Test
    public void shouldReturnBookListWithCheckedOutBooksTrueStatus() {
        BookController bookController = new BookController(new MenuParser());
        bookController.changeBookCheckoutStatus(bookListCheckedOutMock, 1, false);
        Assert.assertEquals(bookListCheckedOutMock, bookListMock);
    }
}
