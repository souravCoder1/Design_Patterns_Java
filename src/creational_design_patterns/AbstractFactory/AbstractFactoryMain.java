package creational_design_patterns.AbstractFactory;

public class AbstractFactoryMain {
    public static void main(String[] args) {
        AbstractFactory abstractFactory = FactoryProducer.getFactory("ELECTRIC");
        abstractFactory.getCar("TOYOTA").assemble();
    }
}
