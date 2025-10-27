public class Finally {
    public static void main(String[] args) {

        System.out.println("--- 1. Case: Exception Occurs ---");
        try {
            System.out.println("Attempting to divide by zero...");
            int result = 10 / 0;
            System.out.println("Result (this will not print): " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error caught: Cannot divide by zero.");
        } finally {
            System.out.println("Finally block: Resource cleanup complete.");
        }

        System.out.println("\n--- 2. Case: No Exception Occurs ---");
        try {
            System.out.println("Attempting a normal division...");
            int result = 10 / 2;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error caught: " + e.getMessage());
        } finally {
            System.out.println("Finally block: Resource cleanup complete.");
        }
    }
}
