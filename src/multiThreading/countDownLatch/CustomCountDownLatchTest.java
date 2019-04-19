package multiThreading.countDownLatch;

public class CustomCountDownLatchTest {

    public static void main(String[] args) {

        CustomCountDownLatch countDownLatch = new CustomCountDownLatch(3);

        CustomCountDownLatchWorker first = new CustomCountDownLatchWorker(1000, countDownLatch, "WORKER-1");
        CustomCountDownLatchWorker second = new CustomCountDownLatchWorker(2000, countDownLatch, "WORKER-2");
        CustomCountDownLatchWorker third = new CustomCountDownLatchWorker(3000, countDownLatch, "WORKER-3");

        first.start();
        second.start();
        third.start();

        /*
        * Added one more thread to the latch, but only 3 thread will be added into the process of latching.
        * Thread 4 will execute after the man thread has finished
        * */
        CustomCountDownLatchWorker fourth = new CustomCountDownLatchWorker(4000, countDownLatch, "WORKER-4");
        fourth.start();

        // Main thread will wait until all thread finished
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(Thread.currentThread().getName() + " has finished");
    }
}
