package com.twu.biblioteca.book;

import java.util.List;

public class BookController {

    private BookDataRepository bookDataRepository;

    public BookController(BookDataRepository bookDataRepository) {
        this.bookDataRepository = bookDataRepository;
    }

    public List<Book> getAllBooks() {
        return bookDataRepository.getAllBooks();
    }
}
