//Writing a Java program to toggle the case of each character in a given string.
import java.util.Scanner;

public class ToggleCaseConverter {

    // Method to toggle case of characters
    public static String toggleCase(String text) {
        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                result = result + (char)(ch + 32);
            } else if (ch >= 'a' && ch <= 'z') {
                result = result + (char)(ch - 32);
            } else {
                result = result + ch;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String toggled = toggleCase(input);
        System.out.println("Toggled string: " + toggled);
        scanner.close();   //Closing the Scanner Object 
    }
}
