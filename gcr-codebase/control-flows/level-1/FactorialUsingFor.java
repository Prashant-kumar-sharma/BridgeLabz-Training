//Writing a Java Code to find the factorial of an integer entered by the user using For loop.
import java.util.*;
public class FactorialUsingFor {
	public static void main(String args[]) { 
		// Create a Scanner Object to take input from user
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a Number : ");
		int number = input.nextInt();
		long factorial=1;
		
		//check if its positive or not
		if(number > 0) {
			for(int i=number; i>0;i--) //Computing Factorial Using For loop
			{
				factorial *= i;
			}
			System.out.println("Factorial is " + factorial);
		}
		else
		{
			System.out.println("Negative Input");
		}
		input.close(); //Closing the Scanner Object
	}
}
