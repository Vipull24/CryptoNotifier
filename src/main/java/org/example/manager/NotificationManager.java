package org.example.manager;

import org.example.models.*;
import org.example.sender.EmailSender;
import org.example.sender.SenderService;

import java.util.List;
import java.util.Map;

public class NotificationManager {
    Map<Long, Notification> notifications;
    Map<NotificationStatus, List<Notification>> notificationsByStatus;

    public Notification createNotification(NotificationType type) {
        Notification notification;
        switch (type) {
            case MARKET_UPDATE:
                notification = new MarketUpdateNotification();
                break;
            default:
                throw new IllegalArgumentException("Invalid notification type");
        }

        notification.getNotificationPayload();
        notifications.put(notification.getId(), notification);
        return notification;
    }

    public void sendNotification(Long id, DestinationType type, Map<String, String> destinationData) {
        Notification notification = notifications.get(id);
        if (notification == null) {
            throw new IllegalArgumentException("Invalid notification id");
        }

        SenderService senderService;
        switch (type) {
            case EMAIL:
                senderService = new EmailSender();
                notificationsByStatus.get(NotificationStatus.SENT).add(notification);
                notificationsByStatus.get(NotificationStatus.OUTSTANDING).remove(notification);
                Long status = senderService.sendNotification(notification, destinationData);
                if (status == 0) {
                    notificationsByStatus.get(NotificationStatus.FAILED).add(notification);
                } else if (status == 1) {
                    notificationsByStatus.get(NotificationStatus.OUTSTANDING).remove(notification);
                }
                break;
            default:
                throw new IllegalArgumentException("Invalid destination type");
        }
    }

    public Map<NotificationStatus, List<Notification>> getNotifications() {
        return notificationsByStatus;
    }

    public void deleteNotification(Long id) {
        try {
            notifications.remove(id);
        } catch (Exception e) {
            throw new IllegalArgumentException("Invalid notification id");
        }
    }
}
