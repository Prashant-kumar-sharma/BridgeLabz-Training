//Writing a Java Code to find factors of a number and store them in an array
import java.util.Scanner;
public class FactorsOfNumber {
    public static void main(String[] args) {
        // Create Scanner object to store user input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int maxFactor = 10;
        int[] factors = new int[maxFactor];
        int index = 0;

        // Finding factors of the number
        for (int i = 1; i <= number; i++) {

            if (number % i == 0) {

                // If array is full, increase its size by twice
                if (index == maxFactor)
				{
                    maxFactor = maxFactor * 2; //increase by twice the maxFactor
                    int[] temp = new int[maxFactor];
                    for (int j = 0; j < index; j++)
					{
                        temp[j] = factors[j];
                    }
                    factors = temp; // Assign back
                }
                factors[index] = i;
                index++;
            }
        }

        // Display factors
        System.out.println("Factors of " + number + " are:");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }
        input.close(); //Closing the Scanner Object
    }
}
