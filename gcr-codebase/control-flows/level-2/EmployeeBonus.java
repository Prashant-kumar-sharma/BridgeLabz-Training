//Writing a Java Code to find the bonuses of employees based on their years of service.
import java.util.*;
public class EmployeeBonus {
	public static void main(String args[]) { 
		//Create a Scanner Object to take input from user
		Scanner input = new Scanner(System.in);
		
		System.out.println("Input Salary and Year of Service : ");
		int salary = input.nextInt();
		int yearOfService = input.nextInt();
		double bonusAmount =0.0;
		
		//Check if the year of service is greater than or equal to 5 years
		if(yearOfService >= 5)
		{
			bonusAmount =(double) 5.0*salary/100.0;   //5% of bonus 
		}
		System.out.println("The Bonus Amount is " + bonusAmount ); //Display the result
		input.close(); //Closing the Scanner Object
	}
}
