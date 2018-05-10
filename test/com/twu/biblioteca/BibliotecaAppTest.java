package com.twu.biblioteca;

import com.twu.biblioteca.Menu.Message;
import com.twu.biblioteca.Menu.Printable;
import org.junit.Assert;
import org.junit.Test;

public class BibliotecaAppTest {

    class MessageMock implements Printable {
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
        BibliotecaApp biblioteca = new BibliotecaApp(message);

        biblioteca.printWelcome();

        Assert.assertTrue(message.didCallShowWelcomeMessage);
        Assert.assertEquals(2, message.didCallShowWelcomeMessageCount);
    }
}
