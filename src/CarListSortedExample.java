import java.util.ArrayList;
import java.util.Collections;

public class CarListSortedExample {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        // Sorting the ArrayList in ascending order
        Collections.sort(cars);

        // Printing sorted list
        for (String i : cars) {
            System.out.println(i);
        }
    }
}
