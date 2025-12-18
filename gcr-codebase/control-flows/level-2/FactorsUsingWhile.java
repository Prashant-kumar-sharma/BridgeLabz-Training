//Writing a Java Code to find the factors of a number taken as user input.
import java.util.Scanner;
public class FactorsUsingWhile {
    public static void main(String[] args) {
        //Create Scanner object to take input from the user
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();
		
		//Check if the number is positive or not
        if (number > 0)
		{
            System.out.println("Factors of " + number + " are:");
            int i = 1;
            while (i < number)
			{
                if (number % i == 0)
				{
                    System.out.println(i); //Print the factor
                }
                i++;
            }
        }
		else
		{
            System.out.println("Not a positive integer.");
        }
        input.close(); //Closing the Scanner object
    }
}
