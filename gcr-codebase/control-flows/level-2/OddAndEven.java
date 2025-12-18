//Writing a Java Code  to print odd and even numbers between 1 to the number entered by the user.
import java.util.*;
public class OddAndEven {
	public static void main(String args[]) { 
		// Create a Scanner Object to take input from user
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a Number : ");
		int number = input.nextInt();
		
		//Check if the Number is Natural or not
		if(number > 0)
		{
			for(int i=1; i<=number;i++)
			{
				if(i%2==1)
					System.out.println("The number " + i + " is Odd");
				else
					System.out.println("The number " + i + " is Even");
			}
		}
		else
		{
			System.out.println("Not a Natural Number");
		}
		input.close(); //Closing the Scanner Object
	}
}
