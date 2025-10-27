import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Temperature Converter ===");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.print("Choose an option (1 or 2): ");
        int choice = sc.nextInt();

        double temp, convertedTemp;

        switch (choice) {
            case 1:
                
                System.out.print("Enter temperature in Celsius: ");
                temp = sc.nextDouble();
                convertedTemp = (temp * 9 / 5) + 32;
                System.out.println(temp + "°C = " + convertedTemp + "°F");
                break;

            case 2:
               
                System.out.print("Enter temperature in Fahrenheit: ");
                temp = sc.nextDouble();
                convertedTemp = (temp - 32) * 5 / 9;
                System.out.println(temp + "°F = " + convertedTemp + "°C");
                break;

            default:
                System.out.println("Invalid choice. Please select 1 or 2.");
        }

        sc.close();
    }
}
