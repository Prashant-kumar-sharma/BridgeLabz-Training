
// Writing a Java Program to find the sum of n Natural Numbers using Recursion and Formula
import java.util.Scanner;

public class SumOfNaturalNumbers {

    // Method to find sum using recursion
    public static int recursiveSum(int n) {
        if (n == 0)
            return 0;
        return n + recursiveSum(n - 1);
    }

    // Method to find sum using formula n*(n+1)/2
    public static int formulaSum(int n) {
        return n * (n + 1) / 2;
    }

    // Main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int n = input.nextInt();

        // Check if number is natural
        if (n <= 0) {
            System.out.println("Please enter a valid natural number (greater than 0).");
        } else {
            int sumByRecursion = recursiveSum(n);
            int sumByFormula = formulaSum(n);

            System.out.println("Sum using recursion: " + sumByRecursion);
            System.out.println("Sum using formula: " + sumByFormula);

            // Compare results
            if (sumByRecursion == sumByFormula) {
                System.out.println("Result verified: Both computations give the same result.");
            } else {
                System.out.println("Result mismatch: Computations are different.");
            }
        }

        input.close(); // Closing the Scanner Object
    }
}
