package com.twu.biblioteca.database;

import com.twu.biblioteca.book.Book;

import java.util.ArrayList;

public interface RepositoryAPIInterface {
    ArrayList<Book> getAllBooks();
}
