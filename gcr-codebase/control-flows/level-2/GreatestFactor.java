//Writing a Java Code to Find the Greatest Factor Other Than the Number Itself
import java.util.Scanner;
public class GreatestFactor {
    public static void main(String[] args) {
		//Create Scanner object to take input from the user
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();
        int greatestFactor = 1;

        //Check whether the entered number is greater than 1 for finding the factor 
        if (number > 1)
		{
            for (int i = number - 1; i >= 1; i--)
			{
				//Check if i is a factor of number
                if (number % i == 0)
				{
                    greatestFactor = i;  
                    break;              
                }
            }
            //Display the greatest factor
            System.out.println("The greatest factor of " + number + " (other than itself) is: " + greatestFactor);
        }
		else
		{
            System.out.println("Invalid Input");
        }
        input.close(); //Closing the Scanner Object
    }
}
