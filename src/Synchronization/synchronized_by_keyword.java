package Synchronization;
 class Counter{
     private int count = 0;
     public  synchronized  void increment(){
         count++;
     }
     public int getCount(){
         return  count;
     }
 }
class CounterTask implements Runnable {
    private Counters counter;

    public CounterTask(Counters counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }
}


public class synchronized_by_keyword {
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
