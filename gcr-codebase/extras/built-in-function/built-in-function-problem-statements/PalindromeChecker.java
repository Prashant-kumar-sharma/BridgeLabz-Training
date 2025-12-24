//Writing a Java program to check if a given string is a palindrome using built-in functions
import java.util.Scanner;

public class PalindromeChecker {

    // Method to take input
    public static String takeInput(Scanner scanner) {
        System.out.print("Enter a string: ");
        return scanner.nextLine();
    }

    // Method to check if string is palindrome
    public static boolean isPalindrome(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Method to display result
    public static void displayResult(String text, boolean result) {
        if (result) {
            System.out.println("\"" + text + "\" is a Palindrome");
        } else {
            System.out.println("\"" + text + "\" is NOT a Palindrome");
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = takeInput(scanner);
        boolean result = isPalindrome(input);
        displayResult(input, result);

        scanner.close(); // Closing the Scanner Object
    }
}
