package Synchronization;
class Counters {
    private int count = 0;


    public synchronized void increment() {
        count++;
    }

    public synchronized int getCount() {
        return count;
    }
}
class CountersTask implements Runnable {
    private Counter counter;

    public CountersTask(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }
}
public class synchronized_by_methods {
    public static void main(String[] args) {

        Counters counter = new Counters();


        Thread thread1 = new Thread(new CounterTask(counter));
        Thread thread2 = new Thread(new CounterTask(counter));


        thread1.start();
        thread2.start();


        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted: " + e.getMessage());
        }


        System.out.println("Final count: " + counter.getCount());
    }
}