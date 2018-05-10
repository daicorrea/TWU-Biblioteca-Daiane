package com.twu.biblioteca.book;

import com.twu.biblioteca.database.RepositoryAPI;

import java.util.List;

public class BookController {

    private List<Book> bookList;

    public BookController(List<Book> bookList) {
        this.bookList = bookList;
    }

    public List<Book> getAllBooks() {
        RepositoryAPI repositoryAPI = new RepositoryAPI();
        return repositoryAPI.getAllBooks();
    }

}
