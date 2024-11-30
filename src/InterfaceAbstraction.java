// Define an interface Vehicle
interface Vehicle5 {
    // Abstract methods (no implementation)
    String getColor();
    String getModel();
    void setModel(String model);
    String accelerate();
}


// Class Car implementing the Vehicle interface
class Car5 implements Vehicle5 {
    private String color;
    private String model;
    private int lights;
    private String sitsColor;


    // Constructor for Car
    public Car5(String color, String model, int lights, String sitsColor) {
        this.color = color;
        this.model = model;
        this.lights = lights;
        this.sitsColor = sitsColor;
    }


    // Implement methods from Vehicle interface
    @Override
    public String getColor() {
        return this.color;
    }


    @Override
    public String getModel() {
        return this.model;
    }


    @Override
    public void setModel(String model) {
        this.model = model;
    }


    @Override
    public String accelerate() {
        return this.model + " accelerates very fast";
    }


    // Additional methods specific to Car
    public String refuel() {
        return this.model + " needs refueling";
    }


    public int getLights() {
        return this.lights;
    }


    public String getSitsColor() {
        return this.sitsColor;
    }
}


// Main class to test functionality
public class InterfaceAbstraction {
    public static void main(String[] args) {
        // Creating a Car object
        Car5 myAudi = new Car5("white", "Audi A4", 2, "black");


        // Using setter to change the model
        myAudi.setModel("BMW");


        // Testing interface methods and Car-specific method
        System.out.println(myAudi.accelerate()); // Output: BMW accelerates very fast
        System.out.println(myAudi.refuel());    // Output: BMW needs refueling
    }
}


