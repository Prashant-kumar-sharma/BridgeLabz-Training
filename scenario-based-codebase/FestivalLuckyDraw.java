/* 20. Festival Lucky Draw 🎉
At Diwali mela, each visitor draws a number.
● If the number is divisible by 3 and 5, they win a gift.
● Use if, modulus, and loop for multiple visitors.
● continue if input is invalid. */


import java.util.Scanner;

public class FestivalLuckyDraw {

    // Method to check if a number is valid
    public static boolean isValidNumber(int number) {
        return number > 0;
    }

    // Method to check winning condition
    public static boolean isWinner(int number) {
        return number % 3 == 0 && number % 5 == 0;
    }

    // Method to process each visitor
    public static void processVisitor(Scanner sc, int visitorNumber) {

        System.out.print("Visitor " + visitorNumber + ", enter your lucky number: ");
        int number = sc.nextInt();

        if (!isValidNumber(number)) {
            System.out.println("Invalid number! Please enter a positive number.");
            return; // exit this visitor's processing
        }

        if (isWinner(number)) {
            System.out.println("Congratulations! You won a gift!");
        } else {
            System.out.println("Sorry! Better luck next time.");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("======================================");
        System.out.println("        FESTIVAL LUCKY DRAW");
        System.out.println("======================================");

        System.out.print("Enter number of visitors: ");
        int visitors = sc.nextInt();

        for (int i = 1; i <= visitors; i++) {
            processVisitor(sc, i);
            System.out.println("--------------------------------------");
        }

        System.out.println("Thank you for participating in the Lucky Draw!");
        sc.close();
    }
}
