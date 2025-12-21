// Writing a Java Code to divide pens among students equally
import java.util.Scanner;
public class ChocolateDistribution {
	//findRemainderAndQuotient to find Remainder and Quotient
	public static int[] findRemainderAndQuotient(int number, int divisor) 
	{
		int[] quotientRemainder = new int[2];
		quotientRemainder[0] = number / divisor; //Number of Chocolats per Child
		quotientRemainder[1] = number%divisor; //Number of Chocolates remaining
		
		return quotientRemainder;
	}
	public static void main(String args[]) {
        // Creating Scanner object to take input from user
        Scanner input = new Scanner(System.in);
		System.out.print("Enter the Number of Chocolates and Number of Student : ");
		int numberOfChocolates = input.nextInt();
        int numberOfChildren = input.nextInt();
		
		
		int[] chocolateDistributionResult = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);
		
		//Print the Result
		System.out.println(
					"The Chocolate Per Student is " + chocolateDistributionResult[0] +
					" and the remaining chocolate not distributed is " + chocolateDistributionResult[1]);
	}
}
