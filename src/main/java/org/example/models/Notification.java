package org.example.models;

import java.io.Serializable;
import java.security.Timestamp;
import java.util.Objects;

public abstract class Notification implements Serializable {
    Long id;
    NotificationType type;
    Long timestamp;

    public Notification() {
    }

    public Notification(Long id, NotificationType type, Long timestamp) {
        this.id = id;
        this.type = type;
        this.timestamp = timestamp;
    }

    public Long getId() {
        return id;
    }

    public NotificationType getType() {
        return type;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setType(NotificationType type) {
        this.type = type;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public abstract void getNotificationPayload();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Notification)) return false;
        Notification that = (Notification) o;
        return Objects.equals(id, that.id) && type == that.type && Objects.equals(timestamp, that.timestamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, type, timestamp);
    }

    @Override
    public String toString() {
        return "Notification{" +
                "id=" + id +
                ", type=" + type +
                ", timestamp=" + timestamp +
                '}';
    }
}
