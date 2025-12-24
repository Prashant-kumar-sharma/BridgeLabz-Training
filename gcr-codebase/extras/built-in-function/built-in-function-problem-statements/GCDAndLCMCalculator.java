//Writing a Java program to calculate GCD and LCM of two numbers using built-in functions.
import java.util.Scanner;

public class GCDAndLCMCalculator {

    // Method to calculate GCD using Euclidean Algorithm
    public static int calculateGCD(int a, int b) {

        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }
        return a;
    }

    // Method to calculate LCM using GCD
    public static int calculateLCM(int a, int b) {

        return (a * b) / calculateGCD(a, b);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        int gcd = calculateGCD(num1, num2);
        int lcm = calculateLCM(num1, num2);

        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);

        scanner.close(); // Closing the Scanner Object
    }
}