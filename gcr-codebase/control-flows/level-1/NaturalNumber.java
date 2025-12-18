//Writing a Java Code to check for the natural number and write the sum of n natural numbers 
import java.util.Scanner;
public class NaturalNumber {
	public static void main(String args[]) {
		// Create a Scanner Object to take input from user
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		
		//Check if the nunmber is a Natural number or not
		if(number > 0) {
			int sum = number*(number + 1)/2;
			System.out.println("The sum of " + number + " natural numbers is " +sum);
		}
		else {
			System.out.println("The sum of " + number + " is not a natural number");
		}
		input.close(); //Closing the Scanner Object
	}
}
