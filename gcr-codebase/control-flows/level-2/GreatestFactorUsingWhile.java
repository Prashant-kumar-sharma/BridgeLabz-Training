//Writing a Java Code to Find the Greatest Factor Using while Loop
import java.util.Scanner;
public class GreatestFactorUsingWhile {
    public static void main(String[] args) {
        //Create Scanner object to take input from the user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();
        int greatestFactor = 1;

        //Check whether the entered number is greater than 1 for finding the factor
        if (number > 1)
		{
            int counter = number - 1;
            while (counter >= 1)
			{
                //Check if counter is a factor of number
                if (number % counter == 0)
				{
                    greatestFactor = counter; 
                    break;                     
                }
                counter--;
            }
            //Display the greatest factor
            System.out.println("The greatest factor of " + number + " (other than itself) is: " + greatestFactor);
        }
		else
		{
            System.out.println("Invalid Input.");
        }
        input.close(); //Closing the Scanner Object
    }
}