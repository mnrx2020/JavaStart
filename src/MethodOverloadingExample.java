public class MethodOverloadingExample {
    static int myFunction(int a, int b){
        int product = a * b;
        return product;
    }
    static String myFunction(String s, String s1){
        String c = s + " " + s1;
        return c;
    }
    public static void main(String[] args) {
        System.out.println(myFunction(4, 3));
        System.out.println(myFunction("Hello", "James"));
    }
}


