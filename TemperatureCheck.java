import java.util.Scanner;

public class TemperatureCheck {

    public void checkTemperature(int temp) {
        if (temp < 0 || temp > 100) {
            throw new IllegalArgumentException("Temperature (" + temp + " C) is outside the valid range (0-100 C).");
        }
        System.out.println("Temperature (" + temp + " C) is valid.");
    }

    public static void main(String[] args) {
        TemperatureCheck checker = new TemperatureCheck();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a temperature (in Celsius): ");
        
        try {
            int temp = scanner.nextInt();
            checker.checkTemperature(temp);
            System.out.println("Processing... temperature is fine.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (java.util.InputMismatchException e) {
            System.out.println("Error: Please enter a valid integer.");
        } finally {
            scanner.close();
        }
    }
}
