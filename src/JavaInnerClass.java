class OuterClass {
    int x = 10;

    // Static inner class
    static class InnerClass {
        int y = 5;
    }
}

public class JavaInnerClass {
    public static void main(String[] args) {
        // Creating an instance of the static inner class directly without needing an outer class object
        OuterClass.InnerClass myInner = new OuterClass.InnerClass();

        // Creating an instance of OuterClass
        OuterClass myOuter = new OuterClass();

        // Printing the sum of x (from OuterClass) and y (from InnerClass)
        System.out.println(myInner.y + myOuter.x);  // Output: 15
    }
}
