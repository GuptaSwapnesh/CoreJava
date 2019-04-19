package multiThreading.countDownLatch;

/*
 * CountDownLatch has three main things
 * 1) A count variable
 * 2) The await() method called by the currently running thread i.e. mainly the Main thread.
 *      It makes the thread to wait until the count reaches 0.
 * 3) The countDown() method, which is called by every thread which is attached to the CountDownLatch
 *
 *
 *
 * */

public class CustomCountDownLatch {

    private int latchCount;

    public CustomCountDownLatch(int count) {
        this.latchCount = count;
    }

    /*
    * If latchCount is greater than 0, than make the thread to wait.
    * */
    public synchronized void await() throws InterruptedException{
        if(latchCount > 0){
            this.wait();
        }
    }

    /*
    * Decrement the latchCount by 1 whenever the child thread finishes its job.
    * When the latchCount reaches 0, notify the parent thread to start processing.
    * */
    public synchronized void countDown(){
        latchCount--;

        if(latchCount == 0){
            this.notify();
        }
    }
}
