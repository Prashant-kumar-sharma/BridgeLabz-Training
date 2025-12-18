//Write a program to find the sum of n natural numbers using while loop and formulae and compare the result.
import java.util.*;
public class SumOfNaturalNumbers {
	public static void main(String args[]) { 
		// Create a Scanner Object to take input from user
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a Number : ");
		int number = input.nextInt();
		int sumUsingWhile = 0, sumUsingFormulae = 0;
		
		//Check if the number is natural no. or not
		if(number > 0)
		{
			sumUsingFormulae = number * (number + 1)/2;
			while(number!=0)
			{
				sumUsingWhile += number--;
			}
			if(sumUsingWhile == sumUsingFormulae) //Check if both have same results
				System.out.println("The result from both computations was same and the sum is " +sumUsingFormulae);
			else
				System.out.println("The result from both computations was not same ");		
		}
		else
		{
			System.out.println("Not a Natural Number");
		}
		