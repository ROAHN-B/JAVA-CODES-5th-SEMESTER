class CountingThread extends Thread {
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(Thread.currentThread().getName() + ": " + i);
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + " was interrupted.");
        }
    }
}

class RunnableCounter implements Runnable {
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(Thread.currentThread().getName() + ": " + i);
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + " was interrupted.");
        }
    }
}

public class ThreadRace {
    public static void main(String[] args) {
        
        CountingThread t1 = new CountingThread();
        t1.setName("Thread-A (Extends)");

        RunnableCounter runnable = new RunnableCounter();
        Thread t2 = new Thread(runnable);
        t2.setName("Thread-B (Runnable)");

        System.out.println("Starting the counting competition...");
        
        t1.start();
        t2.start();
        
        System.out.println("Main thread has started both counters.");
    }
}
