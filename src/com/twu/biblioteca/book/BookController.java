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

        builder.append("\nThis are all the books we have available right now:\n");
        builder.append("----------------------------------------------------------------------------\n");
        builder.append(String.format("|%-40s|", "BOOK NAME") + (String.format("%-20s|", "AUTHOR")) + (String.format("%-12s|\n", "RELEASE YEAR")));
        builder.append("----------------------------------------------------------------------------\n");

        for(Book book: getAllBooks()) {
            builder.append(book.toString());
            builder.append("\n");
        }

        builder.append("----------------------------------------------------------------------------\n");
        return builder.toString();
    }

    public void checkOutBook() {
        Scanner reader = new Scanner(System.in);
        MyPrinter myPrinter = new MyPrinter(System.out);

        myPrinter.print("Please enter the Book ID you want to Checkout: ");
        int checkOutBookID = Integer.parseInt(reader.nextLine());

        boolean didCheckedOut = changeBookCheckoutStatus(getAllBooks(), checkOutBookID);

        if (didCheckedOut) {
            myPrinter.print("Thank you! Enjoy the book");
        } else {
            myPrinter.print("That book is not available");
        }

        menuParser.mainMenuSelect();
    }

    public boolean changeBookCheckoutStatus(ArrayList<Book> bookList, int checkOutBookID) {
        for(Book book: bookList) {
            if (book.getBookID() == checkOutBookID && !book.isCheckedOut()) {
                book.setCheckedOut(true);
                return true;
            }
        }
        return false;
    }
}
