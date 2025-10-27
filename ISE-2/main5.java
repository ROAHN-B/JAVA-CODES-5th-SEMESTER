class Calculator{

    int add(int a, int b){
        return (a+b);
    }

    float add(float c, float d){
        return (c+d);
    }

    String add(String e,String f ){
        return (e+f);
    }
}

public class main5{
    public static void main(String[] arg){
        Calculator c1 = new Calculator();

        

        System.out.println("Addition of integers: "+c1.add(34,56));
        System.out.println("Addition of Floats: "+c1.add(34f,56f));
        System.out.println("Addition of Strings: "+c1.add("Rohan", "belsare"));
    }
}