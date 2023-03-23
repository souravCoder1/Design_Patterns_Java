package creational_design_patterns.AbstractFactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(String factory) {
        if(factory.equalsIgnoreCase("ELECTRIC")) {
            return new ElectricCarFactory();
        }
        if(factory.equalsIgnoreCase("PETROL")) {
            return new PetrolCarFactory();
        }
        return null;
    }
}
