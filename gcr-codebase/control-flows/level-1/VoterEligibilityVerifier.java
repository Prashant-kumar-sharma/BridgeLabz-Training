//Writing a Java Code to check whether a person can vote, depending on whether his/her age is greater than or equal to 18.
import java.util.Scanner;
public class VoterEligibilityVerifier {
	public static void main(String args[]) {
		// Create a Scanner Object to take input from user
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the age : ");
		int age = input.nextInt();
		
		//Checks if a voter is eligible to vote or not and Display Result.
		if(age >= 18) {
			System.out.println("The person's age is "+ age + " and can vote.");
		}
		else {
			System.out.println("The person's age is "+ age + " and cannot vote.");
		}
		input.close(); //Closing the Scanner Object
	}
}

