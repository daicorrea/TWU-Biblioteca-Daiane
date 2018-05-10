package com.twu.biblioteca;

import com.twu.biblioteca.Menu.Message;
import com.twu.biblioteca.Menu.MessageInterface;
import com.twu.biblioteca.book.BookController;

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

    public void printList() {
        BookController bookController = new BookController();
        System.out.println(bookController.getAllBooks());
    }

}
