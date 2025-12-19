// Writing a Java Code to find  the youngest friends among 3 Amar, Akbar, and Anthony and tallest among them.
import java.util.Scanner;
public class YoungestAndTallest {
    public static void main(String[] args) {
        // Create Scanner object to store user input
        Scanner input = new Scanner(System.in);
		String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        int[] heights = new int[3];

        // Taking input for each friend
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] = input.nextInt();

            System.out.print("Enter height of " + names[i] + " (in cm): ");
            heights[i] = input.nextInt();
        }

        // Find the youngest among them
        int youngestIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
        }

		// Find the tallest among them
        int tallestIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }

        // Display the results
        System.out.println("The youngest friend is: " + names[youngestIndex]);
        System.out.println("The tallest friend is: " + names[tallestIndex]);
        input.close(); // Closing the Scanner Object
    }
}
