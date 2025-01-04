package org.example.service;

import jakarta.inject.Singleton;
import org.example.manager.NotificationManager;
import org.example.models.*;

import java.util.Collections;
import java.util.List;
import java.util.Map;

@Singleton
public class NotificationServiceImpl implements  NotificationService {

    NotificationManager notificationManager = new NotificationManager();

    @Override
    public Notification createNotification(NotificationType type) {
        try {
            return notificationManager.createNotification(type);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void sendNotification(Long id, DestinationDataDTO destinationData) {
        try {
            notificationManager.sendNotification(id, destinationData);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public Map<NotificationStatus, List<Notification>> getNotifications() {
        try {
            return notificationManager.getNotifications();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Collections.emptyMap();
    }

    @Override
    public void deleteNotification(Long id) {
        try {
            notificationManager.deleteNotification(id);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
