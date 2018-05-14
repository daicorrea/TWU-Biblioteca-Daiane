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

    public String buildPrintedBookList() {
        StringBuilder builder = new StringBuilder();

        builder.append("\nThis are all the books we have available right now:\n");
        builder.append("-------------------------------------------------------------\n");
        builder.append(String.format("|%-25s|", "BOOK NAME") + (String.format("%-20s|", "AUTHOR")) + (String.format("%-12s|\n", "RELEASE YEAR")));
        builder.append("-------------------------------------------------------------\n");

        for(Book book: getAllBooks()) {
            builder.append(book.toString());
            builder.append("\n");
        }

        builder.append("-------------------------------------------------------------\n");
        return builder.toString();
    }

    public boolean checkOutBook(ArrayList<Book> bookList, int checkBookID) {
        for(Book book: bookList) {
            if (book.getBookID() == checkBookID && !book.isCheckedOut()) {
                book.setCheckedOut(true);
                return true;
            }
        }
        return false;
    }
}
