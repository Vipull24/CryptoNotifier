package org.example.sender;

import org.example.models.Notification;

import java.util.Map;
import java.util.Random;

public class EmailSender implements SenderService {
    @Override
    public Long sendNotification(Notification notification, Map<String, String> destinationData) {
        Random random = new Random();
        if (random.nextBoolean()) {
            return 0L;
        }
        return 1L;
    }
}
