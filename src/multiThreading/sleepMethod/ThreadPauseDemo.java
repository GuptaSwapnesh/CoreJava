package multiThreading.sleepMethod;

import java.util.concurrent.TimeUnit;

public class ThreadPauseDemo {

    public static void main(String args[]) throws InterruptedException {

        ThreadPause threadPause = new ThreadPause();

        Thread t1 = new Thread(threadPause, "t1");
        t1.start();

        //Now, let's stop our thread
        System.out.println(Thread.currentThread().getName() + " is stopping ThreadPause thread");
        threadPause.stop();

        //Let's wait to see thread stopped
        TimeUnit.MILLISECONDS.sleep(200);
        System.out.println(Thread.currentThread().getName() + " is finished now");
    }

}
