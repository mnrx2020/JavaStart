class Person2 {
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

public class PersonTest {
    public static void main(String[] args) {
        Person2 myObj = new Person2();
        System.out.println(myObj.nameX());  // Output: Catherine Wakesho
    }
}
