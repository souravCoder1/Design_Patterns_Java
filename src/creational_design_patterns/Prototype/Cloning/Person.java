package creational_design_patterns.Prototype.Cloning;

import java.util.Arrays;

// Cloneable is a marker interface
public class Person implements Cloneable {
    public String[] names;
    public Address address;

    public Person(String[] names, Address address) {
        this.names = names;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "names=" + Arrays.toString(names) +
                ", address=" + address +
                '}';
    }

    // base class clone() is protected
    // deep copy
    @Override
    public Object clone() throws CloneNotSupportedException {
        return new Person(
                // clone() creates a shallow copy!
                /*names */ names.clone(),
                (Address) address.clone()
        );
    }
}
