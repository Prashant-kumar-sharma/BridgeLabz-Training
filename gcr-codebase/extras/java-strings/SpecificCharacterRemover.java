//Writing a Java program to remove a specific character from a string
import java.util.Scanner;

public class SpecificCharacterRemover {

    // Method to remove a specific character from a string
    public static String removeCharacter(String text, char removeChar) {
        String result = "";

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != removeChar) {
                result = result + text.charAt(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String input = scanner.nextLine();

        System.out.print("Enter the character to remove: ");
        char ch = scanner.next().charAt(0);

        String modified = removeCharacter(input, ch);
        System.out.println("Modified String: " + modified);

        scanner.close();   //Closing the Scanner Object
    }
}
