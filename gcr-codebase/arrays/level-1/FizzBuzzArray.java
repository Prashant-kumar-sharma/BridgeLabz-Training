// Program to implement FizzBuzz using an array
import java.util.Scanner;
public class FizzBuzzArray {
    public static void main(String[] args) {
        // Create Scanner object to store user input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        if (number <= 0) {
            System.err.println("Error: Invalid Output");
            input.close();
            return;
        }
        String[] result = new String[number + 1];
        for (int i = 1; i <= number; i++)
		{
            if (i % 3 == 0 && i % 5 == 0)
			{
                result[i] = "FizzBuzz";
            }
			else if (i % 3 == 0)
			{
                result[i] = "Fizz";
            }
			else if (i % 5 == 0)
			{
                result[i] = "Buzz";
            }
			else
			{
                result[i] = String.valueOf(i);
            }
        }

        // Print results with index positions
        for (int i = 1; i <= number; i++)
		{
            System.out.println("Position " + i + " = " + result[i]);
        }
        input.close(); //Closing the Scanner Object
    }
}