import java.util.*;

public class Plaindrom {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter word to check palindrome: ");
        String input = sc.nextLine();
        String lowercases = input.toLowerCase();
        
        String reversed = new StringBuilder(lowercases).reverse().toString();

        if (lowercases.equals(reversed)){
            System.out.println("String is a palindrome");
        }
        else{
            System.out.println("String is not palindrome");
        }

    }
}
