package multiThreading.producerConsumer;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.SynchronousQueue;

public class ProducerConsumerBlockingQueue {

    public static void main(String[] args) {

        // BlockingQueue blockingQueue = new LinkedBlockingQueue();

        // BlockingQueue blockingQueue = new ArrayBlockingQueue(4);

        BlockingQueue blockingQueue = new SynchronousQueue();

        Thread producerThread = new Thread(new ProducerBlockingQueue(blockingQueue), "producerThread");
        Thread consumerThread = new Thread(new ConsumerBlockingQueue(blockingQueue), "consumerThread");

        producerThread.start();
        consumerThread.start();

    }
}
