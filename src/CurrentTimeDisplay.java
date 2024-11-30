import java.time.LocalTime;  // import the LocalTime class

public class CurrentTimeDisplay {
    public static void main(String[] args) {
        LocalTime myObj = LocalTime.now();  // Get the current time
        System.out.println(myObj);  // Display the current time
    }
}
