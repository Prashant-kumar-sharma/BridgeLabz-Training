
// Writing a Java Program to check Perfect, Abundant, Deficient and Strong Numbers
import java.util.Scanner;

public class NumberChecker4 {

    // Method to find sum of proper divisors of a number
    public static int sumOfProperDivisors(int number) {
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    // Method to check Perfect number
    public static boolean isPerfect(int number) {
        return sumOfProperDivisors(number) == number;
    }

    // Method to check Abundant number
    public static boolean isAbundant(int number) {
        return sumOfProperDivisors(number) > number;
    }

    // Method to check Deficient number
    public static boolean isDeficient(int number) {
        return sumOfProperDivisors(number) < number;
    }

    // Method to check Strong number
    public static boolean isStrong(int number) {
        int temp = number;
        int sum = 0;

        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        return sum == number;
    }

    // Method to calculate factorial of a digit
    public static int factorial(int digit) {
        int fact = 1;
        for (int i = 1; i <= digit; i++) {
            fact *= i;
        }
        return fact;
    }

    // Main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        System.out.println("\nResults:");
        System.out.println("Is Perfect Number: " + isPerfect(number));
        System.out.println("Is Abundant Number: " + isAbundant(number));
        System.out.println("Is Deficient Number: " + isDeficient(number));
        System.out.println("Is Strong Number: " + isStrong(number));

        input.close();
    }
}
