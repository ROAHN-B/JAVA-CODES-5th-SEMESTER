interface Greeting{
    public void sayhello();
}

public class main7{
    public static void main(String[] arg){
        Greeting greet = new Greeting() {
            @Override
            public void sayhello(){
                System.out.println("Hello Students");
            }
        };

        greet.sayhello();
    }

}