package com.twu.biblioteca.Menu;

public enum Menu {
    LIST_BOOKS("1 - List Books"), CHECKOUT("2 - Checkout Book"), RETURN_BOOK("3 - Return Book"), LIST_MOVIES("4 - List Movies"), QUIT("0 - Quit"), OTHER("");

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
