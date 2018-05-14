package com.twu.biblioteca.Menu;

import org.junit.Assert;
import org.junit.Test;

public class MenuParserTest {

    @Test
    public void shouldReturnListBookMenu() {
        MenuParser menuParser = new MenuParser();
        Assert.assertEquals(menuParser.parse("1"), Menu.LIST_BOOKS);
        Assert.assertEquals(menuParser.parse("2"), Menu.QUIT);
        Assert.assertEquals(menuParser.parse("5"), Menu.OTHER);
    }
}
