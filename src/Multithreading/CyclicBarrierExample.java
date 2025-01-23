package Multithreading;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierExample {
    public static void main(String[] args) {
        int numberOfplayers=4;
        CyclicBarrier barrier=new CyclicBarrier(numberOfplayers, ()->
                System.out.println("All players are ready.Starting the game..."));

        for(int i=1;i<numberOfplayers;i++)
        {
            new Thread(new Player(barrier, "Player :" + i)).start();
        }
    }
}

class Player implements Runnable{
    private final CyclicBarrier barrier;
    private final String name;

    public Player(CyclicBarrier barrier,String name){
        this.barrier=barrier;
        this.name=name;
    }

    @Override
    public void run() {
        try{
            System.out.println(name+"is preparing...");
            Thread.sleep((long) (Math.random()*3000));
            System.out.println(name+"is ready.");
            barrier.await();
        } catch (InterruptedException | BrokenBarrierException e) {
            Thread.currentThread().interrupt();
        }
    }
}


