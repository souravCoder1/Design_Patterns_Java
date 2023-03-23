package creational_design_patterns.Factory.WithEnum;

public class AnimalMain {
    public static void main(String[] args) {
        Animal animal = AnimalFactory.getAnimal(AnimalType.DOG);
        animal.eat();
    }
}
