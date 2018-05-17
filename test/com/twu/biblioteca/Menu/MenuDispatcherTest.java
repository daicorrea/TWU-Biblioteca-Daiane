package com.twu.biblioteca.Menu;

import com.twu.biblioteca.book.Book;
import com.twu.biblioteca.book.BookControllerInterface;
import com.twu.biblioteca.movie.Movie;
import com.twu.biblioteca.movie.MovieControllerInterface;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertTrue;

public class MenuDispatcherTest {

    @Test
    public void shouldDispatchToPrintAvailableBookList() {
        BookControllerMock bookControllerMock = new BookControllerMock();
        MovieControllerMock movieControllerMock = new MovieControllerMock();
        MenuDispatcher menuDispatcher = new MenuDispatcher(bookControllerMock, movieControllerMock, new MenuParser());
        menuDispatcher.dispachToPrintAvailableBookList(bookControllerMock);
        assertTrue(bookControllerMock.didCallGetAllAvailableBooks);
    }

    @Test
    public void shouldDispatchToPrintAvailableMovieList() {
        BookControllerMock bookControllerMock = new BookControllerMock();
        MovieControllerMock movieControllerMock = new MovieControllerMock();
        MenuDispatcher menuDispatcher = new MenuDispatcher(bookControllerMock, movieControllerMock, new MenuParser());
        menuDispatcher.dispachToPrintAvailableMovieList(movieControllerMock);
        assertTrue(movieControllerMock.didGetAllAvailableMovies);
    }

    private class BookControllerMock implements BookControllerInterface {
        boolean didCallGetAllAvailableBooks;

        @Override
        public ArrayList<Book> getAllBooks() {
            didCallGetAllAvailableBooks = true;
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

    private class MovieControllerMock implements MovieControllerInterface {
        boolean didGetAllAvailableMovies;

        @Override
        public ArrayList<Movie> getAllMovies() {
            didGetAllAvailableMovies = true;
            return null;
        }

        @Override
        public String buildPrintedAvailableMovieList() {
            return null;
        }

        @Override
        public void checkOutMovie() {

        }

    }
}
