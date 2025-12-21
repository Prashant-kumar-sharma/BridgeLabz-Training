
// Writing a Java Program to find factors of a number and perform operations on them
import java.util.Scanner;

public class FactorsProgram {

    // Method to find factors of a number and return them as an array
    // Uses two loops: one for count, one for storing factors
    public static int[] getFactors(int number) {
        int count = 0;

        // First loop: count number of factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        // Create array to store factors
        int[] factors = new int[count];
        int index = 0;

        // Second loop: store factors in array
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }

        return factors;
    }

    // Method to find the greatest factor
    public static int greatestFactor(int[] factors) {
        return factors[factors.length - 1];
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

    // Method to find product of cubes of factors using Math.pow()
    public static double productOfCubes(int[] factors) {
        double product = 1;
        for (int f : factors) {
            product *= Math.pow(f, 3);
        }
        return product;
    }

    // Main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int[] factors = getFactors(number);

        System.out.println("\nFactors of " + number + ":");
        for (int f : factors) {
            System.out.print(f + " ");
        }

        System.out.println("\n\nGreatest Factor: " + greatestFactor(factors));
        System.out.println("Sum of Factors: " + sumOfFactors(factors));
        System.out.println("Product of Factors: " + productOfFactors(factors));
        System.out.println("Product of Cubes of Factors: " + productOfCubes(factors));

        input.close();
    }
}
