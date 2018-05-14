package com.twu.biblioteca.book;

import com.twu.biblioteca.database.RepositoryAPI;

import java.util.ArrayList;

public class BookController implements BookControllerInterface {
    private  RepositoryAPI repositoryAPI;

    public BookController() {
        repositoryAPI = new RepositoryAPI();
    }

    @Override
    public ArrayList<Book> getAllBooks() {
        return repositoryAPI.getAllBooks();
    }

    public void printBookList() {
        ArrayList<Book> bookList = getAllBooks();
        System.out.println("\nThis are all the books we have available right now:\n");
        System.out.println("-------------------------------------------------------------");
        System.out.println(String.format("|%-25s|", "BOOK NAME") + (String.format("%-20s|", "AUTHOR")) + (String.format("%-12s|", "RELEASE YEAR")));
        System.out.println("-------------------------------------------------------------");
        for(int i = 0; i < bookList.size(); i++) {
            System.out.println(bookList.get(i).toString());
        }
        System.out.println("-------------------------------------------------------------");
    }

}
