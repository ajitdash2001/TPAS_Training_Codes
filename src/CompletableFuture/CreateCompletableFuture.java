package CompletableFuture;

import java.util.concurrent.CompletableFuture;

public class CreateCompletableFuture {
    public static void main(String[] args) {
        CompletableFuture<String> completedFuture = CompletableFuture.completedFuture("Hello, World!");


        if (completedFuture.isDone()) {
            try {

                String result = completedFuture.get();
                System.out.println("Result: " + result);
            } catch (Exception e) {
                System.err.println("Exception: " + e.getMessage());
            }
        } else {
            System.out.println("The CompletableFuture is not yet completed.");
        }
    }
}
