// Writing a Java Code to find the discounted amount and discounted price the student will pay for the course.
import java.util.Scanner;
public class StudentFee {
	public static void main(String args[]) {
		//Create variable fee and discountPercent to store the fee and discount percent
		int fee, discountPercent = 10;
		
		// Creating Scanner object to take input from user
		Scanner input = new Scanner(System.in);
		fee=input.nextInt();
		discountPercent=input.nextInt();
		
		//Creating variable discountedAmount and discountedFee to store discounted amount and final discounted fee
		int discount = discountPercent*fee/100;
		int discountedFee = fee - discount;
		
		//Print the Result
		System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + discountedFee);
		input.close(); //Closing the Scanner Object
	}
}
