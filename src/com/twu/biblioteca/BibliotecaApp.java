package com.twu.biblioteca;

import com.twu.biblioteca.Menu.*;
import com.twu.biblioteca.utils.MyPrinter;

public class BibliotecaApp {

    public void printInit() {

        MyPrinter myPrinter = new MyPrinter(System.out);
        Message message = new Message();
        MenuParser menuParser = new MenuParser();

        myPrinter.print(message.showWelcomeMessage());
        menuParser.mainMenuSelect();
    }

}
