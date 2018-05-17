package com.twu.biblioteca.movie;

import com.twu.biblioteca.Menu.MenuParser;
import com.twu.biblioteca.database.RepositoryAPI;

import java.util.ArrayList;

public class MovieController implements MovieControllerInterface {
    private RepositoryAPI repositoryAPI;
    private MenuParser menuParser;

    public MovieController(MenuParser menuParser) {
        this.repositoryAPI = new RepositoryAPI();
        this.menuParser = menuParser;
    }

    public ArrayList<Movie> getAllMovies() {
        return repositoryAPI.getAllMovies();
    }


    public String buildPrintedAvailableMovieList() {
        StringBuilder builder = new StringBuilder();

        builder.append("\nThis are all the movies we have available right now:\n");
        builder.append("----------------------------------------------------------------------------------------------------\n");
        builder.append(String.format("|%-8s|", "MOVIE ID") + String.format("%-30s|", "MOVIE NAME") + (String.format("%-6s|", "YEAR")) + (String.format("%-30s|", "DIRECTOR")) + (String.format("%-20s|\n", "RATING")));
        builder.append("----------------------------------------------------------------------------------------------------\n");

        for(Movie movie: getAllMovies()) {
            builder.append(movie.toString());
            builder.append("\n");
        }

        builder.append("----------------------------------------------------------------------------------------------------\n");
        return builder.toString();
    }
}
