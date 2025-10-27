interface Vehicle{
    void start();
    void stop();
}

class Car implements Vehicle{
    String name;

    Car(String name){
        this.name=name;
    }
    @Override
    public void start(){
        System.out.println(name+"is starting....");
    }
    
    @Override
    public void stop(){
        System.out.println(name+"is Stopping....");
    }
}


class Bike implements Vehicle{
    String name;

    Bike(String name){
        this.name=name;
    }

    @Override
    public void start(){
        System.out.println(name+"is starting....");
    }
    
    @Override
    public void stop(){
        System.out.println(name+"is Stopping....");
    }
}

public class main2{
    public static void main(String[] arg){
        Vehicle v1= new Car("Hyundai ");
        Vehicle v2= new Bike("BMW ");

        v1.start();
        v2.start();
        System.out.println("-------------------------------------");
        v1.stop();
        v2.stop();
    }
}