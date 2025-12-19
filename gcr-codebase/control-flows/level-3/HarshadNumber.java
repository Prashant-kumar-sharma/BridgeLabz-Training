//Writing a Java Code to check if a number taken from the user is a Harshad Number.
import java.util.Scanner;
public class HarshadNumber {
    public static void main(String[] args) {
		//Create Scanner object to take input from the user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int sum = 0;
        int temp = number;

        //Calculating the sum of digits
        while (temp != 0) {
            sum = sum + (temp % 10);
            temp = temp / 10;
        }

        // Checking if it's a  Harshad Number  or not
        if (number % sum == 0)
		{
            System.out.println(number + " is a Harshad Number");
        }
		else
		{
            System.out.println(number + " is NOT a Harshad Number");
        }
        input.close(); //Closing the Scanner Object
    }
}

