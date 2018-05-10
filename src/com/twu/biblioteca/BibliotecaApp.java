package com.twu.biblioteca;

import com.twu.biblioteca.Menu.Message;
import com.twu.biblioteca.Menu.MessageInterface;

public class BibliotecaApp {

    private MessageInterface message;

    public BibliotecaApp() {
        this(new Message());
    }

    BibliotecaApp(MessageInterface message){
        this.message = message;
    }

    public void printWelcome() {
        String welcome = message.showWelcomeMessage();
        message.showWelcomeMessage();
        System.out.println(welcome);
    }

}
