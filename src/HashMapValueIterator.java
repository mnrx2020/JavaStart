import java.util.HashMap;

public class HashMapValueIterator {
    public static void main(String[] args) {
        HashMap<String, String> capitalCities = new HashMap<String, String>();
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");

        // Iterate through the values in the HashMap
        for (String value : capitalCities.values()) {
            System.out.println(value);
        }
    }
}
