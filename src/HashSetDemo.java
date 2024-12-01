// Import the HashSet class
import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> cars = new HashSet<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW"); // Duplicate element, won't be added again
        cars.add("Mazda");
        System.out.println(cars);
    }
}
