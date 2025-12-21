//Writing a Java code to calculate the rounds of traingular park needed to complete the 5km Run.
import java.util.Scanner;
public class RoundsCalculator {
	//calculateNumberOfRounds method to calculate the number of rounds
	public static int calculateNumberOfRounds(double perimeter)
	{
		//Calculating Number Of Rounds
		int numberOfRounds =(int)Math.ceil(5/perimeter);
		return numberOfRounds;
	}
    public static void main(String[] args) {
        // Create Scanner object to take user input
        Scanner input = new Scanner(System.in);
		System.out.print("Enter the sides of the Triangular Park (in metres) : ");
		int side1 = input.nextInt();
		int side2 = input.nextInt();
		int side3 = input.nextInt();

		//Calculating the perimeter of park in kilometres
		double perimeter = (side1 + side2 + side3)/1000.0 ;
		
		//Calling method to calculate no. of rounds
		int numberOfRounds = calculateNumberOfRounds(perimeter);
		
		//Display the results
		System.out.println("Number of Rounds of the Park to complete 5km are : "+ numberOfRounds);
		
		input.close(); //Closing the Scanner Object
	}
}