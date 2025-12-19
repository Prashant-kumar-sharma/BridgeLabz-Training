//Writing a Java Code to find the BMI of a person
import java.util.Scanner;
public class BMICalculator {
    public static void main(String[] args) {
		//Create Scanner object to take input from the user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight in kg: ");
        double weight = input.nextDouble();
        System.out.print("Enter height in cm: ");
        double heightCm = input.nextDouble();

        //Converting height from cm to meters
        double heightM = heightCm / 100;

        //Calculating BMI
        double bmi = weight / (heightM * heightM);
		String status;

        //Determining BMI status
        if (bmi <= 18.4)
		{
            status = "Underweight";
        }
		else if (bmi >= 18.5 && bmi <= 24.9)
		{
            status = "Normal";
        }
		else if (bmi >= 25.0 && bmi <= 39.9)
		{
            status = "Overweight";
        }
		else
		{
            status = "Obese";
        }

        // Display the Result
        System.out.println("\n--- BMI Result ---");
        System.out.println("BMI: " + bmi);
        System.out.println("Status: " + status);
        input.close(); //Closing the Scanner class
    }
}
