//Writing a Java Code to check if a string is a palindrome without using built-in reverse functions
import java.util.Scanner;

public class PalindromeStringChecker {

    // Method to check palindrome
    public static boolean isPalindrome(String text) {
        String reversed = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            reversed = reversed + text.charAt(i);
        }

        return text.equals(reversed);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.next();

        if (isPalindrome(input)) {
            System.out.println("The string is a Palindrome");
        } else {
            System.out.println("The string is NOT a Palindrome");
        }
        scanner.close(); // Closing the Scanner Object   
    }
}