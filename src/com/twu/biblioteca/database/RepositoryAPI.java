package com.twu.biblioteca.database;

import com.twu.biblioteca.book.Book;
import com.twu.biblioteca.movie.Movie;

import java.util.ArrayList;

public class RepositoryAPI {

    private ArrayList<Book> bookList;
    private ArrayList<Movie> movieList;

    public RepositoryAPI() {
        this.bookList = this.bookDepositoryMock();
        this.movieList = this.movieDepositoryMock();
    }

    public ArrayList getAllBooks() {
        return this.bookList;
    }

    public ArrayList<Movie> getAllMovies() {
        return this.movieList;
    }


    private ArrayList<Book> bookDepositoryMock() {
        ArrayList<Book> bookMockList = new ArrayList<>();
        bookMockList.add(new Book(1,"Alice in Wonderland", "Lewis Carroll",1865));
        bookMockList.add(new Book(2,"Harry Potter and the Sorcerer's Stone", "J.K. Rowling", 1997));
        bookMockList.add(new Book(3,"Harry Potter and the Chamber of Secrets", "J.K. Rowling", 1999));
        bookMockList.add(new Book(4,"Harry Potter and the Prisoner of Azkaban", "J.K. Rowling", 2004));

        return bookMockList;
    }

    private ArrayList<Movie> movieDepositoryMock() {
        ArrayList<Movie> movieMockList = new ArrayList<>();
        movieMockList.add(new Movie(1,"Avengers: Infinity War", 2018,"Anthony Russo, Joe Russo", 7));
        movieMockList.add(new Movie(2,"A Wrinkle in Time", 2018,"Ava DuVernay", 5));
        movieMockList.add(new Movie(3,"Black Panther", 2018,"Ryan Coogler", 8));
        movieMockList.add(new Movie(4,"Love, Simon", 2018,"Greg Berlanti", 0));

        return movieMockList;
    }

}
