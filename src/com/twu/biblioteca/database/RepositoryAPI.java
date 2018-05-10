package com.twu.biblioteca.database;

import com.twu.biblioteca.book.Book;

import java.util.ArrayList;

public class RepositoryAPI {

    public ArrayList getAllBooks() {
        ArrayList<Book> bookList = new ArrayList<>();
        bookList.add(new Book("Book1"));
        bookList.add(new Book("Book2"));
        return bookList;
    }
}
