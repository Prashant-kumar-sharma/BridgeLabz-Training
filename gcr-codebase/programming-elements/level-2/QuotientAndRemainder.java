//write a Java code to take 2 numbers and print their quotient and reminder
import java.util.Scanner;
public class QuotientAndRemainder {
    public static void main(String[] args) {
		// Create number1 and number2 to store number1 and number 2
		int number1, number2;
		
        // Creating Scanner object to take input from user
        Scanner input = new Scanner(System.in);
		number1 = input.nextInt();
        number2 = input.nextInt();

        // Calculate quotient and remainder and Display the result
        int quotient = number1 / number2;
        int remainder = number1 % number2;
        System.out.println(
            "The Quotient is " + quotient +
            " and Reminder is " + remainder +
            " of two number " + number1 +
            " and " + number2);
		input.close(); //Closing the Scanner Object
    }
}
