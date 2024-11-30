// Abstract class Vehicle
abstract class Vehicle4 {
    private String color;
    private String model;


    // Constructor for Vehicle
    public Vehicle4(String color, String model) {
        this.color = color;
        this.model = model;
    }


    // Getter for color
    public String getColor() {
        return this.color;
    }


    // Getter for model
    public String getModel() {
        return this.model;
    }


    // Setter for model
    public void setModel(String model2) {
        this.model = model2;
    }


    // Abstract method for acceleration
    public abstract String accelerate();
}


// Subclass Car extending Vehicle
class Car4 extends Vehicle4 {
    private int lights;
    private String sitsColor;


    // Constructor for Car
    public Car4(String color, String model, int lights, String sitsColor) {
        super(color, model);
        this.lights = lights;
        this.sitsColor = sitsColor;
    }
    public int getLights(){
        return this.lights;
    }
    public String getSitsColor(){
        return this.sitsColor;
    }


    // Implementing the abstract method from Vehicle
    @Override
    public String accelerate() {
        return getModel() + " accelerates very fast";
    }


    // Additional method specific to Car
    public String refuel() {
        return getModel() + " needs refueling";
    }
}


// Main class to test functionality
public class OOPAbstraction {
    public static void main(String[] args) {
        // Creating a Car object
        Car4 myAudi = new Car4("white", "Audi A4", 2, "black");


        // Using setter to change the model
        myAudi.setModel("BMW");


        // Testing abstract method and Car-specific method
        System.out.println(myAudi.accelerate()); // Output: BMW accelerates very fast
        System.out.println(myAudi.refuel());    // Output: BMW needs refueling
    }
}


