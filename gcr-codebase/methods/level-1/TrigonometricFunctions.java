//Writing a Java Code to calculate various trigonometric functions using Math class given an angle in degrees
import java.util.Scanner;
public class TrigonometricFunctions {
    // Method to calculate sine, cosine and tangent
    public double[] calculateTrigonometricFunctions(double angle) {
        double[] result = new double[3];
        
		// Convert angle from degrees to radians
        double radians = Math.toRadians(angle);
        
		// Calculate trigonometric values
        result[0] = Math.sin(radians); // Sine
        result[1] = Math.cos(radians); // Cosine
        result[2] = Math.tan(radians); // Tangent

        return result;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter angle in degrees: ");
        double angle = input.nextDouble();

        // Creating object
        TrigonometricFunctions trig = new TrigonometricFunctions();

        // Calling method
        double[] values = trig.calculateTrigonometricFunctions(angle);

        // Displaying results
        System.out.println("Sine value     : " + values[0]);
        System.out.println("Cosine value   : " + values[1]);
        System.out.println("Tangent value  : " + values[2]);

        input.close(); //Closing the Scanner Object
    }
}
