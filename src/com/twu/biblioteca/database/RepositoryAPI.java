package com.twu.biblioteca.database;

import com.twu.biblioteca.Menu.Menu;
import com.twu.biblioteca.book.Book;

import java.util.ArrayList;

public class RepositoryAPI {

    public ArrayList getAllBooks() {
        return bookDepositoryMock();
    }

    public ArrayList getMainMenu() {
        return mainMenuMock();
    }

    private ArrayList<Book> bookDepositoryMock() {
        ArrayList<Book> bookMockList = new ArrayList();
        bookMockList.add(new Book("Alice in Wonderland", "Lewis Carroll",1865));
        bookMockList.add(new Book("Harry Potter", "J.K. Rowling", 1997));

        return bookMockList;
    }

    private ArrayList<String> mainMenuMock() {
        ArrayList<String>  mainMenuMockList = new ArrayList<>();
        mainMenuMockList.add("1. List Books");

        return mainMenuMockList;
    }
}
