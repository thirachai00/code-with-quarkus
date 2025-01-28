package my.test.async;

public class SyncExample {

    public static void main(String[] args) {
        System.out.println("Starting sync example...");

        // Synchronous calls
        doTask1();
        doTask2();
        doTask3();

        System.out.println("Sync example complete.");
    }

    public static void doTask1() {
        System.out.println("Task 1 started...");
        try {
            Thread.sleep(2000); // Simulating a task that takes 2 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Task 1 finished.");
    }

    public static void doTask2() {
        System.out.println("Task 2 started...");
        try {
            Thread.sleep(1000); // Simulating a task that takes 1 second
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Task 2 finished.");
    }

    public static void doTask3() {
        System.out.println("Task 3 started...");
        try {
            Thread.sleep(1500); // Simulating a task that takes 1.5 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Task 3 finished.");
    }
}
