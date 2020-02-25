package multiThreading.problemStatement;

public class ThreadStop {

    public static void main(String[] args) {

        Thread thread = new Thread(new Runner());
        thread.run();
    }

    private static class Runner extends Thread {
        boolean bExit = false;

        public void exit(boolean bExit) {
            this.bExit = bExit;
        }

        @Override
        public void run() {
            while (!bExit) {
                System.out.println("Thread is running");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException ex) {
                    System.out.println(ThreadStop.class.getName());
                }
            }
        }
    }


}
