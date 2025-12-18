//Writing a Java Code to check whether a number is positive, negative, or zero.
import java.util.Scanner;
public class ZeroPositiveNegative {
	public static void main(String args[]) {
		// Create a Scanner Object to take input from user
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a Number : ");
		int number = input.nextInt();
		
		//Checks if a Number is positive, negative, or zero and Display the result
		if(number > 0) 
			System.out.println("Positive");
		else if(number < 0)
			System.out.println("Negative");
		else
			System.out.println("Zero");
		input.close(); //Closing the Scanner Object
	}
}