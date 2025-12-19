// Writing a Java Code to store all digits of a number and find the largest and second largest digit
import java.util.Scanner;
public class LargestAndSecondLargestDigit {
    public static void main(String[] args) {
        // Create Scanner object to take user input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        while (number != 0)
		{
            // Increase array size if index reaches maxDigit
            if (index == maxDigit)
			{
                maxDigit = maxDigit + 10;
                int[] temp = new int[maxDigit];
                for (int i = 0; i < digits.length; i++)
				{
                    temp[i] = digits[i];
                }

                digits = temp; // Assigning new array to digits
            }
            digits[index] = number % 10;
            number = number / 10;
            index++;
        }

        int largest = 0;
        int secondLargest = 0;

        // Finding the largest and second largest digit
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        // Displaying the result
        System.out.println("Largest Digit = " + largest);
        System.out.println("Second Largest Digit = " + secondLargest);

        input.close(); // Closing the Scanner object
    }
}
