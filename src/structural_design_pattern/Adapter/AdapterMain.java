package structural_design_pattern.Adapter;

public class AdapterMain {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle bus = new Bus();
        Vehicle bicycle = new BicycleAdapter(new Bicycle());

        car.accelerate();
        bus.accelerate();
        bicycle.accelerate();
    }
}
