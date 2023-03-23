package structural_design_pattern.Adapter;

public class Car implements Vehicle {
    @Override
    public void accelerate() {
        System.out.println("car is accelerating...");
    }
}
