// Writing a Java Code to check if the first is the smallest of the 3 numbers.
import java.util.Scanner;
public class CheckFirstNumberSmallest {
	public static void main(String args[]) { 
		// Create a Scanner Object to take input from user
		Scanner input = new Scanner(System.in);
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		int number3 = input.nextInt();
		
		//Check If the first iss the smallest of the 3 numbers
		System.out.println("Is the first number the smallest? " + ((number1 < number2) && (number3 > number1)));
		input.close(); //Closing the Scanner Object
	}
}
