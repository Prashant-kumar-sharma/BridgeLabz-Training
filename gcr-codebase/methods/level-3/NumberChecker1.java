
// Writing a Java Program to perform digit operations and check Harshad Number
import java.util.Scanner;

public class NumberChecker1 {

    // Method to count number of digits
    public static int countDigits(int number) {
        int count = 0;
        while (number > 0) {
            count++;
            number /= 10;
        }
        return count;
    }

    // Method to store digits of a number in an array
    public static int[] getDigits(int number) {
        int count = countDigits(number);
        int[] digits = new int[count];

        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }

    // Method to find sum of digits using digits array
    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) {
            sum += d;
        }
        return sum;
    }

    // Method to find sum of squares of digits using Math.pow()
    public static double sumOfSquares(int[] digits) {
        double sum = 0;
        for (int d : digits) {
            sum += Math.pow(d, 2);
        }
        return sum;
    }

    // Method to check Harshad number
    public static boolean isHarshad(int number, int[] digits) {
        return number % sumOfDigits(digits) == 0;
    }

    // Method to find frequency of each digit using 2D array
    public static int[][] digitFrequency(int[] digits) {
        int[][] freq = new int[10][2];

        // Initialize digit column
        for (int i = 0; i < 10; i++) {
            freq[i][0] = i;
        }

        // Count frequency of digits
        for (int d : digits) {
            freq[d][1]++;
        }
        return freq;
    }

    // Main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int[] digits = getDigits(number);

        System.out.println("\nSum of Digits: " + sumOfDigits(digits));
        System.out.println("Sum of Squares of Digits: " + sumOfSquares(digits));
        System.out.println("Is Harshad Number: " + isHarshad(number, digits));

        System.out.println("\nDigit Frequency:");
        int[][] freq = digitFrequency(digits);
        for (int i = 0; i < freq.length; i++) {
            if (freq[i][1] > 0) {
                System.out.println("Digit " + freq[i][0] + " -> " + freq[i][1]);
            }
        }

        input.close();
    }
}
