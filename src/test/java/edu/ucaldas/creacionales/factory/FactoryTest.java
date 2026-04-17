package edu.ucaldas.creacionales.factory;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FactoryTest {

    @Test
    void shouldCreateEmailNotification() {
        NotificationFactory factory = new EmailFactory();
        Notification notification = factory.createNotification();

        assertNotNull(notification);
        assertTrue(notification instanceof EmailNotification);
    }

    @Test
    void shouldCreateSMSNotification() {
        NotificationFactory factory = new SMSFactory();
        Notification notification = factory.createNotification();

        assertNotNull(notification);
        assertTrue(notification instanceof SMSNotification);
    }
}
