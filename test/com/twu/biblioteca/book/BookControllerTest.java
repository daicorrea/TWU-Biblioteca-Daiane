package com.twu.biblioteca.book;
import org.junit.*;

import java.util.ArrayList;

public class BookControllerTest {

    private static ArrayList<Book> bookListMock;

    @BeforeClass
    public static void setUp() throws Exception {
        bookListMock = new ArrayList<>();
        bookListMock.add(new Book("Alice in Wonderland", "Lewis Carroll", 1865));
        bookListMock.add(new Book("Harry Potter", "J.K. Rowling", 1997));
    }

    @Test
    public void shouldReturnAllBooks() {
        BookController bookController = new BookController();
        Assert.assertEquals(bookController.getAllBooks(), bookListMock);
    }

}
