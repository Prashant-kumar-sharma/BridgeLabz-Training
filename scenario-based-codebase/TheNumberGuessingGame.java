/* 7. The Number Guessing Game 
A game asks the player to guess a number between 1 and 100.
Core Java Scenario Based Problem Statements
● Use do-while loop.
● Give hints like "Too high" or "Too low".
● Count attempts and exit after 5 wrong tries. */

import java.util.Scanner;

public class TheNumberGuessingGame {

    static final int MAX_ATTEMPTS = 5;

    // Method to check whether the guess is wrong
    public static boolean isGuessWrong(int userGuess, int numberToGuess, int attempts) {
        if (userGuess > numberToGuess) {
            System.out.println("Too High!");
        } else if (userGuess < numberToGuess) {
            System.out.println("Too Low!");
        } else {
            return false;
        }

        System.out.println("Attempts Left: " + (MAX_ATTEMPTS - attempts));
        System.out.println("----------------------------------------");
        return true;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        while (true) {

            int numberToGuess = (int) (Math.random() * 100) + 1;
            int attempts = 0;
            int userGuess;

            // Game Start Screen
            System.out.println("\n========================================");
            System.out.println("        NUMBER GUESSING GAME");
            System.out.println("========================================");
            System.out.println("Rules:");
            System.out.println("* Guess a number between 1 and 100");
            System.out.println("* You have 5 attempts");
            System.out.println("* Hints will be provided");
            System.out.println("========================================");

            // Game Loop
            do {
                System.out.println("\n----------------------------------------");
                System.out.println("Attempt " + (attempts + 1) + " / " + MAX_ATTEMPTS);
                System.out.print("Enter your guess (1 - 100): ");

                userGuess = input.nextInt();

                if (userGuess < 1 || userGuess > 100) {
                    System.out.println("Invalid Input! Enter a number between 1 and 100.");
                    System.out.println("Attempts Left: " + (MAX_ATTEMPTS - attempts));
                    continue;
                }

                attempts++;

                if (!isGuessWrong(userGuess, numberToGuess, attempts)) {
                    System.out.println("\n========================================");
                    System.out.println("CONGRATULATIONS!");
                    System.out.println("You guessed the correct number.");
                    System.out.println("Attempts Used: " + attempts);
                    System.out.println("You win the game.");
                    System.out.println("========================================");
                    break;
                }

            } while (attempts < MAX_ATTEMPTS);

            // Lose Condition
            if (attempts == MAX_ATTEMPTS && userGuess != numberToGuess) {
                System.out.println("\n========================================");
                System.out.println("GAME OVER");
                System.out.println("You have used all your attempts.");
                System.out.println("The correct number was: " + numberToGuess);
                System.out.println("Better luck next time.");
                System.out.println("========================================");
            }

            // Replay Menu
            System.out.println("\n----------------------------------------");
            System.out.println("What would you like to do next?");
            System.out.println("Type 'next'  → Play again");
            System.out.println("Type 'exit'  → Exit game");
            System.out.println("----------------------------------------");

            String choice = input.next().trim().toLowerCase();

            if (choice.equals("exit")) {
                System.out.println("\n========================================");
                System.out.println("Thank you for playing.");
                System.out.println("========================================");
                break;
            } else if (!choice.equals("next")) {
                System.out.println("Invalid input. Exiting the game.");
                break;
            }
        }

        input.close();
    }
}
