package com.twu.biblioteca.book;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static java.util.Arrays.asList;

public class BookController {

    private List<Book> bookList;

    public BookController(List<Book> bookList) {
        this.bookList = bookList;
    }

    public List<Book> getAllBooks() {
        ArrayList<Book> bookList = new ArrayList<>();
        bookList.add(new Book("Book1"));
        bookList.add(new Book("Book2"));
        return bookList;
    }

    //    private DataRepository dataRepository;
//
//    public BookController(DataRepository dataRepository) {
//        this.dataRepository = dataRepository;
//    }
//
//    public List<Book> getAllBooks() {
//        return dataRepository.getAllBooks();
//    }
}
