// Writing a Java program to convert temperatures between Fahrenheit and Celsius
import java.util.Scanner;

public class TemperatureConverter {

    // Method to convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Method to convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Temperature Converter");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.print("Choose an option (1 or 2): ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.print("Enter temperature in Fahrenheit: ");
            double f = scanner.nextDouble();
            System.out.println("Temperature in Celsius: " + fahrenheitToCelsius(f));
        } 
        else if (choice == 2) {
            System.out.print("Enter temperature in Celsius: ");
            double c = scanner.nextDouble();
            System.out.println("Temperature in Fahrenheit: " + celsiusToFahrenheit(c));
        } 
        else {
            System.out.println("Invalid choice.");
        }

        scanner.close(); // Closing the Scanner Object
    }
}
