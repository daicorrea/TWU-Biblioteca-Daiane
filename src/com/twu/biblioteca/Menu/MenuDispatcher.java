package com.twu.biblioteca.Menu;

import com.twu.biblioteca.book.BookControllerInterface;
import com.twu.biblioteca.movie.MovieControllerInterface;
import com.twu.biblioteca.utils.MyPrinter;

public class MenuDispatcher {
    BookControllerInterface bookController;
    MovieControllerInterface movieController;
    private MenuParser menuParser;

    public MenuDispatcher(BookControllerInterface bookController, MovieControllerInterface movieController, MenuParser menuParser) {
        this.bookController = bookController;
        this.movieController = movieController;
        this.menuParser = menuParser;
    }

    public void dispach(Menu option) {
        MyPrinter myPrinter = new MyPrinter(System.out);

        if (option == Menu.LIST_BOOKS) {
            dispachToPrintAvailableBookList(bookController);
            menuParser.mainMenuSelect();
        } else if (option == Menu.QUIT) {
            myPrinter.print("See you!");
            System.exit(0);
        } else if (option == Menu.CHECKOUT) {
            bookController.checkOutBook();
        } else if (option == Menu.RETURN_BOOK) {
            bookController.returnBook();
        } else if (option == Menu.LIST_MOVIES) {
            dispachToPrintAvailableMovieList(movieController);
            menuParser.mainMenuSelect();
        }
        else {
            myPrinter.print("Invalid Menu Option. \n");
            menuParser.mainMenuSelect();
        }
    }

    public void dispachToPrintAvailableBookList(BookControllerInterface bookController) {
        MyPrinter myPrinter = new MyPrinter(System.out);
        myPrinter.print(bookController.buildPrintedAvailableBookList());
    }

    public void dispachToPrintAvailableMovieList(MovieControllerInterface movieController) {
        MyPrinter myPrinter = new MyPrinter(System.out);
        myPrinter.print(movieController.buildPrintedAvailableMovieList());
    }
}
