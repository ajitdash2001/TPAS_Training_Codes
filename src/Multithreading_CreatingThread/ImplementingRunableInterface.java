package Multithreading_CreatingThread;

class SimpleRunnable implements  Runnable{
    public void run() {
        System.out.println("Thread is running: " + Thread.currentThread().getName());
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + " from " + Thread.currentThread().getName());
            try {
                Thread.sleep(500); // Sleep for 500 milliseconds
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e.getMessage());
            }
        }
    }
}


public class ImplementingRunableInterface {
    public static void main(String[] args) {
        SimpleRunnable runnable = new SimpleRunnable();

        Thread thread1= new Thread(runnable);
        Thread thread2 = new Thread(runnable);

        thread1.start();
        thread2.start();
    }
}
