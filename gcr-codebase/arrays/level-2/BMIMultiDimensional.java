// Writing a Java program to calculate BMI using a multi-dimensional array
import java.util.Scanner;
public class BMIMultiDimensional {
    public static void main(String[] args) {
        // Create Scanner object to take user input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of persons: ");
        int number = input.nextInt();
        // index 0 → weight, index 1 → height, index 2 → BMI
        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];

        // Taking weight and height input with validation
        for (int i = 0; i < number; i++)
		{
            System.out.println("Enter details for Person " + (i + 1));
            System.out.print("Weight (kg): ");
            double weight = input.nextDouble();
            System.out.print("Height (meters): ");
            double height = input.nextDouble();
            if (weight <= 0 || height <= 0)
			{
                System.out.println("Invalid input! Please enter positive values.");
                i--; 
                continue;
            }

            personData[i][0] = weight;
            personData[i][1] = height;
        }

        // Calculating BMI and weight status
        for (int i = 0; i < number; i++) {
            personData[i][2] = personData[i][0] / (personData[i][1] * personData[i][1]);
            if (personData[i][2] < 18.5)
			{
                weightStatus[i] = "Underweight";
            }
			else if (personData[i][2] < 25)
			{
                weightStatus[i] = "Normal";
            }
			else if (personData[i][2] < 30)
			{
                weightStatus[i] = "Overweight";
            }
			else
			{
                weightStatus[i] = "Obese";
            }
        }

        // Displaying height, weight, BMI and status
        System.out.println("\nHeight\tWeight\tBMI\tStatus");
        for (int i = 0; i < number; i++) {
            System.out.println( personData[i][1] + "\t" + personData[i][0] + "\t" + personData[i][2] + "\t" + weightStatus[i]);
        }
        input.close(); // Closing the Scanner object
    }
}
