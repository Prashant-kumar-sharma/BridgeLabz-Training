//Writing a Java Program to Check Collinearity of 3 Points
import java.util.Scanner;

public class CollinearPoints {

    // Method to check collinearity using slope formula
    public static boolean checkCollinearBySlope(
            double x1, double y1,
            double x2, double y2,
            double x3, double y3) {

        // Handle vertical line case to avoid division by zero
        if ((x2 - x1) == 0 && (x3 - x2) == 0) {
            return true;
        }

        double slopeAB = (y2 - y1) / (x2 - x1);
        double slopeBC = (y3 - y2) / (x3 - x2);
        double slopeAC = (y3 - y1) / (x3 - x1);

        return (slopeAB == slopeBC) && (slopeAB == slopeAC);
    }

    // Method to check collinearity using area of triangle formula
    public static boolean checkCollinearByArea(
            double x1, double y1,
            double x2, double y2,
            double x3, double y3) {

        double area = x1 * (y2 - y3)
                    + x2 * (y3 - y1)
                    + x3 * (y1 - y2);

        return area == 0;
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

        System.out.print("Enter x3 y3: ");
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();

        boolean slopeResult = checkCollinearBySlope(x1, y1, x2, y2, x3, y3);
        boolean areaResult = checkCollinearByArea(x1, y1, x2, y2, x3, y3);

        if (slopeResult && areaResult) {
            System.out.println("The given points are COLLINEAR.");
        } else {
            System.out.println("The given points are NOT collinear.");
        }

        input.close();
    }
}
