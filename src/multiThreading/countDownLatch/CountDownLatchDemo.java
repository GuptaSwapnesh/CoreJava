package multiThreading.countDownLatch;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchDemo {

    public static void main(String args[]) throws InterruptedException {
        CountDownLatch latch = new CountDownLatch(4);
        CountDownLatchWorker first = new CountDownLatchWorker(1000, latch, "WORKER-1");
        CountDownLatchWorker second = new CountDownLatchWorker(2000, latch, "WORKER-2");
        CountDownLatchWorker third = new CountDownLatchWorker(3000, latch, "WORKER-3");
        CountDownLatchWorker fourth = new CountDownLatchWorker(4000, latch, "WORKER-4");
        first.start();
        second.start();
        third.start();
        fourth.start();

        // Main thread will wait until all thread finished
        latch.await();
        System.out.println(Thread.currentThread().getName() + " has finished");


    }
}
