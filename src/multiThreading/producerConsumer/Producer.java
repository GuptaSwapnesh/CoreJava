package multiThreading.producerConsumer;

import java.util.Queue;
import java.util.Random;

public class Producer implements Runnable {

    private final Queue producerQueue;
    private int maxSize;

    public Producer(Queue queue, int size) {
        this.producerQueue = queue;
        this.maxSize = size;
    }

    @Override
    public void run() {

        while (true) {
            synchronized (producerQueue) {
                while (producerQueue.size() == maxSize) {
                    // PRODUCER HAS TO WAIT FOR CONSUMER
                    try {
                        System.out.println("Producer Queue is full");
                        producerQueue.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                Random random = new Random();
                int number = random.nextInt(100);
                System.out.println("Producing value:- " + number);
                producerQueue.add(number);
                producerQueue.notify();
            }
        }

    }
}
