package ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Tasks implements Runnable {
    private final int taskId;

    public Tasks(int taskId) {
        this.taskId = taskId;
    }

    public void run() {
        System.out.println("Task " + taskId + " is running on " + Thread.currentThread().getName());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.err.println("Task " + taskId + " was interrupted: " + e.getMessage());
        }
        System.out.println("Task " + taskId + " has finished on " + Thread.currentThread().getName());
    }
}
public class cachedThreadPool {
    public static void main(String[] args) {

        ExecutorService executorService = Executors.newCachedThreadPool();

        for (int i = 1; i <= 10; i++) {
            executorService.submit(new Tasks(i));
        }

        executorService.shutdown();

        try {
            if (!executorService.awaitTermination(60, TimeUnit.SECONDS)) {
                executorService.shutdownNow();
            }
        } catch (InterruptedException e) {
            executorService.shutdownNow();
        }

        System.out.println("All tasks have finished.");
    }
}
