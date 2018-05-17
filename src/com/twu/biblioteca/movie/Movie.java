package com.twu.biblioteca.movie;

public class Movie {
    private int movieID;
    private String name;
    private int year;
    private String director;
    private int movieRating;

    public Movie(int movieID, String name, int year, String director, int movieRating) {
        this.movieID = movieID;
        this.name = name;
        this.year = year;
        this.director = director;
        this.movieRating = movieRating;
    }

    @Override
    public boolean equals(Object movie) {
        Movie otherMovie = (Movie) movie;
        return this.toString().equals(otherMovie.toString());
    }

    @Override
    public String toString() {
        return (String.format("|%-8s|", movieID) + String.format("%-30s|", name) + (String.format("%-6s|", year) + String.format("%-30s|", director) + String.format("%-20s|", movieRating)));
    }
}
