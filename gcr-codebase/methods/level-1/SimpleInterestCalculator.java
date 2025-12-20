//Writing a Java code to input the Principal, Rate, and Time values and calculate Simple Interest.
import java.util.Scanner;
public class SimpleInterestCalculator {
	//calculateSimpleInterest method to calculate Simple Interest
	public static double calculateSimpleInterest(double principal, double rate, double time)
	{
		//Calculating Simple Interest
		double simpleInterest = principal * rate * time / 100.0; 
		return simpleInterest;
	}
    public static void main(String[] args) {
        // Create Scanner object to take user input
        Scanner input = new Scanner(System.in);
		System.out.print("Enter the Principal : ");
		double principal = input.nextDouble();
		System.out.print("Enter the Rate of Interest : ");
		double rate = input.nextDouble();
		System.out.print("Enter the Time in years : ");
		double time = input.nextDouble();
		
		//Calling the calculateSimpleInterest method
		double simpleInterest = calculateSimpleInterest(principal, rate, time);
		
		//Display the results
		System.out.println(
					"The Simple Interest is " + simpleInterest 
					+ " for Principal " + principal 
					+ ", Rate of Interest "+ rate 
					+ " and Time ” + time );
		
		input.close(); //Closing the Scanner Object
	}
}