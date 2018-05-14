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
            new MyPrinter(System.out).print(bookController.getAllBooks());
        }
    }
}
