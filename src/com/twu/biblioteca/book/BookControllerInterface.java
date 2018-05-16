package com.twu.biblioteca.book;

import java.util.ArrayList;

public interface BookControllerInterface {
    ArrayList<Book> getAllBooks();
    String buildPrintedBookList();
    void checkOutBook();
}
