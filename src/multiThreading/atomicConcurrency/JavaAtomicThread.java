package multiThreading.atomicConcurrency;

import java.util.concurrent.atomic.AtomicInteger;

public class JavaAtomicThread implements Runnable {

    // private int count;
    private AtomicInteger count = new AtomicInteger();

    @Override
    public void run() {

        for (int i = 1; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " -- " + i);
            processSomething(i);
            count.incrementAndGet();
        }
    }

    public int getCount() {
        return this.count.get();
    }

    private void processSomething(int i) {
        // processing some job
        try {
            Thread.sleep(i * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
