package com.twu.biblioteca.book;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class BookControllerTest {

    private ArrayList<Book> bookListMock = new ArrayList<>();

    @Before
    public void setUp() throws Exception {
        bookListMock.add(new Book("Book1"));
        bookListMock.add(new Book("Book2"));
    }

    @Test
    public void shouldReturnAllBooks() {
        BookController bookController = new BookController(bookListMock);
        Assert.assertEquals(bookController.getAllBooks(), bookListMock);
    }































}
