package creational_design_patterns.builder;

public class App {
    public static void main(String[] args) {
/* User user = new User("sourav", 35, "abc", ""); // new object of user class
System.out.println(user);

    User user1 = new User("sourav", 35, "abc"); // new object of user class
    System.out.println(user1);

    User user2 = new User("sourav", "abc", "sp@gmail.com"); // new object of user class
    System.out.println(user2);

    User user3 = new User(); // user3 is object reference --------> memory location 
    user3.setAge(20);   
    user3.setAddress("NYC");
    user3.setName("NAme");
    System.out.println(user3);*/
        // Immutable vs mutable // builder is mostly on immutable class
        // Final class, no setter, private final variables, private constructor

        User.UserBuilder user = new User.UserBuilder("John").email("abc@gmail.com")
                .age(20).address("UK");

        // how to call an inner class

        User user1 = new User.UserBuilder("John").email("abc@gmail.com")
                .age(20).address("UK").build();
    }
}