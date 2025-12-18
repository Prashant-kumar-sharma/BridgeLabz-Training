//Writing a Java Code to Find All Multiples of a Number Below 100 using While loop
import java.util.Scanner;
public class MultiplesBelowHundredUsingWhile {
    public static void main(String[] args) {
        //Create Scanner object to take input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer less than 100: ");
        int number = input.nextInt();

        //Check if the number is positive and less than 100
        if (number > 0 && number < 100)
		{
            System.out.println("Multiples of " + number + " below 100 are:");
            int counter = 100;
            while (counter > 1)
			{
                //Check if counter is a multiple of the number
                if (counter % number == 0)
				{
                    System.out.println(counter);
                }
                counter--;
            }
        }
		else
		{
            System.out.println("Please enter a positive integer less than 100.");
        }
        input.close(); //Closing the Scanner Object
    }
}