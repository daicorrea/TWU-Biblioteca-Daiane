package com.twu.biblioteca.book;
import org.junit.*;

import java.util.ArrayList;

public class BookControllerTest {

    private static ArrayList<Book> bookListMock;

    @BeforeClass
    public static void setUp() throws Exception {
        bookListMock = new ArrayList<>();
        bookListMock.add(new Book(1,"Alice in Wonderland", "Lewis Carroll", 1865));
        bookListMock.add(new Book(2,"Harry Potter", "J.K. Rowling", 1997));
    }

    @Test
    public void shouldReturnAllBooks() {
        BookController bookController = new BookController();
        Assert.assertEquals(bookController.getAllBooks(), bookListMock);
    }

    @Test
    public void shouldCheckoutBook() {
        BookController bookController = new BookController();
        Assert.assertTrue(bookController.checkOutBook(bookListMock, 1));
        Assert.assertTrue(bookListMock.get(0).isCheckedOut());
    }
}
