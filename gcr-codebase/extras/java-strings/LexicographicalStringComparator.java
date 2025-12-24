//Writing a Java program to compare two strings lexicographically
import java.util.Scanner;

public class LexicographicalStringComparator {

    // Method to compare two strings lexicographically
    public static void compareStrings(String s1, String s2) {
        int minLength = Math.min(s1.length(), s2.length());
        boolean differenceFound = false;

        for (int i = 0; i < minLength; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                if (s1.charAt(i) < s2.charAt(i)) {
                    System.out.println("\"" + s1 + "\" comes before \"" + s2 + "\" in lexicographical order");
                } else {
                    System.out.println("\"" + s2 + "\" comes before \"" + s1 + "\" in lexicographical order");
                }
                differenceFound = true;
                break;
            }
        }

        // If no difference found in characters
        if (!differenceFound) {
            if (s1.length() < s2.length()) {
                System.out.println("\"" + s1 + "\" comes before \"" + s2 + "\" in lexicographical order");
            } else if (s1.length() > s2.length()) {
                System.out.println("\"" + s2 + "\" comes before \"" + s1 + "\" in lexicographical order");
            } else {
                System.out.println("Both strings are equal");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s1 = scanner.nextLine();

        System.out.print("Enter second string: ");
        String s2 = scanner.nextLine();

        compareStrings(s1, s2);
        scanner.close();   //Closing the Scanner Object
    }
}
