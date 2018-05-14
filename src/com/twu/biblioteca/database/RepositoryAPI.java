package com.twu.biblioteca.database;

import com.twu.biblioteca.book.Book;

import java.util.ArrayList;

public class RepositoryAPI {

    public ArrayList getAllBooks() {
        return bookDepositoryMock();
    }

    private ArrayList<Book> bookDepositoryMock() {
        ArrayList<Book> bookMockList = new ArrayList();
        bookMockList.add(new Book(1,"Alice in Wonderland", "Lewis Carroll",1865));
        bookMockList.add(new Book(2,"Harry Potter", "J.K. Rowling", 1997));

        return bookMockList;
    }
}
