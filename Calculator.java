import java.util.*;

class Calculator1{
    int num1;
    int num2;
    int num3;
    double num4;
    double num5;
    double total;

    Calculator1(){
        this.num1=num1;
        this.num2=num2;
        this.num3=num3;
        this.num4=num4;
        this.num5=num5;
    }
    double add(int num1, int num2){
        total = num1+num2;
        System.out.println("Total: "+total);
        return total;

    }
    double add (double num4, double num5 ){
        total = num4+num5;
        System.out.println("Total: "+total);
        return total;
    }
    double add(int num1,int num2, int num3){
        total = num1+num2+num3;
        System.out.println("Total: "+total);
        return total;
    }
}

public class Calculator{
    public static void main(String[] arg){
        Calculator1 c1 = new Calculator1();
        c1.add(1,2);
        c1.add(4.5,5.6);
        c1.add(1,2,3);
    }
}
