package creational_design_patterns.Factory;

public class Main {
    public static void main(String[] args) {
        //factory
        NotificationService notificationService = new NotificationService();
        notificationService.sendNotification(NotificationType.PUSH, "This is a PUSH notification");
        notificationService.sendNotification(NotificationType.SMS, "This is a SMS notification");
        notificationService.sendNotification(NotificationType.EMAIL, "This is a EMAIL notification");
        notificationService.sendNotification(NotificationType.FAX, "This is a FAX notification");

        // alternative with factory design
        notificationService.sendNotification("push", "push");

        // without factory design
        Notification notification = new EmailNotification();

        if(notification instanceof EmailNotification)
            System.out.println("Email");
        else if (notification instanceof PushNotification)
            System.out.println("PUSH");
        else if (notification instanceof SMSNotification)
            System.out.println("SMS");
        else
            System.out.println("Invalid");


    }
}
