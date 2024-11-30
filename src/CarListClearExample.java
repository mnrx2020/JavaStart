import java.util.ArrayList;

public class CarListClearExample {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.clear(); // Clears all items from the list
        System.out.println(cars);
    }
}
