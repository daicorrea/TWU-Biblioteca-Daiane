package com.twu.biblioteca.Menu;

public class MenuParser {
    public Menu parse(String option) {
        if (option.equals("1")) {
            return Menu.LIST_BOOKS;
        } else if (option.equals("2")) {
            return Menu.QUIT;
        } else {
            throw new RuntimeException("Invalid Option");
        }
    }
}
