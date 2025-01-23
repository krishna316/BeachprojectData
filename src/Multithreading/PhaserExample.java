package Multithreading;

import java.util.concurrent.Phaser;

public class PhaserExample {
    public static void main(String[] args) {
        Phaser phaser = new Phaser(1); // Main thread registers

        for (int i = 1; i <= 3; i++) {
            phaser.register(); // Register each worker thread
            new Thread(new Worker(phaser, "Worker " + i)).start();
        }

        System.out.println("Main thread waiting for phase 1 to complete...");
        phaser.arriveAndAwaitAdvance(); // Wait for all threads to finish phase 1

        System.out.println("Phase 1 completed. Starting phase 2...");

        for (int i = 4; i <= 5; i++) {
            phaser.register(); // Dynamically register new threads
            new Thread(new Worker(phaser, "Worker " + i)).start();
        }

        phaser.arriveAndAwaitAdvance(); // Wait for phase 2
        System.out.println("Phase 2 completed. All tasks are done.");
        phaser.arriveAndDeregister(); // Deregister main thread
    }
}

class Worker implements Runnable {
    private final Phaser phaser;
    private final String name;

    public Worker(Phaser phaser, String name) {
        this.phaser = phaser;
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name + " is starting phase 1...");
        phaser.arriveAndAwaitAdvance(); // Phase 1 completion
        System.out.println(name + " is starting phase 2...");
        phaser.arriveAndAwaitAdvance(); // Phase 2 completion
    }
}
