class Vehicle{
    int tyres;
    int wheel;
    String color;
    String model;
    public Vehicle(int tyres, int wheel, String color, String model){
        this.tyres = tyres;
        this.wheel = wheel;
        this.color = color;
        this.model = model;
    }
    public String brake(){
        return this.model + " " + "has some good braking system";
    }
    public String speed(){
        return this.model + " " + "has a top notch speed";
    }
    public String accelerate(){
        return this.model + " " + "accelerates very fast";
    }
}


class Car extends Vehicle{
    int lights;
    String sitsColor;
    public Car(int tyres, int wheel, String color, String model,int lights,String sitsColor){
        super(tyres, wheel, color, model);
        this.lights = lights;
        this.sitsColor = sitsColor;
    }
    public String playMusic(){
        return this.model + " " + "plays some good music";
    }
    public String startEngine(){
        return this.model + " " + "engine starts very fast";
    }
    public String refuel(){
        return this.model + " " + "consumes a lot of fuel";
    }
}


public class Main {
    public static void main(String[] args) {
        Vehicle audi = new Vehicle(4,1,"white","Audi A4");
        Car myAudi = new Car(4,1,"white","Audi A4",2,"black");
        System.out.println(audi.accelerate());
        System.out.println(myAudi.refuel());
    }
}
