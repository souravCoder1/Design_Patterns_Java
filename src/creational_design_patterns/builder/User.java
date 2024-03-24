package creational_design_patterns.builder;

public class User { // strong inside DB
private String name; //String is a class and null the default value
private int age; //0 int is a primitive type and Integer is Wapper class (float -> Float)
private String address;
private String email;

private User(UserBuilder userBuilder) { // has-a relation(aggregation and composition) and is-a relation
    this.name=userBuilder.Iname;
    this.email=userBuilder.Iemail;
    this.age=userBuilder.Iage;
    this.address=userBuilder.Iaddress;
}

static class UserBuilder {
    private String Iname;
    private int Iage; //0 int is a primitive type and Integer is Wapper class (float -> Float)
    private String Iaddress;
    private String Iemail;
    public UserBuilder(String name) { // constructor
        this.Iname = name;
    }

    UserBuilder age(int newAge) { //addon
        this.Iage=newAge;
        return this;
    }

    UserBuilder address(String newAddress) {
        this.Iaddress=newAddress;
        return this;
    }
    UserBuilder email(String newEmail) {
        this.Iemail=newEmail;
        return this;
    }

    User build() {
        return new User(this);
    }
}
}