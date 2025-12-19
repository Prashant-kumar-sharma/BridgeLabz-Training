//Writing a Java Code to take user input and check whether a number is positive,  negative, or zero
import java.util.Scanner;
public class PositiveNegativeZero {
    public static void main(String[] args) {
		//Create Scanner object to take input from the user
        Scanner input = new Scanner(System.in);
		int[] number = new int[5];
		
		System.out.println("Enter the numbers");
		for(int i = 0 ; i < number.length ; i++)
		{
			number[i] = input.nextInt();
		}
		
		//Checking if students are eligible to give vote or not.
		for(int i = 0 ; i < number.length ; i++)
		{
			if(number[i] < 0) //check if age is greater than 
			{
				System.out.println("The number "+ number[i] +" is negative"); 
			}
			else if (number[i] >0)
			{
				System.out.println("The number "+ number[i] +" is positive"); 
			}
			else
			{
				System.out.println("The number " + number[i] + " is zero");
			}
		}
		
		//Compare the first and last element
		if(number[0] == number[number.length -1])
		{
			System.out.println("Both the number are same");
		}
		else if(number[0] > number[number.length -1])
		{
			System.out.println("First element is greater than last element");
		}
		else
		{
			System.out.println("First element is smaller than last element");
		}
		input.close(); // Closing the Scanner Object.
	}
}