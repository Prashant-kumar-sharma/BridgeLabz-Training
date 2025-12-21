//Writing a Java Code to check whether a number is positive, negative or zero.
import java.util.Scanner;
public class ZeroPositiveNegative {
	//checkZeroPositiveNegative method to check for positive, negative or zero
	public static int checkZeroPositiveNegative(int  number)
	{
		if(number > 0) //Check if the number is positive
		{
			return 1;
		}
		else if(number < 0) //Check if the number is negative
		{
			return -1;
		}
		else //if input is zero
		{
			return 0;
		}
	}
    public static void main(String[] args) {
        // Create Scanner object to take user input
        Scanner input = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int number = input.nextInt();
		
		//Calling method to check if the number is positive, negative or zero
		int result = checkZeroPositiveNegative(number);
		
		//Display the result
		System.out.println("Results : " +result);
		input.close(); //Closing the Scanner Object
	}
}