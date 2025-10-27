public class MultiException {
    public static void main(String[] args) {
        
        int[] numbers = new int[5];

        try {
            System.out.println("--- 1. Attempting to access 6th element ---");
            numbers[5] = 10;
            System.out.println("Successfully accessed 6th element.");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index is out of bounds.");
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        }

        try {
            System.out.println("\n--- 2. Attempting to divide by zero ---");
            int result = numbers[2] / 0;
            System.out.println("Result of division: " + result);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index is out of bounds.");
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        }
        
        System.out.println("\nProgram continues after handling exceptions.");
    }
}
