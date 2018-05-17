package com.twu.biblioteca.movie;

import com.twu.biblioteca.Menu.MenuParser;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;

public class MovieControllerTest {

    private static ArrayList<Movie> movieListMock;

    @BeforeClass
    public static void setUp() throws Exception {
        movieListMock = new ArrayList<>();
        movieListMock.add(new Movie(1,"Avengers: Infinity War", 2018,"Anthony Russo, Joe Russo", 7));
        movieListMock.add(new Movie(2,"A Wrinkle in Time", 2018,"Ava DuVernay", 5));
        movieListMock.add(new Movie(3,"Black Panther", 2018,"Ryan Coogler", 8));
        movieListMock.add(new Movie(4,"Love, Simon", 2018,"Greg Berlanti", 0));
    }

    @Test
    public void shouldReturnAllMovies() {
        MovieController movieController = new MovieController(new MenuParser());
        Assert.assertEquals(movieListMock, movieController.getAllMovies());
    }
}
