//Writing a Number Guessing Game where the computer tries to guess the user's number
import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    // Method to generate a random guess within range
    public static int generateGuess(int low, int high) {
        Random random = new Random();
        return random.nextInt(high - low + 1) + low;
    }

    // Method to get user feedback
    public static String getUserFeedback(Scanner scanner) {
        System.out.print("Is the guess high, low, or correct? ");
        return scanner.nextLine().toLowerCase();
    }

    // Method to update range based on feedback
    public static int[] updateRange(int guess, int low, int high, String feedback) {
        if (feedback.equals("high")) {
            high = guess - 1;
        } else if (feedback.equals("low")) {
            low = guess + 1;
        }
        return new int[]{low, high};
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int low = 1;
        int high = 100;
        boolean guessedCorrectly = false;

        System.out.println("Think of a number between 1 and 100.");
        System.out.println("I will try to guess it!");

        while (!guessedCorrectly && low <= high) {

            int guess = generateGuess(low, high);
            System.out.println("My guess is: " + guess);

            String feedback = getUserFeedback(scanner);

            if (feedback.equals("correct")) {
                System.out.println("Yay! I guessed your number correctly 🎉");
                guessedCorrectly = true;
            } else {
                int[] range = updateRange(guess, low, high, feedback);
                low = range[0];
                high = range[1];
            }
        }

        scanner.close(); // Closing the Scanner Object
    }
}
