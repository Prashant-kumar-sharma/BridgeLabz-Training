//Writing a Java Code to check for the natural number and write the sum of n natural numbers 
import java.util.Scanner;
public class SumOfNaturalNumber {
	//method to Calculate Sum of Natural numbers
	public static int sumOfNumbers( int number)
	{
		int sum = number *(number + 1)/2; //Formula for sum of n numbers
		return sum;
	}
	public static void main(String args[]) {
		// Create a Scanner Object to take input from user
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int number = input.nextInt();
		
		//Calling method sumOfNumbers
		int sum = sumOfNumbers(number);
		System.out.println("The sum of " + number + " natural numbers is " +sum);
		
		input.close(); //Closing the Scanner Object
	}
}
