//Writing a Java Code to find frequency of digits in a number
import java.util.Scanner;
public class DigitsFrequency {
    public static void main(String[] args) {
        // Create Scanner object to take user input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = input.nextInt();
        int tempNumber = number;
        int count = 0;
        while (tempNumber != 0)
		{
            count++;
            tempNumber = tempNumber / 10;
        }

        int[] digits = new int[count];
        tempNumber = number;
        for (int i = 0; i < count; i++)
		{
            digits[i] = tempNumber % 10;
            tempNumber = tempNumber / 10;
        }
        int[] frequency = new int[10];

        //Finding frequency of each digit
        for (int i = 0; i < count; i++)
		{
            frequency[digits[i]]++;
        }

        //Displaying frequency of each digit
        System.out.println("Digit Frequency:");
        for (int i = 0; i < frequency.length; i++)
		{
            if (frequency[i] > 0)
			{
                System.out.println("Digit " + i + " occurs " + frequency[i] + " times");
            }
        }
		input.close(); //Closing the Scanner Object
    }
}
