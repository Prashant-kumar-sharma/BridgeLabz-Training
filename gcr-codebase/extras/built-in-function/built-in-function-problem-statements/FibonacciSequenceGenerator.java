//Writing a Java program to generate Fibonacci sequence up to 'n' terms
import java.util.Scanner;

public class FibonacciSequenceGenerator {

    // Method to generate and print Fibonacci sequence
    public static void printFibonacci(int terms) {

        if (terms <= 0) {
            System.out.println("Please enter a positive number of terms.");
            return;
        }

        int first = 0;
        int second = 1;

        System.out.print("Fibonacci Sequence: ");

        for (int i = 1; i <= terms; i++) {
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of terms: ");
        int n = scanner.nextInt();

        printFibonacci(n);

        scanner.close(); // Closing the Scanner Object
    }
}
