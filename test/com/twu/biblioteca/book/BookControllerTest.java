package com.twu.biblioteca.book;

import com.twu.biblioteca.database.RepositoryAPI;
import org.hamcrest.CoreMatchers;
import org.junit.*;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class BookControllerTest {

    private static ArrayList<Book> bookListMock;

    @BeforeClass
    public static void setUp() throws Exception {
        bookListMock = new ArrayList<>();
        bookListMock.add(new Book("Alice in Wonderland"));
        bookListMock.add(new Book("Harry Potter"));
    }

    @Test
    public void shouldReturnAllBooks() {
        BookController bookController = new BookController();
        Assert.assertEquals(bookController.getAllBooks(), bookListMock);
    }

}
