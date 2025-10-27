import java.util.Random;

class RocketAlpha extends Thread {
    private Random rand = new Random();

    public void run() {
        try {
            for (int altitude = 100; altitude <= 500; altitude += 100) {
                System.out.println(Thread.currentThread().getName() + " at " + altitude + "km.");
                Thread.sleep(rand.nextInt(150) + 50);
            }
            System.out.println(">>> " + Thread.currentThread().getName() + " has reached the target altitude! <<<");
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + " launch was aborted.");
        }
    }
}

class RocketBravo implements Runnable {
    private Random rand = new Random();

    public void run() {
        try {
            for (int altitude = 100; altitude <= 500; altitude += 100) {
                System.out.println(Thread.currentThread().getName() + " at " + altitude + "km.");
                Thread.sleep(rand.nextInt(150) + 50);
            }
            System.out.println(">>> " + Thread.currentThread().getName() + " has reached the target altitude! <<<");
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + " launch was aborted.");
        }
    }
}

public class RocketLaunch {
    public static void main(String[] args) {
        
        RocketAlpha alpha = new RocketAlpha();
        alpha.setName("Rocket-Alpha (Extends)");

        RocketBravo bravoRunnable = new RocketBravo();
        Thread bravo = new Thread(bravoRunnable);
        bravo.setName("Rocket-Bravo (Runnable)");

        System.out.println("Launch sequence initiated... T-minus 3 seconds.");
        
        alpha.start();
        bravo.start();
        
        System.out.println("Main thread has initiated both launches.");
    }
}
 
