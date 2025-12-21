
// Writing a Java Program to calculate BMI of 10 persons and display their status
import java.util.Scanner;

public class BMICalculator {

    // Method to calculate BMI and populate 3rd column of array
    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0]; // weight in kg
            double heightCm = data[i][1]; // height in cm
            double heightM = heightCm / 100; // convert cm to meters

            data[i][2] = weight / (heightM * heightM); // BMI
        }
    }

    // Method to determine BMI status and return status array
    public static String[] getBMIStatus(double[][] data) {
        String[] status = new String[data.length];

        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2];

            if (bmi <= 18.4) {
                status[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi <= 24.9) {
                status[i] = "Normal";
            } else if (bmi >= 25.0 && bmi <= 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }
        return status;
    }

    // Main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 10 rows, 3 columns (weight, height, BMI)
        double[][] persons = new double[10][3];

        // Taking input
        for (int i = 0; i < persons.length; i++) {
            System.out.print("Enter weight (kg) of person " + (i + 1) + ": ");
            persons[i][0] = input.nextDouble();

            System.out.print("Enter height (cm) of person " + (i + 1) + ": ");
            persons[i][1] = input.nextDouble();
        }

        // Calculate BMI
        calculateBMI(persons);

        // Get BMI status
        String[] status = getBMIStatus(persons);

        // Display result
        System.out.println("\nPerson\tWeight\tHeight\tBMI\t\tStatus");
        for (int i = 0; i < persons.length; i++) {
            System.out.printf("%d\t%.2f\t%.2f\t%.2f\t%s%n",
                    (i + 1),
                    persons[i][0],
                    persons[i][1],
                    persons[i][2],
                    status[i]);
        }

        input.close();
    }
}
