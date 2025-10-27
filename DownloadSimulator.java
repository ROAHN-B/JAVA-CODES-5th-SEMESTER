import java.util.Random;

class DownloaderOne extends Thread {
    private Random rand = new Random();

    public void run() {
        try {
            for (int i = 10; i <= 100; i += 10) {
                System.out.println(Thread.currentThread().getName() + ": " + i + "% complete");
                Thread.sleep(rand.nextInt(150) + 50);
            }
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + " was interrupted.");
        }
    }
}

class DownloaderTwo implements Runnable {
    private Random rand = new Random();

    public void run() {
        try {
            for (int i = 10; i <= 100; i += 10) {
                System.out.println(Thread.currentThread().getName() + ": " + i + "% complete");
                Thread.sleep(rand.nextInt(150) + 50);
            }
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + " was interrupted.");
        }
    }
}

public class DownloadSimulator {
    public static void main(String[] args) {
        
        DownloaderOne d1 = new DownloaderOne();
        d1.setName("DownloaderOne (Extends)");

        DownloaderTwo runnable = new DownloaderTwo();
        Thread d2 = new Thread(runnable);
        d2.setName("DownloaderTwo (Runnable)");

        System.out.println("Starting both file downloads...");
        
        d1.start();
        d2.start();
        
        System.out.println("Main thread has initiated both downloads.");
    }
}
