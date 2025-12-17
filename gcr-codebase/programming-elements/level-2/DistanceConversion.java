//Writing a Java Code to find the distance in yards and miles for the distance provided by the user in feet
import java.util.Scanner;
public class DistanceConversion {
	public static void main(String args[]) {
		//create variable distanceInFeet to store distance in feets
		double distanceInFeet;
		
		// Creating Scanner object to take input from user
		Scanner input = new Scanner(System.in);
		distanceInFeet = input.nextDouble();
		
		//Calculating the distance in yards and miles and printing it
		double distanceInYard = distanceInFeet/3;
		double distanceInMiles = distanceInYard/1760;
		System.out.println(
			"The distance in yards is " + distanceInYard + 
			" while the distance in miles is " + distanceInMiles);
		input.close(); //Closing the Scanner Object
	}
}