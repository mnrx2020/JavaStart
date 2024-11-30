class Person3 {
    // Initialize attributes
    String firstName;
    String lastName;
    String color;
    int age;

    // Constructor to initialize attributes
    public Person3(String firstName, String lastName, String color, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.color = color;
        this.age = age;
    }

    // Method to return full name
    public String nameX() {
        return this.firstName + " " + this.lastName;
    }

    // Method to return age
    public int ageX() {
        return this.age;
    }
}

public class PersonTestConstructor {
    public static void main(String[] args) {
        // Create a Person object with provided attributes
        Person3 myObj = new Person3("Catherine", "Wakesho", "dark", 31);
        // Output the full name
        System.out.println(myObj.nameX());  // Output: Catherine Wakesho
    }
}
