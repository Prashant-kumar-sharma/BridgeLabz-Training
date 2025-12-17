//Writing a Java code to convert distance in kilometers to miles.
import java.util.Scanner;
public class ConvertKmToMiles {
	public static void main(String args[]) {
		//Create variable km to store distance in kilometres
		double km;
		
		// Creating Scanner object to take input from user
		Scanner input = new Scanner(System.in);
		km=input.nextDouble();
		
		// Create variable miles to convert Kilometres to miles and print the result 
		double miles =km/1.6;
		System.out.println("The total miles is " + miles + " mile for the given " + km + " km");
		input.close(); //Closing the Scanner Object
	}
}