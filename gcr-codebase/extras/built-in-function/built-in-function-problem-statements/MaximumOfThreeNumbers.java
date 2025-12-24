//Writing a Java program to find the maximum of three numbers using built-in functions.
import java.util.Scanner;

public class MaximumOfThreeNumbers {

    // Method to take input from the user
    public static int[] takeInput(Scanner scanner) {
        int[] numbers = new int[3];

        System.out.print("Enter first number: ");
        numbers[0] = scanner.nextInt();

        System.out.print("Enter second number: ");
        numbers[1] = scanner.nextInt();

        System.out.print("Enter third number: ");
        numbers[2] = scanner.nextInt();

        return numbers;
    }

    // Method to find the maximum of three numbers
    public static int findMaximum(int[] numbers) {
        int max = numbers[0];

        if (numbers[1] > max) {
            max = numbers[1];
        }
        if (numbers[2] > max) {
            max = numbers[2];
        }
        return max;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] values = takeInput(scanner);
        int maximum = findMaximum(values);

        System.out.println("Maximum of the three numbers is: " + maximum);

        scanner.close(); // Closing the Scanner Object
    }
}
