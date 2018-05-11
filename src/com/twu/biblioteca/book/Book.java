package com.twu.biblioteca.book;

public class Book {
    private String name;
    private String author;

    public Book(String book, String author) {
        this.name = book;
        this.author = author;
    }

    @Override
    public boolean equals(Object book) {
        Book otherBook = (Book) book;
        return this.toString().equals(otherBook.toString());
    }

    @Override
    public String toString() {
        return (String.format("|%-25s|", name) + (String.format("%-20s|", author)));
    }

}
