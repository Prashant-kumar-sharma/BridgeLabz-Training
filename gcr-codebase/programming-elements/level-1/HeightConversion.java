//Writing a Java Code that takes your height in centimeters and converts it into feet and inches
import java.util.Scanner;
public class HeightConversion {
	public static void main(String args[]) {
		//Create variable cm, inch and feett to store height in cm, inches and feets
		double cm, inch, feet;
		
		// Creating Scanner object to take input from user
		Scanner input = new Scanner(System.in);
		cm = input.nextDouble();
		
		//Converting the height in cm to inches and feetseet. Them printing the result.
		inch = cm/2.54;
		feet = inch/12;
		System.out.println("Your Height in cm is "+ cm + " while in feet is " + feet + " and inches is " + inch);
		input.close(); //Closing the Scanner Object
	}
}