package multiThreading.deadlock;

public class DeadLockTest {

    public static void main(String[] args) {

        String s1 = "S1";
        String s2 = "S2";

        Thread t1 = new Thread(new DeadLockCause(s1, s2));
        Thread t2 = new Thread(new DeadLockCause(s1, s2));

        t1.start();
        t2.start();

    }
}
