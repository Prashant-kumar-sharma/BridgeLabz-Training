/*11. Temperature Logger 🌡️
Record temperatures over 7 days.
● Use array and for-loop.
● Find average and max temperature.
● Use if for comparisons. Maintain readable naming and modular code blocks
*/

import java.util.Scanner;

public class TemperatureLogger {

    // Method to get Average
    public static double getAverage(double[] temperature) {
        double sum = 0.0;
        for (int i = 0; i < temperature.length; i++) {
            sum += temperature[i];
        }
        return sum / temperature.length;
    }

    // Method to get Max Temperature
    public static double getMaxTemperature(double[] temperature) {
        double maxTemperature = temperature[0];
        for (int i = 1; i < temperature.length; i++) {
            if (maxTemperature < temperature[i]) {
                maxTemperature = temperature[i];
            }
        }
        return maxTemperature;
    }

    // Main Method
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        double[] temperature = new double[7];

        //Starting  Output Design
        System.out.println("----------------------------------------------");
        System.out.println(" Temperature Logger : Weekly Data Collection ");
        System.out.println("----------------------------------------------");
        System.out.println("Enter temperature readings for 7 consecutive days.\n");

        for (int i = 0; i < temperature.length; i++) {
            System.out.print("Day " + (i + 1) + " reading (in °C): ");
            temperature[i] = input.nextDouble();
        }

        // Calculations
        double average = getAverage(temperature);
        double maxTemperature = getMaxTemperature(temperature);

        // Output Section
        System.out.println();
        System.out.println("--------------- Result Summary ---------------");
        System.out.printf("Average of recorded temperatures : %.2f °C%n", average);
        System.out.printf("Highest temperature recorded     : %.2f °C%n", maxTemperature);
        System.out.println("----------------------------------------------");

        System.out.println("Data analysis completed.");
        input.close();
    }
}
