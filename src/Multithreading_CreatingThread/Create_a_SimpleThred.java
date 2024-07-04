package Multithreading_CreatingThread;
 class SimpleThread extends Thread{
     public  void run(){
         System.out.println("Thred is running:"+Thread.currentThread().getName());
         for(int i=1;i<=5;i++){
             System.out.println(i+":from"+Thread.currentThread().getName());

             try{
                 Thread.sleep(500);
             }
             catch (InterruptedException e){
                 System.out.println("Thred interrupted"+e.getMessage());
             }
         }
     }
 }
public class Create_a_SimpleThred {
    public static void main(String[] args) {


        SimpleThread thread1 = new SimpleThread();
        SimpleThread thread2 = new SimpleThread();
        thread1.start();
        thread2.start();

    }
}