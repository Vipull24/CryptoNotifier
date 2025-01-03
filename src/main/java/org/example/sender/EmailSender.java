package org.example.sender;

import org.example.models.Notification;

import java.util.Map;

public class EmailSender implements SenderService {
    @Override
    public Long sendNotification(Notification notification, Map<String, String> destinationData) {
        return 1L;
    }
}
