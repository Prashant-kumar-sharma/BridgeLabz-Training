//Writing a Java Code to find the smallest and the largest of the 3 numbers.
import java.util.Scanner;
public class LargestAndSmallestNumber {
	//findSmallestAndLargest to find largest and smallest number 
	public static int[] findSmallestAndLargest(int number1, int number2, int number3)
	{
		int[] largestSmallest = new int[2];
		largestSmallest[0] = Math.max(Math.max(number1, number2), number3); //to store largest number
		largestSmallest[1] = Math.min(Math.min(number1, number2), number3); //to store smallest number
		
		return largestSmallest;
	}
	public static void main(String args[]) { 
		// Create a Scanner Object to take input from user
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 3 numbers : ");
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		int number3 = input.nextInt();
		
		int[] largestSmallest = findSmallestAndLargest(number1, number2, number3);
		
		//Displaying the results
		System.out.println("Largest Number : " + largestSmallest[0]);
		System.out.println("Smallest Number : " +largestSmallest[1]);
		
		input.close(); //Closing the Scanner Object.
	}
}