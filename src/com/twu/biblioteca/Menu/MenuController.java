package com.twu.biblioteca.Menu;

import com.twu.biblioteca.database.RepositoryAPI;

public class MenuController {

    private RepositoryAPI repositoryAPI;

    public MenuController() {
        this.repositoryAPI = new RepositoryAPI();
    }

    public Menu getMainMenu() {
        return repositoryAPI.getMainMenu();
    }
}
