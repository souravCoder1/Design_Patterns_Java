package creational_design_patterns.AbstractFactory;

public class PetrolToyota implements Car{
    @Override
    public void assemble() {
        System.out.println("assembling PetrolToyota...");
    }
}
