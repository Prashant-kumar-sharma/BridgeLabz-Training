//Writing a Java Code to Find the Longest Word in a Sentence
import java.util.Scanner;

public class LongestWordFinder {

    // Method to find the longest word in a sentence
    public static String findLongestWord(String sentence) {
        String[] words = sentence.split(" ");
        String longestWord = words[0];

        for (int i = 1; i < words.length; i++) {
            if (words[i].length() > longestWord.length()) {
                longestWord = words[i];
            }
        }
        return longestWord;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();

        String longestWord = findLongestWord(input);
        System.out.println("Longest word: " + longestWord);

        scanner.close();   //Closing the Scanner Object
    }
}
