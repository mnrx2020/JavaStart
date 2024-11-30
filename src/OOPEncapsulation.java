class Vehicle3{
    private String color;
    private String model;
    public Vehicle3(String color, String model){
        this.color = color;
        this.model = model;
    }
    public String colorf(){
        return this.color;
    }
    public String accelerate(){
        return this.model + " " + "accelerates very fast";
    }
    public String getAccelerate(){
        return this.model + " " + "accelerates very fast";
    }
    public void setAccelerate(String model2){
        this.model = model2;
    }
}




class Car3 extends Vehicle3{
    int lights;
    String sitsColor;
    public Car3(String color, String model,int lights,String sitsColor){
        super(color, model);
        this.lights = lights;
        this.sitsColor = sitsColor;
    }
    public String refuel(){
        return getAccelerate();
    }
}




public class OOPEncapsulation {
    public static void main(String[] args) {
        Vehicle3 audi = new Vehicle3("white","Audi A4");
        Car3 myAudi = new Car3("white","Audi A4",2,"black");
        myAudi.setAccelerate("BMW");
        System.out.println(audi.accelerate());
        System.out.println(myAudi.refuel());
    }
}


