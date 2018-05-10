package com.twu.biblioteca.database;

import com.twu.biblioteca.book.Book;

import java.util.ArrayList;

public class RepositoryAPI {

    public ArrayList getAllBooks() {
        return bookDepositoryMock();
    }

    private ArrayList<Book> bookDepositoryMock() {
        ArrayList<Book> bookMockList = new ArrayList();
        bookMockList.add(new Book("Alice in Wonderland"));
        bookMockList.add(new Book("Harry Potter"));

        return bookMockList;
    }
}
