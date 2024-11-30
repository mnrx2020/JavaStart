import java.util.ArrayList;

public class CarListSizeExample {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars.size()); // Outputs the number of elements in the list
    }
}
