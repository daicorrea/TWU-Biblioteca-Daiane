package com.twu.biblioteca;

import com.twu.biblioteca.menu.MessageInterface;
import org.junit.Assert;
import org.junit.Test;

public class BibliotecaAppTest {

    class MessageMock implements MessageInterface {
        boolean didCallShowWelcomeMessage = false;

        @Override
        public String showWelcomeMessage() {
            didCallShowWelcomeMessage = true;
            return null;
        }
    }

    @Test
    public void shouldCallShowWelcomeMessage() {
        MessageMock message = new MessageMock();
        BibliotecaApp biblioteca = new BibliotecaApp();

        biblioteca.callWelcomeMessage(message);
        Assert.assertTrue(message.didCallShowWelcomeMessage);
    }
}
