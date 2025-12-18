//Writing a Java code to find the sum of numbers until the user enters 0
import java.util.Scanner;
public class SumUntilZero {
	public static void main(String args[]) {
		// Create a Scanner Object to take input from user
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a Number : ");
		double value = input.nextDouble();
		double total = 0.0;
		
		//Sum until users input 0 
		if(value > 0) {
			while(value!=0)
			{
				total += value;
				System.out.println("Input value again");
				value = input.nextDouble();
			}
			System.out.println("Total Value " + total);
		}
		else
		{
			System.out.println("Total Value " + total);
		}
		input.close(); //Closing the Scanner Object
	}
}