package com.twu.biblioteca.book;

import com.twu.biblioteca.database.RepositoryAPI;

import java.util.List;

public class BookController {
    private  RepositoryAPI repository;

    public BookController() {
        repository = new RepositoryAPI();
    }

    public List<Book> getAllBooks() {
        return repository.getAllBooks();
    }

}
