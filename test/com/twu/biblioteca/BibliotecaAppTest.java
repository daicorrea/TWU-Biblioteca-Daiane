package com.twu.biblioteca;

import com.twu.biblioteca.Menu.MessageInterface;
import org.junit.Assert;
import org.junit.Test;

public class BibliotecaAppTest {

    class MessageMock implements MessageInterface {
        boolean didCallShowWelcomeMessage = false;
        int didCallShowWelcomeMessageCount = 0;

        @Override
        public String showWelcomeMessage() {
            didCallShowWelcomeMessage = true;
            didCallShowWelcomeMessageCount++;
            return null;
        }
    }

    @Test
    public void shouldCallShowWelcomeMessage() {
        MessageMock message = new MessageMock();
        BibliotecaApp biblioteca = new BibliotecaApp();

        biblioteca.printInit();

        Assert.assertTrue(message.didCallShowWelcomeMessage);
        Assert.assertEquals(2, message.didCallShowWelcomeMessageCount);
    }
}
