package multiThreading.problemStatement;

public class RunVsStart {

    public static void main(String[] args) {

        Thread thread = new Thread(new Task("startMethod"));
        Thread thread1 = new Thread(new Task("runMethod"));

        thread.start();
        thread1.run();

    }


    private static class Task implements Runnable {
        private String taskName;

        public Task(String task) {
            this.taskName = task;
        }

        @Override
        public void run() {
            System.out.println("Caller: " + taskName + " and code on this Thread is executed by : " + Thread.currentThread().getName());
        }
    }
}
