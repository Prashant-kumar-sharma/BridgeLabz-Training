//Writing a Java Code to check if a number is Armstrong or not.
import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {
		//Create Scanner object to take input from the user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
		
        int originalNumber = number; 
        int sum = 0;                 

        //Calculating the sum of cubes of it digits.
        while (originalNumber != 0)
		{
            int digit = originalNumber % 10;
            sum = sum + (digit * digit * digit);
            originalNumber = originalNumber / 10;
        }

		//Check if both are same or not
        if (sum == number) 
		{
            System.out.println(number + " is an Armstrong Number");
        } else {
            System.out.println(number + " is NOT an Armstrong Number");
        }

        input.close(); //Closing Scanner object
    }
}
