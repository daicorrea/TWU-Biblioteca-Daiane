package com.twu.biblioteca.Menu;

public enum Menu {
    LIST_BOOKS("1 - List Books"),QUIT("2 - Quit"), OTHER("");

    public String menuOption;
    Menu(String menuOption) {
        this.menuOption = menuOption;
    }

    public static String buildPrintedMenu() {
        StringBuilder builder = new StringBuilder();

        for(Menu menu: values()) {
            builder.append(menu.menuOption);
            builder.append("\n");
        }
        return builder.toString();
    }
}
