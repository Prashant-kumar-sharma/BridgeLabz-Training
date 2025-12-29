/*6. Parking Lot Gate System 🚗
Develop a smart parking system.
● Options: Park, Exit, Show Occupancy
● Use switch-case for the menu.
● while loop to continue until the parking lot is full or the user exits. */

//Writing a Java Code to develop a smart parking system.
import java.util.Scanner;

public class ParkingLotGateSystem {

    // Method to show current parking status
    public static void showOccupancy(int totalCapacity, int availableSlots) {
        System.out.println("\n------ Parking Lot Status ------");
        System.out.println("Total Capacity      : " + totalCapacity);
        System.out.println("Occupied Slots      : " + (totalCapacity - availableSlots));
        System.out.println("Available Slots     : " + availableSlots);
        System.out.println("--------------------------------");
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter total parking lot capacity: ");
        int totalCapacity = input.nextInt();
        int availableSlots = totalCapacity;

        System.out.println("\nParking Lot Gate System Started");
        System.out.println("--------------------------------");

        while (true) {

            System.out.println("\nSelect an option:");
            System.out.println("1. Park Vehicle");
            System.out.println("2. Show Occupancy");
            System.out.println("3. Exit System");
            System.out.print("Enter your choice: ");

            String option = input.next().trim().toLowerCase();

            switch (option) {

                case "park":
                case "1":
                    if (availableSlots == 0) {
                        System.out.println("\nParking Lot Full.");
                        System.out.println("Entry Gate Closed.");
                    } else {
                        availableSlots--;
                        System.out.println("\nVehicle Entry Successful.");
                        System.out.println("Parking Slot Allocated.");
                        System.out.println("Available Slots Remaining: " + availableSlots);
                    }
                    break;

                case "showoccupancy":
                case "2":
                    showOccupancy(totalCapacity, availableSlots);
                    break;

                case "exit":
                case "3":
                    System.out.println("\nSystem Exit Initiated.");
                    System.out.println("Parking Lot Gate System Closed.");
                    input.close();
                    return;

                default:
                    System.out.println("\nInvalid Option.");
                    System.out.println("Please select a valid menu option.");
            }

            if (availableSlots == 0) {
                System.out.println("\nParking Lot is now FULL.");
                System.out.println("No further vehicle entries allowed.");
                break;
            }
        }

        input.close();
    }
}
