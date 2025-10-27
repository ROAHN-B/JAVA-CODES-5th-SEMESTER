interface Greeting {
    public void sayHello();
}

public class Demo {
    public static void main(String[] args) {
        
        Greeting greeting = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Hello Students");
            }
        };

        System.out.println("Calling the anonymous class method:");
        greeting.sayHello();
    }
}
