package creational_design_patterns.Factory;

public class NotificationService {
/*
    void sendNotification(NotificationType notificationType, String message) {
        switch (notificationType) {
            case SMS:
                Notification smsNotification = new SMSNotification();
                smsNotification.send(message);
                break;
            case PUSH:
                Notification pushNotification = new PushNotification();
                pushNotification.send(message);
                break;
            case EMAIL:
                new EmailNotification().send(message);
                break;
            default:
                throw new IllegalArgumentException("Invalid notification type: " + notificationType);
        }
    }
*/
    void sendNotification(String notificationType, String message) {
        if (notificationType.equalsIgnoreCase("SMS")) {
            Notification smsNotification = new SMSNotification();
            smsNotification.send(message);
        } else if (notificationType.equalsIgnoreCase("PUSH")) {
            Notification pushNotification = new PushNotification();
            pushNotification.send(message);
        } else if (notificationType.equalsIgnoreCase("EMAIL")) {
            new EmailNotification().send(message);
        } else {
            throw new IllegalArgumentException("Invalid notification type: " + notificationType);
        }
    }
}
