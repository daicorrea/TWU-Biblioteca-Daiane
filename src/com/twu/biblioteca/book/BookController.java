package com.twu.biblioteca.book;

import com.twu.biblioteca.Menu.MenuParser;
import com.twu.biblioteca.database.RepositoryAPI;
import com.twu.biblioteca.utils.MyPrinter;

import java.util.ArrayList;
import java.util.Scanner;

public class BookController implements BookControllerInterface {
    private RepositoryAPI repositoryAPI;
    private MenuParser menuParser;

    public BookController(MenuParser menuParser) {
        repositoryAPI = new RepositoryAPI();
        this.menuParser = menuParser;
    }

    @Override
    public ArrayList<Book> getAllBooks() {
        return repositoryAPI.getAllBooks();
    }

    public String buildPrintedBookList() {
        StringBuilder builder = new StringBuilder();

        builder.append("\nThis are all the books we have right now:\n");
        builder.append("------------------------------------------------------------------------------------\n");
        builder.append(String.format("|%-8s|", "BOOK ID") + String.format("%-40s|", "BOOK NAME") + (String.format("%-20s|", "AUTHOR")) + (String.format("%-12s|\n", "RELEASE YEAR")));
        builder.append("------------------------------------------------------------------------------------\n");

        for(Book book: getAllBooks()) {
            builder.append(book.toString());
            builder.append("\n");
        }

        builder.append("------------------------------------------------------------------------------------\n");
        return builder.toString();
    }

    public String buildPrintedAvailableBookList() {
        StringBuilder builder = new StringBuilder();

        builder.append("\nThis are all the books we have available right now:\n");
        builder.append("-------------------------------------------------------------------------------------\n");
        builder.append(String.format("|%-8s|", "BOOK ID") + String.format("%-40s|", "BOOK NAME") + (String.format("%-20s|", "AUTHOR")) + (String.format("%-12s|\n", "RELEASE YEAR")));
        builder.append("-------------------------------------------------------------------------------------\n");

        for(Book book: getAllBooks()) {
            if(!book.isCheckedOut()) {
                builder.append(book.toString());
                builder.append("\n");
            }
        }

        builder.append("-------------------------------------------------------------------------------------\n");
        return builder.toString();
    }

    public void checkOutBook() {
        Scanner reader = new Scanner(System.in);
        MyPrinter myPrinter = new MyPrinter(System.out);

        myPrinter.print("Please enter the Book ID you want to Checkout: ");
        int bookID = Integer.parseInt(reader.nextLine());

        boolean didCheckedOut = changeBookCheckoutStatus(getAllBooks(), bookID, true);

        if (didCheckedOut) {
            myPrinter.print("Thank you! Enjoy the book");
        } else {
            myPrinter.print("That book is not available");
        }

        menuParser.mainMenuSelect();
    }

    public void returnBook() {
        Scanner reader = new Scanner(System.in);
        MyPrinter myPrinter = new MyPrinter(System.out);

        myPrinter.print("Please enter the Book ID you want to Return: ");
        int bookID = Integer.parseInt(reader.nextLine());

        boolean didReturnBook = changeBookCheckoutStatus(getAllBooks(), bookID, false);

        if (didReturnBook) {
            myPrinter.print("Thank you for returning the book.");
        } else {
            myPrinter.print("That is not a valid book to return.");
        }

        menuParser.mainMenuSelect();
    }

    public boolean changeBookCheckoutStatus(ArrayList<Book> bookList, int bookID, boolean status) {
        for(Book book: bookList) {
            if (book.getBookID() == bookID && book.isCheckedOut() != status) {
                book.setCheckedOut(status);
                return true;
            }
        }
        return false;
    }
}
