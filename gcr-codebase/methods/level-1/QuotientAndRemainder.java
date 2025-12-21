//write a Java code to take 2 numbers and print their quotient and reminder
import java.util.Scanner;
public class QuotientAndRemainder {
	//findRemainderAndQuotient to find Remainder and Quotient
	public static int[] findRemainderAndQuotient(int number, int divisor) 
	{
		int[] quotientRemainder = new int[2];
		quotientRemainder[0] = number%divisor; //Remainder
		quotientRemainder[1] = number / divisor; //Quotient
		
		return quotientRemainder;
	}
    public static void main(String[] args) {
        // Creating Scanner object to take input from user
        Scanner input = new Scanner(System.in);
		System.out.print("Enter a number and a divisor : ");
		int number = input.nextInt();
        int divisor = input.nextInt();

		//Calling the method
		int[] quotientRemainder = findRemainderAndQuotient(number, divisor);
		
		//Display the results
        System.out.println(
            "The Quotient is " + quotientRemainder[1] +
            " and Reminder is " + quotientRemainder[0] +
            " of two number " + number +
            " and " + divisor);
			
		input.close(); //Closing the Scanner Object
    }
}
