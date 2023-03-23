package creational_design_patterns.AbstractFactory;

public class PetrolFord implements Car{
    @Override
    public void assemble() {
        System.out.println("assembling PetrolFord...");
    }
}
