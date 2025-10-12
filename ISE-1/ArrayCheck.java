import java.util.*;

public class ArrayCheck {
    public static void main(String[] arg){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number of elements(N): ");
    int n = sc.nextInt();

    int[] number = new int [n];
    
    
    int PositiveNumber=0;
    int NegativeNumber=0;
    int zero=0;

    System.out.println("Enter"+n+"integers: ");
    
    for(int i=0;i<n;i++){
        number[i] = sc.nextInt();
        if(number[i]<0){
            NegativeNumber++;
        }
        else if(number[i]>0){
            PositiveNumber++;
        }
        else{
            zero++;
        }

    }

    System.out.println("number of positive integers are: "+ PositiveNumber);
    System.out.println("number of negative integers are: "+ NegativeNumber);
    System.out.println("number of zero  are: "+ zero);


    }
}
