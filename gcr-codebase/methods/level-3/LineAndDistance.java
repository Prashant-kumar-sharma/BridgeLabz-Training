//Writing a Java Program to Calculate Euclidean Distance Using Line Equation
import java.util.Scanner;

public class LineAndDistance {

    // Method to find Euclidean distance between two points
    public static double findDistance(
            double x1, double y1,
            double x2, double y2) {

        double distance = Math.sqrt(
                Math.pow(x2 - x1, 2) +
                Math.pow(y2 - y1, 2)
        );
        return distance;
    }

    // Method to find slope and y-intercept
    // returns array: index 0 -> slope (m), index 1 -> intercept (b)
    public static double[] findLineEquation(
            double x1, double y1,
            double x2, double y2) {

        double[] result = new double[2];

        double m = (y2 - y1) / (x2 - x1); // slope
        double b = y1 - m * x1;           // y-intercept

        result[0] = m;
        result[1] = b;

        return result;
    }

    // Main method
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter x1 y1: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();

        System.out.print("Enter x2 y2: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        double distance = findDistance(x1, y1, x2, y2);
        double[] line = findLineEquation(x1, y1, x2, y2);

        System.out.println("\nEuclidean Distance = " + distance);
        System.out.println("Equation of Line: y = " + line[0] + "x + " + line[1]);

        input.close();
    }
}
