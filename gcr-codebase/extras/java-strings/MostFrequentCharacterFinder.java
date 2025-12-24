//Writing a Java program to find the most frequent character in a string
import java.util.Scanner;

public class MostFrequentCharacterFinder {

    // Method to find the most frequent character
    public static char findMostFrequentChar(String text) {
        int maxCount = 0;
        char mostFrequent = text.charAt(0);

        for (int i = 0; i < text.length(); i++) {
            int count = 0;
            for (int j = 0; j < text.length(); j++) {
                if (text.charAt(i) == text.charAt(j)) {
                    count++;
                }
            }

            if (count > maxCount) {
                maxCount = count;
                mostFrequent = text.charAt(i);
            }
        }
        return mostFrequent;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        char result = findMostFrequentChar(input);
        System.out.println("Most Frequent Character: '" + result + "'");
        scanner.close();   //Closing the Scanner Object
    }
}
