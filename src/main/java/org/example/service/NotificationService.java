package org.example.service;

import org.example.models.DestinationType;
import org.example.models.Notification;
import org.example.models.NotificationStatus;
import org.example.models.NotificationType;

import java.util.List;
import java.util.Map;

public interface NotificationService {
    Notification createNotification(NotificationType type);

    void sendNotification(Long id, DestinationType destination, Map<String, String> destinationData);

    Map<NotificationStatus, List<Notification>> getNotifications();

    void deleteNotification(Long id);
}
