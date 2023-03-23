package creational_design_patterns.AbstractFactory;

public class PetrolCarFactory implements AbstractFactory {
    @Override
    public Car getCar(String type) {
        if(type.equalsIgnoreCase("FORD")){
            return new PetrolFord();
        }else if(type.equalsIgnoreCase("TOYOTA")) {
            return new PetrolToyota();
        }
        return null;
    }
}
