package com.twu.biblioteca.book;
import org.junit.*;

import java.util.ArrayList;

public class BookControllerTest {

    private static ArrayList<Book> bookListMock;

    @BeforeClass
    public static void setUp() throws Exception {
        bookListMock = new ArrayList<>();
        bookListMock.add(new Book("Alice in Wonderland", "Lewis Carroll"));
        bookListMock.add(new Book("Harry Potter", "J.K. Rowling"));
    }

    @Test
    public void shouldReturnAllBooks() {
        BookController bookController = new BookController();
        Assert.assertEquals(bookController.getAllBooks(), bookListMock);
    }

}
