package multiThreading.deadlock;

public class DeadLockDemo {

    public static void main(String[] args) {

        DeadLockDemo deadLockDemo = new DeadLockDemo();

        final A a = deadLockDemo.new A();
        final B b = deadLockDemo.new B();

        // Thread-1
        Runnable block1 = new Runnable() {
            public void run() {
                synchronized (a) {
                    try {
                        // Adding delay so that both threads can start trying to
                        // lock resources
                        // Thread.sleep(100);
                        System.out.println("Waiting for B");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    // Thread-1 have A but need B also
                    synchronized (b) {
                        System.out.println("In block 1");
                    }
                }
            }
        };

        // Thread-2
        Runnable block2 = new Runnable() {
            public void run() {
                synchronized (b) {

                    // Thread-2 have B but need A also
                    synchronized (a) {
                        System.out.println("In block 2");
                    }
                }
            }
        };

        new Thread(block1).start();
        new Thread(block2).start();

    }

    // Resource A
    private class A {
        private int i = 10;

        public int getI() {
            return i;
        }

        public void setI(int i) {
            this.i = i;
        }
    }

    // Resource B
    private class B {
        private int i = 20;

        public int getI() {
            return i;
        }

        public void setI(int i) {
            this.i = i;
        }
    }
}
