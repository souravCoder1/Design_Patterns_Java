package creational_design_patterns.Prototype.Cloning;

public class Demo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person john = new Person(new String[]{"John", "Doe"}, new Address("London Road", 123));

        Person jane = (Person) john.clone();
        jane.names[0] = "Jane";
        jane.address.houseNumber = 124;

        System.out.println(jane);
        System.out.println(john);
    }
}
