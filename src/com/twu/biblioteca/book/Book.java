package com.twu.biblioteca.book;

public class Book {
    private int bookID;
    private String name;
    private String author;
    private int releaseYear;
    private boolean checkedOut;

    public Book(int bookID, String book, String author, int releaseYear) {
        this.bookID = bookID;
        this.name = book;
        this.author = author;
        this.releaseYear = releaseYear;
        this.checkedOut = false;
    }

    public Book(int bookID, String book, String author, int releaseYear, boolean checkedOut) {
        this.bookID = bookID;
        this.name = book;
        this.author = author;
        this.releaseYear = releaseYear;
        this.checkedOut = checkedOut;
    }

    public boolean isCheckedOut() {
        return checkedOut;
    }

    public int getBookID() {
        return bookID;
    }

    public void setCheckedOut(boolean checkedOut) {
        this.checkedOut = checkedOut;
    }

    @Override
    public boolean equals(Object book) {
        Book otherBook = (Book) book;
        return this.toString().equals(otherBook.toString());
    }

    @Override
    public String toString() {
        return (String.format("|%-40s|", name) + (String.format("%-20s|", author)) + (String.format("%-12s|", releaseYear)) + (String.format("%-12s|", checkedOut)));
    }
}
