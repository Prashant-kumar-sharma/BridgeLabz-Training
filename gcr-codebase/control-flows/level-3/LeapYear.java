 //Write a LeapYear program that takes a year as input and outputs the Year is a Leap Year or not a Leap Year. 
import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        //Create Scanner object to take input from the user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = input.nextInt();
		
		//Leap Year check using one if and logical operators
		//check if its greater than 1582, Gregorian calendar.
		if(year > 1582 && year%4 ==0)
		{
			System.out.println(year + "is a Leap Year ");
		}
		else
		{
			System.out.println(year + "is not a Leap Year ");
		}
		
		//Leap year check using Multiple if-else statements
		if(year > 1582)
		{
			if(year%4==0)
			{
				System.out.println(year + "is a Leap Year ");
			}
			else
			{
				System.out.println(year + "is not a Leap Year ");
			}
		}
		else
		{
			System.out.println(year + "is not a Leap Year ");
		}
		input.close(); //Closing Scanner object
    }
}
		