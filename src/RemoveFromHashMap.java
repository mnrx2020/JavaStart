import java.util.HashMap;

public class RemoveFromHashMap {
    public static void main(String[] args) {
        HashMap<String, String> capitalCities = new HashMap<String, String>();
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");

        // Remove the key-value pair with the key "England"
        capitalCities.remove("England");

        // Print the updated HashMap
        System.out.println(capitalCities);
    }
}
