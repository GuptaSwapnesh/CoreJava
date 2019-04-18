package multiThreading.deadlock;

import java.util.logging.Level;
import java.util.logging.Logger;

public class DeadLockCause implements Runnable {

    private final Object firstLock;
    private final Object secondLock;

    public DeadLockCause(String s1, String s2) {
        this.firstLock = s1;
        this.secondLock = s2;
    }

    @Override
    public void run() {
        synchronized (firstLock) {
            System.out.println(Thread.currentThread().getName() + " holds the lock on " + firstLock);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(DeadLockCause.class.getName()).log(Level.SEVERE, null, ex);
            }

            System.out.println(Thread.currentThread().getName() + " tries to get the lock on " + secondLock);

            synchronized (secondLock) {
                System.out.println(Thread.currentThread().getName() + " holds the lock on " + secondLock);
            }
        }
    }
}

