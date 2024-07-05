package CompletableFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CombineTwoCompletableFutures {
    public static void main(String[] args) {
        CompletableFuture<String> future1 = CompletableFuture.supplyAsync(() -> {
            try {
                // Simulate a long-running task
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
            return "Hello";
        });
        CompletableFuture<String> future2 = CompletableFuture.supplyAsync(() -> {
            try {
                // Simulate a long-running task
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
            return "World";
        });


        CompletableFuture<String> combinedFuture = future1.thenCombine(future2, (result1, result2) -> {
            return result1 + ", " + result2 + "!";
        });
        combinedFuture.thenAccept(result -> {
            System.out.println("Combined Result: " + result);
        });
        try {
            combinedFuture.get(); // Blocking call to wait for the future to complete
        } catch (InterruptedException | ExecutionException e) {
            System.err.println("Exception: " + e.getMessage());
        }

        System.out.println("Main thread execution finished.");
    }

}
