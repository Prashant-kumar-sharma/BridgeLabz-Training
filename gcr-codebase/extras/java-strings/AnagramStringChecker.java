//Writing a Java program to check if two strings are anagrams of each other
import java.util.Scanner;

public class AnagramStringChecker {

    // Method to check if two strings are anagrams
    public static boolean isAnagram(String s1, String s2) {

        if (s1.length() != s2.length()) {
            return false;
        }

        int[] count = new int[256];

        for (int i = 0; i < s1.length(); i++) {
            count[s1.charAt(i)]++;
            count[s2.charAt(i)]--;
        }

        for (int i = 0; i < 256; i++) {
            if (count[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine();

        if (isAnagram(str1, str2)) {
            System.out.println("The strings are Anagrams");
        } else {
            System.out.println("The strings are NOT Anagrams");
        }

        scanner.close();   //Closing the Scanner Object
    }
}
