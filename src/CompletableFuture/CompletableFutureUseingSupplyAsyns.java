package CompletableFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureUseingSupplyAsyns {

    public static void main(String[] args) {

        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
            try {

                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
            return "Hello, World!";
        });


        future.thenAccept(result -> {
            System.out.println("Result: " + result);
        });


        try {
            future.get();
        } catch (InterruptedException | ExecutionException e) {
            System.err.println("Exception: " + e.getMessage());
        }

        System.out.println("Main thread execution finished.");
    }
}
