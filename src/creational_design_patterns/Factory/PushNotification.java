package creational_design_patterns.Factory;

public class PushNotification implements Notification{
    @Override
    public void send(String message) {
        System.out.println("Sending Push notification " + message);
    }
}
