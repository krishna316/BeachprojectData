package Multithreading;


import java.util.concurrent.Semaphore;

public class SemaphoreExample {
    public static void main(String[] args) {
        int printers=2;
        Semaphore semaphore=new Semaphore(printers);

        for(int i=1;i<=5;i++){
            new Thread(new PrintJob(semaphore, "Employe " + i)).start();
        }
    }
}
 class PrintJob implements Runnable{
     private final Semaphore semaphore;
     private final String name;

     public PrintJob(Semaphore semaphore, String name) {
         this.semaphore = semaphore;
         this.name = name;
     }

     @Override
     public void run() {
        try {
            System.out.println(name + " is waiting for a printer ...");
            semaphore.acquire();
            System.out.println(name + " is printing...");
            Thread.sleep(2000);
            System.out.println(name + " is done printing");
        }
        catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }finally {
            semaphore.release();
        }
     }
 }