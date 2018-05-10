package com.twu.biblioteca;

import com.twu.biblioteca.Menu.Message;
import com.twu.biblioteca.Menu.Printable;

public class BibliotecaApp {

    private Printable message;

    public BibliotecaApp() {
        this(new Message());
    }

    BibliotecaApp(Printable message){
        this.message = message;
    }

    public void printWelcome() {
        String welcome = message.showWelcomeMessage();
        message.showWelcomeMessage();
        System.out.println(welcome);

    }
}
