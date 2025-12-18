// Creating class with name CheckDivisibility to check if a number is divisible by 5 or not
import java.util.Scanner;
public class CheckDivisibility {
	public static void main(String args[]) {
		// Create a Scanner Object to take input from user
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		
		//Check If number is divisble by 5 and display the result
		System.out.println("Is the number " + number +" divisible by 5? " + (number%5==0));
		input.close(); //Closing the Scanner Object
	}
}

		