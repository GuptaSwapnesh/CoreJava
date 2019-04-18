package multiThreading.producerConsumer;

import java.util.LinkedList;
import java.util.Queue;

public class ProducerConsumer {

    public static void main(String[] args) {

        final Queue queue = new LinkedList<Integer>();

        Thread producerTherad = new Thread(new Producer(queue, 4), "producerTherad");
        Thread consumerTherad = new Thread(new Consumer(queue, 4), "consumerTherad");

        producerTherad.start();
        consumerTherad.start();


    }
}
