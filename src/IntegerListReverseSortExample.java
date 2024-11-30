import java.util.ArrayList;
import java.util.Collections;  // Import the Collections class

public class IntegerListReverseSortExample {
    public static void main(String[] args) {
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(33);
        myNumbers.add(15);
        myNumbers.add(20);
        myNumbers.add(34);
        myNumbers.add(8);
        myNumbers.add(12);

        // Sorting the ArrayList of integers in reverse order
        Collections.sort(myNumbers, Collections.reverseOrder());

        // Printing the sorted list in descending order
        for (int i : myNumbers) {
            System.out.println(i);
        }
    }
}
