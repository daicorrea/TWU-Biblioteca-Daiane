package com.twu.biblioteca.database;

import com.twu.biblioteca.book.Book;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class RepositoryAPITest {

    private ArrayList<Book> bookList = new ArrayList<>();
    @Before
    public void setUp() throws Exception {
        bookList.add(new Book("Book1"));
        bookList.add(new Book("Book2"));
    }

    @Test
    public void shouldReturnBookList() {
        RepositoryAPI repositoryAPI = new RepositoryAPI();
        Assert.assertEquals(repositoryAPI.getAllBooks(), bookList);

        RepositoryAPIInterface repositoryAPIInterface = new RepositoryAPI();
    }
}
