package multiThreading.producerConsumer;

import java.util.Random;
import java.util.concurrent.BlockingQueue;

public class ConsumerBlockingQueue implements Runnable {

    private final BlockingQueue consumerQueue;

    public ConsumerBlockingQueue(BlockingQueue blockingQueue) {
        this.consumerQueue = blockingQueue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                System.out.println("Consuming value:- " + consumerQueue.take());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
