package multiThreading.producerConsumer;

import java.util.Random;
import java.util.concurrent.BlockingQueue;

public class ProducerBlockingQueue implements Runnable {

    private final BlockingQueue producerQueue;

    public ProducerBlockingQueue(BlockingQueue blockingQueue) {
        this.producerQueue = blockingQueue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Random random = new Random();
                int number = random.nextInt(100);
                System.out.println("Producing value:- " + number);
                producerQueue.put(number);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
