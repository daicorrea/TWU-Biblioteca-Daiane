package com.twu.biblioteca.Menu;

import com.twu.biblioteca.book.Book;
import com.twu.biblioteca.book.BookControllerInterface;
import org.junit.Test;

import java.util.ArrayList;
import static org.junit.Assert.assertTrue;

public class MenuDispatcherTest {

    @Test
    public void shouldDispachToGetAllBooks() {
        BookControllerMock bookControllerMock = new BookControllerMock();
        MenuDispatcher menuDispatcher = new MenuDispatcher(bookControllerMock);
        menuDispatcher.dispach(Menu.LIST_BOOKS);
        assertTrue(bookControllerMock.didCallGetAllBooks);
    }

    private class BookControllerMock implements BookControllerInterface {
        boolean didCallGetAllBooks;

        @Override
        public ArrayList<Book> getAllBooks() {
            didCallGetAllBooks = true;
            return null;
        }

        @Override
        public String buildPrintedBookList() {
            didCallGetAllBooks = true;
            return null;
        }

        @Override
        public void checkOutBook() {

        }
    }
}
