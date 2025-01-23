package Multithreading;

import java.util.concurrent.Exchanger;

public class ExchangerExample {
    public static void main(String[] args) {
        Exchanger<String> exchanger = new Exchanger<>();

        Thread producer = new Thread(new Producer(exchanger));
        Thread consumer = new Thread(new Consumer(exchanger));

        producer.start();
        consumer.start();
    }
}

class Producer implements Runnable {
    private final Exchanger<String> exchanger;

    public Producer(Exchanger<String> exchanger) {
        this.exchanger = exchanger;
    }

    @Override
    public void run() {
        try {
            String data = "Produced Data";
            System.out.println("Producer: Generated data: " + data);
            String response = exchanger.exchange(data); // Exchange data
            System.out.println("Producer: Received response: " + response);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

class Consumer implements Runnable {
    private final Exchanger<String> exchanger;

    public Consumer(Exchanger<String> exchanger) {
        this.exchanger = exchanger;
    }

    @Override
    public void run() {
        try {
            String receivedData = exchanger.exchange(null); // Receive data
            System.out.println("Consumer: Processing data: " + receivedData);
            String processedData = "Processed Data";
            exchanger.exchange(processedData); // Send response
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

