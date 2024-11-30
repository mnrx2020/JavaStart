class Person {
    // Initialize attributes
    String firstName = "Catherine";
    String lastName = "Wakesho";
    String color = "dark";
    int age = 31;

    // Declare method to clarify name
    public String nameX() {
        return this.firstName + " " + this.lastName;
    }

    // Declare method to call age
    public int ageX() {
        return this.age;
    }
}

public class PersonDetails {

    public static void main(String[] args) {
        Person myObj = new Person();
        System.out.println(myObj.firstName);
    }
}
