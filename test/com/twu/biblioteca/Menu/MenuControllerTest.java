package com.twu.biblioteca.Menu;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;

public class MenuControllerTest {
    private static Menu menu;
    private static ArrayList mainMenuList;

    @BeforeClass
    public static void setUp() throws Exception {
        mainMenuList = new ArrayList<String>();
        mainMenuList.add("1. List Books");
        menu = new Menu(mainMenuList);
    }

    @Test
    public void shouldReturnAMenu() {
        MenuController menuController = new MenuController();
        Assert.assertEquals(menuController.getMainMenu(), menu);
    }
}
