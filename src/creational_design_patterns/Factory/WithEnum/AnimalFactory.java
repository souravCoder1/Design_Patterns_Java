package creational_design_patterns.Factory.WithEnum;

public class AnimalFactory {
    public static Animal getAnimal(AnimalType animalType){
        if(animalType == AnimalType.CAT){
            return new Cat();
        }
        else if(animalType == AnimalType.DOG){
            return new Dog();
        }
        else if(animalType == AnimalType.LION){
            return new Lion();
        }
        else if(animalType == AnimalType.TIGER){
            return new Tiger();
        }
        return null;
    }
}
