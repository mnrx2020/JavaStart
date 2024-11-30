enum Level1 {
    LOW,
    MEDIUM,
    HIGH
}

public class EnumSwitchTest {
    public static void main(String[] args) {
        Level1 myVar = Level1.MEDIUM;

        switch(myVar) {
            case LOW:
                System.out.println("Low level");
                break;
            case MEDIUM:
                System.out.println("Medium level");
                break;
            case HIGH:
                System.out.println("High level");
                break;
        }
    }
}


