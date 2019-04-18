package multiThreading.producerConsumer;

import java.util.Queue;

public class Consumer implements Runnable {

    private final Queue consumerQueue;
    private int maxsize;

    public Consumer(Queue queue, int size) {
        this.consumerQueue = queue;
        this.maxsize = size;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (consumerQueue) {
                while (consumerQueue.isEmpty()) {
                    // CONSUMER HAS TO WAIT FOR PRODUCER

                    try {
                        System.out.println("Consumer Queue is Empty");
                        consumerQueue.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }

                int number = (int) consumerQueue.poll();
                System.out.println("Consuming value:- " + number);
                consumerQueue.notify();
            }
        }
    }
}
