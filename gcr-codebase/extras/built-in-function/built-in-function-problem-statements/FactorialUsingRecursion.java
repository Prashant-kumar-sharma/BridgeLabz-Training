//Writing a Java program to calculate the factorial of a number using recursion.
import java.util.Scanner;

public class FactorialUsingRecursion {

    // Method to take input
    public static int takeInput(Scanner scanner) {
        System.out.print("Enter a number: ");
        return scanner.nextInt();
    }

    // Recursive method to calculate factorial
    public static long factorial(int n) {

        if (n < 0) {
            return -1; // invalid input
        }

        if (n == 0 || n == 1) {
            return 1;
        }

        return n * factorial(n - 1);
    }

    // Method to display result
    public static void displayResult(int number, long result) {

        if (result == -1) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            System.out.println("Factorial of " + number + " is: " + result);
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = takeInput(scanner);
        long result = factorial(number);
        displayResult(number, result);

        scanner.close(); // Closing the Scanner Object
    }
}
