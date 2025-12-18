//Writing a Java Code to Find All Multiples of a Number Below 100
import java.util.Scanner;
public class MultiplesBelowHundred {
    public static void main(String[] args) {
        //Create Scanner object to take input from the user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer less than 100: ");
        int number = input.nextInt();

        //Check if the number is positive and less than 100
        if (number > 0 && number < 100)
		{
            System.out.println("Multiples of " + number + " below 100 are:");
            for (int i = 100; i >= 1; i--)
			{
                //Check if i is a multiple of the given number
                if (i % number == 0)
				{
                    System.out.println(i); 
                }
            }
        }
		else
		{
            System.out.println("Invalid Input");
        }
        input.close(); //Closing the Scanner Object
    }
}
