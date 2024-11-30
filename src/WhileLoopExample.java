public class WhileLoopExample {
    public static void main(String[] args) {
        int i = 0;
        String test = "";
        while (i < 5) {
            test = test + i + " ";
            i++;
        }
        System.out.println(test);
    }
}
