// Writing a Java Code to reverse a number using arrays
import java.util.Scanner;
public class ReverseNumberUsingArray {
    public static void main(String[] args) {
        // Create Scanner object to take user input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int temp = number;
        int count = 0;
        while (temp != 0)
		{
            count++;
            temp = temp / 10;
        }

        int[] digits = new int[count];
        for (int i = count -1 ; i >= 0; i--)
		{
            digits[i] = number % 10;
            number = number / 10;
        }

        int[] reverse = new int[count];
        for (int i = 0; i < count; i++) {
            reverse[i] = digits[count - 1 - i];
        }

        // Displaying the reversed number
        System.out.print("Reversed Number = ");
        for (int i = 0; i < count; i++) 
		{
            System.out.print(reverse[i]);
        }
        input.close(); // Closing the Scanner object
    }
}
