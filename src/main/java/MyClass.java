import java.util.concurrent.Semaphore;

public class MyClass {
   private Semaphore semaphoreEven = new Semaphore(0);
   private Semaphore semaphoreOdd = new Semaphore(1);

   void printEvenNum(int num) {
       try {
           semaphoreEven.acquire();
       } catch (InterruptedException i) {
           Thread.currentThread().interrupt();
       }
       System.out.println(Thread.currentThread().getName() + ": " + num);
       semaphoreOdd.release();
   }

   void printOddNum(int num) {
       try {
           semaphoreOdd.acquire();
       } catch (InterruptedException i) {
           Thread.currentThread().interrupt();
       }
       System.out.println(Thread.currentThread().getName() + ": " + num);
       semaphoreEven.release();
   }
}