//Writing a Java Code to find the mean height of players in a football team
import java.util.Scanner;

public class MeanHeight {
    public static void main(String[] args) {
        // Create Scanner object to store user input
        Scanner input = new Scanner(System.in);
        double[] heights = new double[11];
        double sum = 0.0;

        System.out.println("Enter the heights of 11 football players:");
        for (int i = 0; i < heights.length; i++)
		{
            heights[i] = input.nextDouble();
            sum = sum + heights[i];   
        }

		//Calculating mean height and displaying the result
        double mean = sum / heights.length;
        System.out.println("Mean height of the football team is: " + mean);

        input.close(); // Closing the Scanner Object
    }
}
