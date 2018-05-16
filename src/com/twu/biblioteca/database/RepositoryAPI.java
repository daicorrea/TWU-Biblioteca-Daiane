package com.twu.biblioteca.database;

import com.twu.biblioteca.book.Book;

import java.util.ArrayList;

public class RepositoryAPI {

    private ArrayList<Book> bookList;

    public RepositoryAPI() {
        this.bookList = this.bookDepositoryMock();
    }

    public ArrayList getAllBooks() {
        return this.bookList;
    }

    private ArrayList<Book> bookDepositoryMock() {
        ArrayList<Book> bookMockList = new ArrayList<>();
        bookMockList.add(new Book(1,"Alice in Wonderland", "Lewis Carroll",1865));
        bookMockList.add(new Book(2,"Harry Potter and the Sorcerer's Stone", "J.K. Rowling", 1997));
        bookMockList.add(new Book(3,"Harry Potter and the Chamber of Secrets", "J.K. Rowling", 1999));
        bookMockList.add(new Book(4,"Harry Potter and the Prisoner of Azkaban", "J.K. Rowling", 2004));

        return bookMockList;
    }
}
