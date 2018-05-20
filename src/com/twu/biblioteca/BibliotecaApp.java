package com.twu.biblioteca;

import com.twu.biblioteca.menu.*;
import com.twu.biblioteca.utils.MyPrinter;

public class BibliotecaApp {

    public void printInit() {
        callWelcomeMessage(new Message());
        MenuParser menuParser = new MenuParser();
        menuParser.mainMenuSelect();
    }

    public void callWelcomeMessage(MessageInterface message) {
        MyPrinter myPrinter = new MyPrinter(System.out);
        myPrinter.print(message.showWelcomeMessage());
    }


}
