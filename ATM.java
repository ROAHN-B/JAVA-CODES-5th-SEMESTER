import java.util.Scanner;
class InvalidPINException extends Exception{
    public InvalidPINException (String message){
        super(message);
    }
}



public class ATM  {

    
    public void validatePIN(String pin) throws InvalidPINException {
        // Check for null or incorrect length
        if (pin == null || pin.length() != 4) {
            // Throw our custom checked exception
            throw new InvalidPINException("Invalid PIN. PIN must be exactly 4 digits long.");
        }



        System.out.println("PIN format validated successfully.");
    }

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ATMMachine atm = new ATMMachine();

        System.out.println("Welcome to the ATM.");
        System.out.print("Please enter your 4-digit PIN: ");
        String userPin = scanner.nextLine();

        try {
           
            atm.validatePIN(userPin);
            System.out.println("Access Granted. Welcome!");
        } catch (InvalidPINException e) {
            // This block executes if the validatePIN method throws the exception
            System.out.println("Access Denied.");
            System.out.println("Error: " + e.getMessage());
        } finally {
            // Good practice to close resources
            scanner.close();
            System.out.println("Thank you for using the ATM.");
        }
    }
}
