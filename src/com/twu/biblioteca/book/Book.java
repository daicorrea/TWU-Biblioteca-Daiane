package com.twu.biblioteca.book;

public class Book {
    private String name;
    private String author;
    private int releaseYear;

    public Book(String book, String author, int releaseYear) {
        this.name = book;
        this.author = author;
        this.releaseYear = releaseYear;
    }

    @Override
    public boolean equals(Object book) {
        Book otherBook = (Book) book;
        return this.toString().equals(otherBook.toString());
    }

    @Override
    public String toString() {
        return (String.format("|%-25s|", name) + (String.format("%-20s|", author)) + (String.format("%-12s|", releaseYear)));
    }

}
