//Writing a Java Code to find the multiplication table of a number entered by the user from 6 to 9.
import java.util.*;
public class MultiplicationTable {
	public static void main(String args[]) { 
		//Create a Scanner Object to take input from user
		Scanner input = new Scanner(System.in);
		
		System.out.println("Input a number from 6 to 9 : ");
		int number = input.nextInt();
		
		for(int i=1; i<=10;i++)
		{
			System.out.println(number +" * " + i +" = " + number*i);
		}
		input.close(); //Closing the Scanner Object
	}
}
