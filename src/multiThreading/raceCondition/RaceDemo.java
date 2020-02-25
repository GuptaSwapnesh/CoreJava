package multiThreading.raceCondition;

public class RaceDemo {

    public static void main(String args[]) {

        Race raceCondition = new Race();
        Thread t1 = new Thread(raceCondition, "Thread - 1");
        Thread t2 = new Thread(raceCondition, "Thread - 2");
        Thread t3 = new Thread(raceCondition, "Thread - 3");

        t1.start();
        t2.start();
        t3.start();
    }

    public static class Race implements Runnable {

        private int c = 0;

        public void increment() {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            c++;
        }

        public void decrement() {
            c--;
        }

        public int getValue() {
            return c;
        }

        @Override
        public void run() {
            synchronized (this) {

                this.increment();
                System.out.println("Value for " + Thread.currentThread().getName() + " After Increment " + this.getValue());

                this.decrement();
                System.out.println("Value for " + Thread.currentThread().getName() + " at last " + this.getValue());
            }
        }
    }


}
