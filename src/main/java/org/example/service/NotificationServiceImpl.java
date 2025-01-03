package org.example.service;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import org.example.manager.NotificationManager;
import org.example.models.DestinationType;
import org.example.models.Notification;
import org.example.models.NotificationStatus;
import org.example.models.NotificationType;

import java.util.Collections;
import java.util.List;
import java.util.Map;

@Path("/notification")
public class NotificationServiceImpl implements  NotificationService {

    NotificationManager notificationManager = new NotificationManager();

    @Path("/create")
    @Produces("application/json")
    @Consumes("application/json")
    @Override
    public Notification createNotification(NotificationType type) {
        try {
            return notificationManager.createNotification(type);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Path("/send/{id}")
    @Produces("application/json")
    @Consumes("application/json")
    @Override
    public void sendNotification(@PathParam("id") Long id, DestinationType destination, Map<String, String> destinationData) {

    }

    @Path("/getAll")
    @Produces("application/json")
    @Consumes("application/json")
    @Override
    public Map<NotificationStatus, List<Notification>> getNotifications() {
        return Collections.emptyMap();
    }

    @Path("/delete/{id}")
    @Override
    public void deleteNotification(@PathParam("id") Long id) {

    }
}
