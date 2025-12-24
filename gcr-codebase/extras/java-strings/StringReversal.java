//Writing a Java  Code to reverse a string without using built-in reverse functions
import java.util.Scanner;

public class StringReversal {

    // Method to reverse a string without using built-in reverse functions
    public static String reverseString(String text) {
        String reversed = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            reversed = reversed + text.charAt(i);
        }
        return reversed;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.next();

        String result = reverseString(input);
        System.out.println("Reversed string: " + result);

        scanner.close(); // Closing the Scanner Object
    }
}
