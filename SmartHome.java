abstract class Appliance {
    public abstract void powerOn();
}

interface SmartDevice {
    public void connectWifi();
}

class SmartFan extends Appliance implements SmartDevice {

    @Override
    public void powerOn() {
        System.out.println("Fan is spinning up.");
    }

    @Override
    public void connectWifi() {
        System.out.println("Fan is connecting to WiFi network...");
    }

    public void setSpeed(int speed) {
        System.out.println("Fan speed set to " + speed);
    }
}

public class SmartHome {
    public static void main(String[] args) {
        
        System.out.println("--- Using SmartFan directly ---");
        SmartFan myFan = new SmartFan();
        myFan.powerOn();
        myFan.connectWifi();
        myFan.setSpeed(3);

        System.out.println("\n--- Using Appliance reference (Polymorphism) ---");
        Appliance appliance = myFan;
        appliance.powerOn();

        System.out.println("\n--- Using SmartDevice reference (Polymorphism) ---");
        SmartDevice device = myFan;
        device.connectWifi();
    }
}
