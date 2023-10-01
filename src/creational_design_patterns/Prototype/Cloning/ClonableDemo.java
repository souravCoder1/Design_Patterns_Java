package creational_design_patterns.Prototype.Cloning;

public class ClonableDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person john = new Person(new String[]{"John", "Doe"}, new Address("London Road", 123));

        // shallow copy, not good:
        //Person jane = john;
        // oops, also changed john

        Person jane = (Person) john.clone();
        jane.names[0] = "Jane"; // clone is (originally) shallow copy
        jane.address.houseNumber = 124;

        System.out.println(jane);
        System.out.println(john);
    }
}
