package org.example.models;

public abstract class Notification {
    Long id;
    NotificationType type;

    public Long getId() {
        return id;
    }

    public NotificationType getType() {
        return type;
    }

    public abstract void getNotificationPayload();
}
