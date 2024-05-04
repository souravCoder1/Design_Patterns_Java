package creational_design_patterns.Factory;

public class EmailNotification implements Notification{
    @Override
    public void send(String message) {
        System.out.println("Sending Email notification " + message);
    }
}
