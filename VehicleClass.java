import java.util.*;

interface Vehicle {
    public void start();
    public void stop();
}

class Bike implements Vehicle{
    String name;

    Bike (String name){
        this.name=name;
    }

    public void start(){
        System.out.println(name+"Starts!!");
    }

    public void stop(){
        System.out.println(name+"Stop!!");
    }
}

class Car implements Vehicle{
    String name;

    Car (String name){
        this.name=name;
    }

    public void start(){
        System.out.println(name+"Starts!!");
    }

    public void stop(){
        System.out.println(name+"Stop!!");
    }
}

public class VehicleClass{
    public static void main(String[] args){
        Vehicle B1 = new Bike("BMW");
        Vehicle C1 = new Car("Audi");

        B1.start();
        C1.start();
        B1.stop();
        C1.stop();
    }
}