class Person1 {
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

public class UpdatePersonDetails {

    public static void main(String[] args) {
        Person1 myObj = new Person1();
        myObj.firstName = "Mwashigadi";  // Change firstName
        System.out.println(myObj.firstName);  // Print updated firstName
    }
}
