//Writing a Java Code to store odd and even numbers in separate arrays
import java.util.Scanner;
public class OddEvenArray {
    public static void main(String[] args) {
        // Create Scanner object to store user input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        if (number <= 0)
		{
            System.out.println("Error: Please enter a natural number");
            input.close();
            return; // Exit program 
        }
		
        int[] even = new int[number / 2 + 1];
        int[] odd = new int[number / 2 + 1];

        int evenIndex = 0;
        int oddIndex = 0;

        for (int i = 1; i <= number; i++)
		{
            if (i % 2 == 0)
			{
                even[evenIndex] = i;
                evenIndex++;
            }
			else
			{
                odd[oddIndex] = i;
                oddIndex++;
            }
        }

        // Print odd numbers
        System.out.println("Odd Numbers:");
        for (int i = 0; i < oddIndex; i++)
		{
            System.out.print(odd[i] + " ");
        }

        // Print even numbers
        System.out.println("\nEven Numbers:");
        for (int i = 0; i < evenIndex; i++)
		{
            System.out.print(even[i] + " ");
        }
        input.close(); //Closing the Scanner Object
    }
}
