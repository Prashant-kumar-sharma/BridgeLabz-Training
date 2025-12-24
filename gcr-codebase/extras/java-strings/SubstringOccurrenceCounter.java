//Writing a Java Code to Count Substring Occurrences in a String
import java.util.Scanner;

public class SubstringOccurrenceCounter {

    // Method to count substring occurrences
    public static int countOccurrences(String text, String sub) {
        int count = 0;

        for (int i = 0; i <= text.length() - sub.length(); i++) {
            int j;
            for (j = 0; j < sub.length(); j++) {
                if (text.charAt(i + j) != sub.charAt(j)) {
                    break;
                }
            }
            if (j == sub.length()) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the main string: ");
        String text = scanner.nextLine();

        System.out.print("Enter the substring: ");
        String sub = scanner.nextLine();

        int result = countOccurrences(text, sub);
        System.out.println("Substring occurs " + result + " times");

        scanner.close();   //Closing the Scanner Object
    }
}
