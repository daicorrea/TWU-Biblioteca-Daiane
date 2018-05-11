package com.twu.biblioteca.book;

import com.twu.biblioteca.database.RepositoryAPI;

import java.util.ArrayList;

public class BookController {
    private  RepositoryAPI repositoryAPI;

    public BookController() {
        repositoryAPI = new RepositoryAPI();
    }

    public ArrayList<Book> getAllBooks() {
        return repositoryAPI.getAllBooks();
    }

}
