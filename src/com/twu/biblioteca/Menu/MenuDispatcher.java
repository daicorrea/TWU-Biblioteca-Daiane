package com.twu.biblioteca.Menu;

import com.twu.biblioteca.book.BookControllerInterface;
import com.twu.biblioteca.utils.MyPrinter;

public class MenuDispatcher {
    BookControllerInterface bookController;

    public MenuDispatcher(BookControllerInterface bookController) {
        this.bookController = bookController;
    }

    public void dispach(Menu option) {
        MyPrinter myPrinter = new MyPrinter(System.out);

        if (option == Menu.LIST_BOOKS) {
            myPrinter.print(bookController.buildPrintedBookList());
        } else if (option == Menu.QUIT) {
            myPrinter.print("See you!");
            System.exit(0);
        } else if (option == Menu.CHECKOUT) {
            bookController.checkOutBook();
        }
        else {
            myPrinter.print("Invalid Menu Option. \n");
        }
    }
}
