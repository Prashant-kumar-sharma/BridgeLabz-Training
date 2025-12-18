//Writing a Java Code to Find the Power of a Number
import java.util.Scanner;
public class PowerOfNumber {
    public static void main(String[] args) {
        //Create Scanner object to take input from the user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the base number: ");
        int number = input.nextInt();

        System.out.print("Enter the power: ");
        int power = input.nextInt();

        //Check if both number and power are positive integers
        if (number > 0 && power >= 0)
		{
            int result = 1;
            for (int i = 1; i <= power; i++)
			{
                result = result * number;
            }

            //Print the final result
            System.out.println(number + " raised to the power " + power + " is: " + result);
        }
		else
		{
            System.out.println("Invalid Input.");
        }
        input.close(); //Closing Scanner object
    }
}
