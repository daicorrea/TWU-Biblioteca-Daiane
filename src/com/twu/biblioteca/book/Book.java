package com.twu.biblioteca.book;

public class Book {
    private final String name;

    public Book(String book1) {
        this.name = book1;
    }

    @Override
    public boolean equals(Object book) {
        Book otherBook = (Book) book;
        return name.equals(otherBook.name);
    }

    @Override
    public String toString() {
        return name;
    }
}
