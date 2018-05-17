package com.twu.biblioteca.Menu;

import org.junit.Assert;
import org.junit.Test;

public class MenuParserTest {

    @Test
    public void shouldValidateMainMenu() {
        MenuParser menuParser = new MenuParser();
        Assert.assertEquals(menuParser.parse("0"), Menu.QUIT);
        Assert.assertEquals(menuParser.parse("1"), Menu.LIST_BOOKS);
        Assert.assertEquals(menuParser.parse("2"), Menu.CHECKOUT);
        Assert.assertEquals(menuParser.parse("3"), Menu.RETURN_BOOK);
        Assert.assertEquals(menuParser.parse("4"), Menu.LIST_MOVIES);
        Assert.assertEquals(menuParser.parse("5"), Menu.OTHER);
    }
}
