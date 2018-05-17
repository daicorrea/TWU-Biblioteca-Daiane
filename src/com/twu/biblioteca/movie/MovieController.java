package com.twu.biblioteca.movie;

import com.twu.biblioteca.Menu.MenuParser;
import com.twu.biblioteca.database.RepositoryAPI;
import com.twu.biblioteca.utils.MyPrinter;

import java.util.ArrayList;
import java.util.Scanner;

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
            if(!movie.isCheckedOut()) {
                builder.append(movie.toString());
                builder.append("\n");
            }
        }

        builder.append("----------------------------------------------------------------------------------------------------\n");
        return builder.toString();
    }

    public boolean changeMovieCheckedOutStatus(ArrayList<Movie> movieList, int movieID, boolean checkOutStatus) {
        for (Movie movie: movieList) {
            if (movie.getMovieID() == movieID && movie.isCheckedOut() != checkOutStatus) {
                movie.setCheckedOut(checkOutStatus);
                return true;
            }
        }
        return false;
    }

    public void checkOutMovie() {
        Scanner reader = new Scanner(System.in);
        MyPrinter myPrinter = new MyPrinter(System.out);

        myPrinter.print("Please enter the Movie ID you want to Checkout: ");
        int movieID = Integer.parseInt(reader.nextLine());

        boolean didCheckedOut = changeMovieCheckedOutStatus(getAllMovies(), movieID, true);

        if (didCheckedOut) {
            myPrinter.print("Thank you! Enjoy the book");
        } else {
            myPrinter.print("That book is not available");
        }

        menuParser.mainMenuSelect();
    }
}
