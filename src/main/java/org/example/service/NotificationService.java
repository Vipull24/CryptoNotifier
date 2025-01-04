package org.example.service;

import jakarta.ws.rs.*;
import org.example.models.*;

import java.util.List;
import java.util.Map;

@Path("/notification")
public interface NotificationService {
    @POST
    @Path("/create/{type}")
    @Consumes("application/json")
    @Produces("application/json")
    Notification createNotification(@PathParam("type") NotificationType type);

    @POST
    @Path("/send/{id}")
    void sendNotification(@PathParam("id") Long id, DestinationDataDTO destinationData);

    @GET
    @Path("/getAll")
    @Produces("application/json")
    Map<NotificationStatus, List<Notification>> getNotifications();

    @DELETE
    @Path("/delete/{id}")
    void deleteNotification(@PathParam("id") Long id);
}
