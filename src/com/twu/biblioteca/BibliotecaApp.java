package com.twu.biblioteca;

import com.twu.biblioteca.Menu.*;
import com.twu.biblioteca.book.BookController;
import com.twu.biblioteca.utils.MyPrinter;

import java.util.Scanner;


public class BibliotecaApp {

    private  Scanner reader = new Scanner(System.in);

    public void printInit() {
        MyPrinter myPrinter = new MyPrinter(System.out);
        Message message = new Message();
        MenuParser menuParser = new MenuParser();
        BookController bookController = new BookController();

        myPrinter.print(message.showWelcomeMessage());
        myPrinter.print(Menu.buildPrintedMenu());

        myPrinter.print("Choose an option: ");
        String option = reader.nextLine();

        new MenuDispatcher(bookController).dispach(menuParser.parse(option));


    }





}
