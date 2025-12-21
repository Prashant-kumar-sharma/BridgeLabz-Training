
// Writing a Java Code to find Factors, Sum, Product & Sum of Squares
import java.util.Scanner;

public class FactorsOperations {
    // Method to find factors and return them as an array
    public static int[] findFactors(int number) {
        int count = 0;

        // First loop: count the number of factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        // Initialize array to store factors
        int[] factors = new int[count];
        int index = 0;

        // Second loop: store the factors in the array
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }

        return factors;
    }

    // Method to find sum of factors
    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int f : factors) {
            sum += f;
        }
        return sum;
    }

    // Method to find product of factors
    public static long productOfFactors(int[] factors) {
        long product = 1;
        for (int f : factors) {
            product *= f;
        }
        return product;
    }

    // Method to find sum of squares of factors
    public static double sumOfSquares(int[] factors) {
        double sum = 0;
        for (int f : factors) {
            sum += Math.pow(f, 2);
        }
        return sum;
    }

    // Main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int[] factors = findFactors(number);

        System.out.println("Factors of " + number + ":");
        for (int f : factors) {
            System.out.print(f + " ");
        }

        System.out.println("\nSum of factors: " + sumOfFactors(factors));
        System.out.println("Product of factors: " + productOfFactors(factors));
        System.out.println("Sum of squares of factors: " + sumOfSquares(factors));

        input.close(); // Closing the Scanner Object
    }
}
