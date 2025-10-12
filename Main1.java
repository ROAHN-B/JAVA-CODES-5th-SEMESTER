abstract class Vehicle{
    String brand;
    Float speed;

    Vehicle(String brand, float speed){
        this.brand=brand;
        this.speed=speed;
    }
    abstract void start();

    void displayInfo(){
        System.out.println("Brand: "+brand);
        System.out.println("Speed: "+speed);
    }

}

interface FuelEfficient {
    double calculateMileage();
}

class Car extends Vehicle implements FuelEfficient{
    double fuelUsed;
    double distance;

    Car(String brand, float speed, double distance, double fuelUsed){
        super(brand,speed);
        this.fuelUsed=fuelUsed;
        this.distance=distance;
    }
    @Override
    void start(){
        System.out.println("car: "+brand+"is starting... ");
    }

    @Override
    public double calculateMileage(){
        return distance/fuelUsed;
    }
}

class Bike extends Vehicle implements FuelEfficient{
    double fuelUsed;
    double distance;

    Bike(String brand, float speed, double distance, double fuelUsed){
        super(brand,speed);
        this.fuelUsed=fuelUsed;
        this.distance=distance;
    }
    @Override
    void start(){
        System.out.println("Bike: "+brand+"is starting... ");
    }

    @Override
    public double calculateMileage(){
        return (distance/fuelUsed);
    }
}

public class Main1{
    public static void main(String [] arg){
        Car car = new Car("Honda", 200,120,13);
        Bike bike = new Bike("BMW", 170, 150, 12);
        car.start();
        car.calculateMileage();
        System.out.println("Mileage: "+car.calculateMileage());
        bike.start();
        bike.calculateMileage();
        System.out.println("Mileage: "+bike.calculateMileage());
    }
    
}



