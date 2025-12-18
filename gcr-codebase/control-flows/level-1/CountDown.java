//Writing a Java Code to count down the number from the user input value to 1
import java.util.Scanner;
public class CountDown {
	public static void main(String args[]) {
		// Create a Scanner Object to take input from user
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a Counter : ");
		int counter = input.nextInt();
		
		//Count Down Begins using while loop
		while(counter>0) {
			System.out.println(counter--);
		}
		input.close(); //Closing the Scanner Object
	}
}