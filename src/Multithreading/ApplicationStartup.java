package Multithreading;

import java.util.concurrent.CountDownLatch;

public class ApplicationStartup {

    public static void main(String[] args) throws InterruptedException {
        int numberOfServices = 3;
        CountDownLatch latch = new CountDownLatch(numberOfServices);

        Thread databaseService = new Thread(new Service("Database Service", latch));
        Thread cacheService = new Thread(new Service("Cache Service", latch));
        Thread messageQueueService = new Thread(new Service("Message Queue Service", latch));

        databaseService.start();
        cacheService.start();
        messageQueueService.start();

        // Wait for all services to complete initialization
        latch.await();

        System.out.println("All services are up and running! Starting the application...");
    }
}

class Service implements Runnable {
    private final String serviceName;
    private final CountDownLatch latch;

    public Service(String serviceName, CountDownLatch latch) {
        this.serviceName = serviceName;
        this.latch = latch;
    }

    @Override
    public void run() {
        System.out.println(serviceName + " is starting...");
        try {
            Thread.sleep((long) (Math.random() * 3000)); // Simulate service initialization
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println(serviceName + " has started.");
        latch.countDown(); // Signal completion
    }
}

