package multiThreading.countDownLatch;

import java.util.concurrent.CountDownLatch;

public class CustomCountDownLatchWorker extends Thread {

    private int delay;
    private CustomCountDownLatch latch;

    public CustomCountDownLatchWorker(int delay, CustomCountDownLatch latch, String name) {
        super(name);
        this.delay = delay;
        this.latch = latch;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(delay);
            latch.countDown();
            System.out.println(Thread.currentThread().getName() + " has finished");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
