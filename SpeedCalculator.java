import java.util.*;

public class SpeedCalculator {
    public void checkspeed (int speed){
        if (speed > 100){
            throw new ArithmeticException("Speed limit exceed!!");
        }
        else{
            System.out.println("Speed is normal");
        }
    }
    public static void main (String [] args){
        SpeedCalculator sc1 = new SpeedCalculator();
        try {
            sc1.checkspeed(80);
            sc1.checkspeed(120);
        }
        catch (ArithmeticException e){
                System.out.println("Caught exception : "+ e.getMessage());
        }

    }

}