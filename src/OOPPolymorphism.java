class Vehicle2{
    int tyres;
    int wheel;
    String color;
    String model;
    public Vehicle2(int tyres, int wheel, String color, String model){
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


class Car2 extends Vehicle2{
    int lights;
    String sitsColor;
    public Car2(int tyres, int wheel, String color, String model,int lights,String sitsColor){
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
    public String accelerate(){
        return this.model + " " + "accelerates very fast and its absolutely fine";
    }
}


public class OOPPolymorphism {
    public static void main(String[] args) {
        Vehicle2 audi = new Vehicle2(4,1,"white","Audi A4");
        Car2 myAudi = new Car2(4,1,"white","Audi A4",2,"black");
        System.out.println(audi.accelerate());
        System.out.println(myAudi.accelerate());
    }
}
