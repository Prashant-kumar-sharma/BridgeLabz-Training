//Writing a Java Code to print a multiplication table of a number.
import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args) {
		//Create Scanner object to take input from the user
        Scanner input = new Scanner(System.in);
		System.out.println("Enter a number : ");
        int number = input.nextInt();
        int[] table = new int[10];

        // Store multiplication results from 1 to 10
        for (int i = 1; i <= 10; i++)
		{
            table[i - 1] = number * i;
        }

        // Display the multiplication table
        for (int i = 1; i <= 10; i++)
		{
            System.out.println(number + " * " + i + " = " + table[i - 1]);
        }
        input.close(); // Closing the Scanner Object
    }
}
