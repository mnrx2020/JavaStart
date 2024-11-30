import java.util.ArrayList;

public class CarListForEachExample {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        // Iterating over the ArrayList using the enhanced for loop
        for (String i : cars) {
            System.out.println(i);
        }
    }
}
