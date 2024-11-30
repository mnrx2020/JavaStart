import java.time.LocalDateTime;  // import the LocalDateTime class

public class CurrentDateTimeDisplay {
    public static void main(String[] args) {
        LocalDateTime myObj = LocalDateTime.now();  // Get the current date and time
        System.out.println(myObj);  // Display the current date and time
    }
}
