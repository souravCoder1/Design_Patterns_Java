package structural_design_pattern.Adapter;

public class Bus implements Vehicle {
    @Override
    public void accelerate() {
        System.out.println("bus is accelerating...");
    }
}
