package com.twu.biblioteca.Menu;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.containsString;
import org.junit.Before;
import org.junit.Test;

public class MessageTest {

    private Message message = null;

    @Before
    public void setup() {
        message = new Message();
    }

    @Test
    public void shouldReturnMessageWithWelcome() {
        assertThat(message.showWelcomeMessage(), containsString("welcome"));
    }
}
