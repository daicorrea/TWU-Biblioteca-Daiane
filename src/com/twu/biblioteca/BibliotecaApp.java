package com.twu.biblioteca;

import com.twu.biblioteca.Menu.*;
import com.twu.biblioteca.book.BookController;
import com.twu.biblioteca.utils.MyPrinter;

import java.util.Scanner;


public class BibliotecaApp {

    private  Scanner reader = new Scanner(System.in);

    public void printInit() {
        MyPrinter myPrinter = new MyPrinter(System.out);
        myPrinter.print("Hello! Welcome to the wonderful world of the Biblioteca! How can I help you?");
        myPrinter.print(Menu.buildPrintedMenu());

        myPrinter.print("Choose option: ");
        String option = reader.nextLine();

        new MenuDispatcher(new BookController()).dispach(new MenuParser().parse(option));
    }





}
