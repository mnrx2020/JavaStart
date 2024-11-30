import java.util.ArrayList;
import java.util.Collections;

public class IntegerListSortExample {
    public static void main(String[] args) {
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(33);
        myNumbers.add(15);
        myNumbers.add(20);
        myNumbers.add(34);
        myNumbers.add(8);
        myNumbers.add(12);

        // Sorting the ArrayList of integers
        Collections.sort(myNumbers);

        // Printing the sorted list
        for (int i : myNumbers) {
            System.out.println(i);
        }
    }
}
