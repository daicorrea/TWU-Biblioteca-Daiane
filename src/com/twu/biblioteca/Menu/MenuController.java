package com.twu.biblioteca.Menu;

import com.twu.biblioteca.database.RepositoryAPI;

import java.util.ArrayList;

public class MenuController {

    private RepositoryAPI repositoryAPI;

    public MenuController() {
        this.repositoryAPI = new RepositoryAPI();
    }

    public ArrayList<String> getMainMenu() {
        return repositoryAPI.getMainMenu();
    }
}
