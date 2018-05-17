package com.twu.biblioteca.Menu;

import com.twu.biblioteca.book.Book;
import com.twu.biblioteca.book.BookControllerInterface;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertTrue;

public class MenuDispatcherTest {

    @Test
    public void shouldDispatchToPrintAvailableBookList() {
        BookControllerMock bookControllerMock = new BookControllerMock();
        MenuDispatcher menuDispatcher = new MenuDispatcher(bookControllerMock, new MenuParser());
        menuDispatcher.dispachToPrintAvailableBookList(bookControllerMock);
        assertTrue(bookControllerMock.didCallGetAllAvailableBooks);
    }

    private class BookControllerMock implements BookControllerInterface {
        boolean didCallGetAllBooks;
        boolean didCallGetAllAvailableBooks;

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

        @Override
        public void returnBook() {

        }

        @Override
        public String buildPrintedAvailableBookList() {
            didCallGetAllAvailableBooks = true;
            return null;
        }
    }
}
