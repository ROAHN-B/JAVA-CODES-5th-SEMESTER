import java.util.*;

public class AgeValiodator {
    public static void main (String []  args ){
        try {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter age: ");
        String ageInput  = sc.nextLine();
        int age  = Integer.parseInt(ageInput);
        System.out.println("Validate age: " + age);
        }
        catch (NumberFormatException e){
            System.out.println("Invalid age input. Please enter a valid number.");
    }
    finally{
        System.out.println("Age valication completed.");
    }
    
    
}
}
