/* 19. Bus Route Distance Tracker 🚌
Each stop adds distance.
● Ask if the passenger wants to get off at a stop.
● Use a while-loop with a total distance tracker.
● Exit on user confirmation. */

import java.util.Scanner;

public class BusRouteDistanceTracker {

    // Method to ask passenger decision
    public static boolean wantsToGetOff(Scanner input, int stopNumber) {
        System.out.print("Do you want to get off at Stop " + stopNumber + "? (yes/no): ");
        String response = input.next().trim().toLowerCase();
        return response.equals("yes");
    }

    // Method to display stop and distance details
    public static void showDistance(int stopNumber, double totalDistance) {
        System.out.println("\nReached Stop " + stopNumber);
        System.out.println("Total Distance Covered: " + totalDistance + " km");
        System.out.println("--------------------------------------");
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Header shown in main
        System.out.println("======================================");
        System.out.println("        BUS ROUTE DISTANCE TRACKER");
        System.out.println("======================================");

        
        double totalDistance = 0.0;
        int stopNumber = 1;

        while (true) {
			double distancePerStop = Math.round(((Math.random()*5)+1)*100.0)/100.0;
			System.out.print("Distance covered for next stop (in km): " + distancePerStop);

            totalDistance += distancePerStop;
            showDistance(stopNumber, totalDistance);

            if (wantsToGetOff(input, stopNumber)) {
                System.out.println("\nPassenger exited the bus.");
                System.out.println("Final Distance Travelled: " + totalDistance + " km");
                break;
            }

            stopNumber++;
        }

        System.out.println("\nThank you for using Bus Route Distance Tracker!");
        input.close();
    }
}
