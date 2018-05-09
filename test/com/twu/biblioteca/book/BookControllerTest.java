package com.twu.biblioteca.book;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class BookControllerTest {

    private BookController bookController;

    private BookDataRepository bookDataRepository;

    @Test
    public void shouldReturnAllBooks() {
        //arrange
        bookDataRepository = mock(BookDataRepository.class);
        bookController = new BookController(bookDataRepository);
        int quantityExpected = 2;
        List<Book> expectedBooks = asList(new Book("book1"), new Book("book2"));
        when(bookDataRepository.getAllBooks()).thenReturn(asList(new Book("book1"), new Book("book2")));

        //act
        List<Book> results = bookController.getAllBooks();

        //assert
        assertThat(results.size(),is(quantityExpected));
        assertThat(results,is(expectedBooks));

    }
}
