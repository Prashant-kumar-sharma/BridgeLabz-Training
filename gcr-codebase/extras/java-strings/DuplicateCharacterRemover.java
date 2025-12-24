//Writing a Java Code to Remove Duplicate Characters from a String
import java.util.Scanner;

public class DuplicateCharacterRemover {

    // Method to remove duplicate characters
    public static String removeDuplicates(String text) {
        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);

            // Check if character already exists in result
            boolean isDuplicate = false;
            for (int j = 0; j < result.length(); j++) {
                if (result.charAt(j) == currentChar) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                result = result + currentChar;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.next();

        String output = removeDuplicates(input);
        System.out.println("String after removing duplicates: " + output);

        scanner.close(); //Closing the Scanner Object
    }
}
