package com.twu.biblioteca.Menu;

import com.twu.biblioteca.book.BookControllerInterface;
import com.twu.biblioteca.utils.MyPrinter;

public class MenuDispatcher {
    BookControllerInterface bookController;

    public MenuDispatcher(BookControllerInterface bookController) {
        this.bookController = bookController;
    }

    public void dispach(Menu option) {
        if (option == Menu.LIST_BOOKS) {
            new MyPrinter(System.out).print(bookController.buildPrintedBookList());
        } else if (option == Menu.QUIT) {
            new MyPrinter(System.out).print("Bye");
            System.exit(0);
        } else {
            new MyPrinter(System.out).print("Select a valid option!");
        }
    }
}
