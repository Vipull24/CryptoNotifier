package org.example.sender;

import org.example.models.Notification;

import java.util.Map;

public interface SenderService {
    Long sendNotification(Notification notification, Map<String, String> destinationData);
}
