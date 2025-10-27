abstract class Appliance{
    String brand;

    Appliance(String brand){
        this.brand=brand;
    }

    abstract public void powerOn(); 
}

interface SmartDevices{
    void connectWifi();
}


class SmartFan extends Appliance implements SmartDevices{

    SmartFan(String brand){
        super(brand);
    }

    public void powerOn(){
        System.out.println(brand+" Fan powered on....");
    }

    @Override
    public void connectWifi(){
        System.out.println("Connected to Wifi....");
    }
}

public class main8{
    public static void main(String[] arg){
        SmartFan A1 = new SmartFan("Usha");

        A1.powerOn();
        A1.connectWifi();
    }
}