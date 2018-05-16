package com.twu.biblioteca.Menu;

import com.twu.biblioteca.book.BookControllerInterface;
import com.twu.biblioteca.utils.MyPrinter;

public class MenuDispatcher {
    BookControllerInterface bookController;
    private MenuParser menuParser;

    public MenuDispatcher(BookControllerInterface bookController, MenuParser menuParser) {
        this.bookController = bookController;
        this.menuParser = menuParser;
    }

    public void dispach(Menu option) {
        MyPrinter myPrinter = new MyPrinter(System.out);

        if (option == Menu.LIST_BOOKS) {
            myPrinter.print(bookController.buildPrintedAvailableBookList());
            menuParser.mainMenuSelect();
        } else if (option == Menu.QUIT) {
            myPrinter.print("See you!");
            System.exit(0);
        } else if (option == Menu.CHECKOUT) {
            bookController.checkOutBook();
        } else if (option == Menu.RETURN_BOOK) {
            bookController.returnBook();
        }
        else {
            myPrinter.print("Invalid Menu Option. \n");
            menuParser.mainMenuSelect();
        }
    }
}
