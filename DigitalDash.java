import java.util.Random;

class Runner implements Runnable {
    private Random rand = new Random();

    public void run() {
        try {
            String name = Thread.currentThread().getName();
            
            for (int distance = 10; distance <= 100; distance += 10) {
                System.out.println(name + " has reached " + distance + "m.");
                Thread.sleep(rand.nextInt(100) + 50);
            }
            
            System.out.println(">>> " + name + " has finished the race! <<<");
            
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + " was interrupted.");
        }
    }
}

public class DigitalDash {
    public static void main(String[] args) {
        
        Runner raceLogic = new Runner();

        Thread bolt = new Thread(raceLogic);
        bolt.setName("Bolt");

        Thread gatlin = new Thread(raceLogic);
        gatlin.setName("Gatlin");

        System.out.println("On your marks, get set, GO!");
        
        bolt.start();
        gatlin.start();
    }
}
 
