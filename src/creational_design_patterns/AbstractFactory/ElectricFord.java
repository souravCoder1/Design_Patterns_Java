package creational_design_patterns.AbstractFactory;

public class ElectricFord implements Car{
    @Override
    public void assemble() {
        System.out.println("assembling ElectricFord...");
    }
}
