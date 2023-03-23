package creational_design_patterns.AbstractFactory;

public class ElectricToyota implements Car{
    @Override
    public void assemble() {
        System.out.println("assembling ElectricToyota...");
    }
}
