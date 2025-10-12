import java.util.Scanner;

public class NumberToWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

     
        System.out.print("Enter a number (1 to 99): ");
        int num = sc.nextInt();

        if (num < 1 || num > 99) {
            System.out.println("Invalid input. ");
            return;
        }

        System.out.print("Output: ");

        if (num < 10) {
         
            printOnes(num);
        } else if (num < 20) {
            
            switch (num) {
                case 10: System.out.println("Ten"); break;
                case 11: System.out.println("Eleven"); break;
                case 12: System.out.println("Twelve"); break;
                case 13: System.out.println("Thirteen"); break;
                case 14: System.out.println("Fourteen"); break;
                case 15: System.out.println("Fifteen"); break;
                case 16: System.out.println("Sixteen"); break;
                case 17: System.out.println("Seventeen"); break;
                case 18: System.out.println("Eighteen"); break;
                case 19: System.out.println("Nineteen"); break;
            }
        } else {
          
            int tens = num / 10;
            int ones = num % 10;

            switch (tens) {
                case 2: System.out.print("Twenty"); break;
                case 3: System.out.print("Thirty"); break;
                case 4: System.out.print("Forty"); break;
                case 5: System.out.print("Fifty"); break;
                case 6: System.out.print("Sixty"); break;
                case 7: System.out.print("Seventy"); break;
                case 8: System.out.print("Eighty"); break;
                case 9: System.out.print("Ninety"); break;
            }

            if (ones != 0) {
                System.out.print(" ");
                printOnes(ones);
            } else {
                System.out.println(); 
            }
        }

        
    }

  
    public static void printOnes(int num) {
        switch (num) {
            case 1: System.out.println("One"); break;
            case 2: System.out.println("Two"); break;
            case 3: System.out.println("Three"); break;
            case 4: System.out.println("Four"); break;
            case 5: System.out.println("Five"); break;
            case 6: System.out.println("Six"); break;
            case 7: System.out.println("Seven"); break;
            case 8: System.out.println("Eight"); break;
            case 9: System.out.println("Nine"); break;
        }
    }
}
