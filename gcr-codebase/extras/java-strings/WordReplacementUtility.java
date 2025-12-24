//Weiting a Java program that replaces all occurrences of a specified word in a sentence with a new word.
import java.util.Scanner;

public class WordReplacementUtility {

    // User-defined replace method
    public static String replaceWord(String sentence, String oldWord, String newWord) {
        String result = "";
        String[] words = sentence.split(" ");

        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(oldWord)) {
                result = result + newWord;
            } else {
                result = result + words[i];
            }

            if (i < words.length - 1) {
                result = result + " ";
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the sentence: ");
        String sentence = scanner.nextLine();

        System.out.print("Enter word to replace: ");
        String oldWord = scanner.next();

        System.out.print("Enter new word: ");
        String newWord = scanner.next();

        String updatedSentence = replaceWord(sentence, oldWord, newWord);
        System.out.println("Modified Sentence: " + updatedSentence);

        scanner.close();   //Closing the Scanner Object
    }
}
