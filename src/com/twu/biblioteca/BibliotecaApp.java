package com.twu.biblioteca;

import com.twu.biblioteca.Menu.Message;
import com.twu.biblioteca.Menu.MessageInterface;
import com.twu.biblioteca.book.Book;
import com.twu.biblioteca.book.BookController;

import java.util.ArrayList;

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

    public void printBookList() {
        BookController bookController = new BookController();
        ArrayList<Book> bookList = bookController.getAllBooks();
        for(int i = 0; i < bookList.size(); i++) {
            System.out.println(bookList.get(i).toString());
        }
    }

}
