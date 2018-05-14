package com.twu.biblioteca.Menu;

import com.twu.biblioteca.book.BookController;
import com.twu.biblioteca.utils.MyPrinter;

import java.util.Scanner;

public class MenuParser {
    public Menu parse(String option) {
        if (option.equals("1")) {
            return Menu.LIST_BOOKS;
        } else if (option.equals("2")) {
            return Menu.QUIT;
        } else {
            return Menu.OTHER;
        }
    }

    public void mainMenuSelect() {
        Scanner reader = new Scanner(System.in);
        MyPrinter myPrinter = new MyPrinter(System.out);
        MenuParser menuParser = new MenuParser();
        BookController bookController = new BookController();

        myPrinter.print(Menu.buildPrintedMenu());
        myPrinter.print("Choose an option: ");
        String option = reader.nextLine();

        new MenuDispatcher(bookController).dispach(menuParser.parse(option));
    }
}
