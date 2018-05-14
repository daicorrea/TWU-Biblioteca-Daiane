package com.twu.biblioteca.Menu;

import com.twu.biblioteca.book.BookControllerInterface;
import com.twu.biblioteca.utils.MyPrinter;

import java.util.Scanner;

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
            myPrinter.print("Bye");
            System.exit(0);
        } else {
            MenuParser menuParser = new MenuParser();
            Scanner reader = new Scanner(System.in);

            myPrinter.print("Select a valid option!");
            myPrinter.print(Menu.buildPrintedMenu());
            myPrinter.print("Choose an option: ");

            String newOption = reader.nextLine();
            new MenuDispatcher(bookController).dispach(menuParser.parse(newOption));
        }
    }
}
