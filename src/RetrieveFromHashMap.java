import java.util.HashMap;

public class RetrieveFromHashMap {
    public static void main(String[] args) {
        HashMap<String, String> capitalCities = new HashMap<String, String>();
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");

        // Retrieve and print the value associated with "England"
        System.out.println(capitalCities.get("England"));
    }
}
