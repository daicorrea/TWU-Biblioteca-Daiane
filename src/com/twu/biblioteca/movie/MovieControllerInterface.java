package com.twu.biblioteca.movie;

import java.util.ArrayList;

public interface MovieControllerInterface {
    ArrayList<Movie> getAllMovies();

    String buildPrintedAvailableMovieList();
}

