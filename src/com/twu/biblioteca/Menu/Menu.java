package com.twu.biblioteca.Menu;

import java.util.ArrayList;

public class Menu {

    private ArrayList<String> mainMenu;

    public Menu(ArrayList<String> mainMenu) {
        this.mainMenu = mainMenu;
    }

    @Override
    public boolean equals(Object menu) {
        Menu otherMenu = (Menu) menu;
        return this.toString().equals(otherMenu.toString());
    }

    @Override
    public String toString() {
        return String.join(", ", this.mainMenu);
    }
}
