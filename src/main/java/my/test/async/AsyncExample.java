package my.test.async;

import java.util.concurrent.CompletableFuture;

public class AsyncExample {

    public static void main(String[] args) {
        System.out.println("Starting async example...");

        // Asynchronous calls using CompletableFuture
        CompletableFuture<Void> task1 = CompletableFuture.runAsync(() -> doTask1());
        CompletableFuture<Void> task2 = CompletableFuture.runAsync(() -> doTask2());
        CompletableFuture<Void> task3 = CompletableFuture.runAsync(() -> doTask3());

        // Wait for all tasks to finish
        CompletableFuture.allOf(task1, task2, task3).join();

        System.out.println("Async example complete.");
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
