public class DoWhileExample {
    public static void main(String[] args) {
        int i = 0;
        String test = "";
        do {
            test = test + i + " ";
            i++;
        }
        while (i < 5);
        System.out.println(test);
    }
}


