// Write a Java program to take user input, check for a positive integer, and use a while loop to display FizzBuzz output
import java.util.Scanner;
public class FizzBuzzUsingWhile {
    public static void main(String[] args) {
		//Create Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

		//Check if the number is positive or not
        if (number > 0) 
		{
            int i = 1;
            while (i <= number) 
			{
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                }
                else if (i % 3 == 0) 
				{
                    System.out.println("Fizz");
                }
                else if (i % 5 == 0) 
				{
                    System.out.println("Buzz");
                }
                else 
				{
                    System.out.println(i);
                }
                i++;
            }
        }
		else 
		{
            System.out.println("Not a positive integer.");
        }
        input.close(); //Closing the Scanner Object
    }
}
