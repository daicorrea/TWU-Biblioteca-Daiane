package com.twu.biblioteca.book;

import com.twu.biblioteca.database.RepositoryAPI;

import java.util.ArrayList;

public class BookController {
    private  RepositoryAPI repository;

    public BookController() {
        repository = new RepositoryAPI();
    }

    public ArrayList<Book> getAllBooks() {
        return repository.getAllBooks();
    }

}
