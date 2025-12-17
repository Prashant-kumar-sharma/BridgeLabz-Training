//Writing a Java Code to find the length of side in a square whose perimeter you read from the user
import java.util.Scanner;
public class SquareSideLength {
	public static void main(String args[]) {
		//Create variable perimeter to store the perimeter of square
		double perimeter;
		
		// Creating Scanner object to take input from user
		Scanner input = new Scanner(System.in);
		perimeter = input.nextDouble();
		
		//Calculating the length of side of square and printing it
		double side = perimeter/4.0;
		System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);
		input.close(); //Closing the Scanner Object
	}
}

