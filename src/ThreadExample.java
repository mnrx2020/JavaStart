public class ThreadExample extends Thread {  // Renamed class
    public static void main(String[] args) {
        ThreadExample thread = new ThreadExample();  // Updated class name
        thread.start();
        System.out.println("This code is outside of the thread");
    }

    public void run() {
        System.out.println("This code is running in a thread");
    }
}
