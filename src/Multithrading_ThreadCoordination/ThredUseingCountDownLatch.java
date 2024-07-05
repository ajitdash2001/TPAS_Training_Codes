package Multithrading_ThreadCoordination;

import java.util.concurrent.CountDownLatch;

class Worker implements Runnable {
    private final CountDownLatch latch;
    private final String workerName;

    public Worker(CountDownLatch latch, String workerName) {
        this.latch = latch;
        this.workerName = workerName;
    }

    @Override
    public void run() {
        System.out.println(workerName + " is doing work...");
        try {

            Thread.sleep((long) (Math.random() * 1000));
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println(workerName + " was interrupted");
        }
        System.out.println(workerName + " has finished work");
        latch.countDown();
    }
}

public class ThredUseingCountDownLatch {
    public static void main(String[] args) {
        int numberOfWorkers = 3;
        CountDownLatch latch = new CountDownLatch(numberOfWorkers);


        for (int i = 1; i <= numberOfWorkers; i++) {
            new Thread(new Worker(latch, "Worker " + i)).start();
        }

        try {
            System.out.println("Main task is waiting for workers to complete...");
            latch.await();
            System.out.println("All workers have finished. Main task is starting now.");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Main task was interrupted");
        }

        System.out.println("Main task execution finished.");
    }
}
