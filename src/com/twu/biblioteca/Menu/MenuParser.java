package com.twu.biblioteca.Menu;

import com.twu.biblioteca.book.BookController;
import com.twu.biblioteca.utils.MyPrinter;

import java.util.Scanner;

public class MenuParser {
    private BookController bookController;
    private MenuDispatcher menuDispatcher;

    public MenuParser() {
        this.bookController = new BookController(this);
        this.menuDispatcher = new MenuDispatcher(this.bookController, this);
    }

    public Menu parse(String option) {
        if (option.equals("0")) {
            return Menu.QUIT;
        } else if (option.equals("1")) {
            return Menu.LIST_BOOKS;
        } else if (option.equals("2")) {
            return Menu.CHECKOUT;
        } else {
            return Menu.OTHER;
        }
    }

    public void mainMenuSelect() {
        Scanner reader = new Scanner(System.in);
        MyPrinter myPrinter = new MyPrinter(System.out);

        myPrinter.print(Menu.buildPrintedMenu());
        myPrinter.print("Choose an option: ");
        String option = reader.nextLine();

        this.menuDispatcher.dispach(parse(option));
    }
}
