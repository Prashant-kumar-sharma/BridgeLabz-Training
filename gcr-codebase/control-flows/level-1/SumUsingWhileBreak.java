//Write a Java Code  to find the sum until the user enters 0 or a negative number using while loop and break statement.
import java.util.Scanner;
public class SumUsingWhileBreak {
	public static void main(String args[]) {
		// Create a Scanner Object to take input from user
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a Number : ");
		double value = input.nextDouble();
		double total = 0.0;
		
		//Sum until users input 0 or negative value
		if(value > 0) {
			while(true)
			{
				total += value;
				System.out.println("Input value again");
				value = input.nextDouble();
				if(value<=0)
					break;
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