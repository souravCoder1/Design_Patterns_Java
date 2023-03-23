package creational_design_patterns.AbstractFactory;

public class ElectricCarFactory implements AbstractFactory {
    @Override
    public Car getCar(String type) {
        if(type.equalsIgnoreCase("FORD")){
            return new ElectricFord();
        }else if(type.equalsIgnoreCase("TOYOTA")) {
            return new ElectricToyota();
        }
        return null;
    }
}
