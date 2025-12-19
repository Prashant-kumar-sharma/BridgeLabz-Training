// Writing a Java program to calculate BMI and weight status
import java.util.Scanner;
public class BMICalculation {
    public static void main(String[] args) {
        // Create Scanner object to take user input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of persons: ");
        int n = input.nextInt();
        double[] weight = new double[n];
        double[] height = new double[n];
        double[] bmi = new double[n];
        String[] status = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for Person " + (i + 1));
            System.out.print("Weight (kg): ");
            weight[i] = input.nextDouble();
            System.out.print("Height (meters): ");
            height[i] = input.nextDouble();
        }

        // Calculating BMI and determining weight status
        for (int i = 0; i < n; i++) {
            bmi[i] = weight[i] / (height[i] * height[i]);

            if (bmi[i] < 18.5) 
			{
                status[i] = "Underweight";
            } else if (bmi[i] < 25) {
                status[i] = "Normal";
            } else if (bmi[i] < 30) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }

        // Displaying height, weight, BMI and status
        System.out.println("\nHeight\tWeight\tBMI\tStatus");
        for (int i = 0; i < n; i++) {
            System.out.println(height[i] + "\t" + weight[i] + "\t" +
                               bmi[i] + "\t" + status[i]);
        }

        input.close(); // Closing the Scanner object
    }
}
