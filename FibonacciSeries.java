import java.util.Scanner;

public class FibonacciSeries
{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int i=0;
        int a=0;
        int b=1;
        
        while(i<=n){
            System.out.println(a+" ");
            int next = a+b;
            a=b;
            b=next;
            i++;
        }
        
        
    }
    
}