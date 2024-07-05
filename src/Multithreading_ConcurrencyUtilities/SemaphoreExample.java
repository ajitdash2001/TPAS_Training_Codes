package Multithreading_ConcurrencyUtilities;

import java.util.concurrent.Semaphore;

class SharedResource {
    private final Semaphore semaphore;

    public SharedResource(int permits) {
        this.semaphore = new Semaphore(permits);
    }

    public void accessResource(String threadName) {
        try {
            System.out.println(threadName + " acquire a permit.");
            semaphore.acquire();
            System.out.println(threadName + " acquired a permit.");


            System.out.println(threadName + " is accessing the shared resource.");
            Thread.sleep(1000);

        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println(threadName + " was interrupted.");
        } finally {
            System.out.println(threadName + " released a permit.");
            semaphore.release();
        }
    }
}

class Worker extends Thread {
    private final SharedResource sharedResource;

    public Worker(SharedResource sharedResource, String threadName) {
        super(threadName);
        this.sharedResource = sharedResource;
    }

    @Override
    public void run() {
        sharedResource.accessResource(Thread.currentThread().getName());
    }
}

public class SemaphoreExample {
    public static void main(String[] args) {
        int numberOfPermits = 2;
        SharedResource sharedResource = new SharedResource(numberOfPermits);


        for (int i = 1; i <= 5; i++) {
            new Worker(sharedResource, "Worker " + i).start();
        }
    }
}

