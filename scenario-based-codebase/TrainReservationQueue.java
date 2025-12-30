/*12. Train Reservation Queue 🚆
Simulate a basic ticket booking system.
● Show menu with switch
● Allow multiple bookings using while-loop.
● Stop booking once seats reach zero (break). */

import java.util.Scanner;

public class TrainReservationQueue {

   public static void bookTicket(Scanner input, int availableSeats) {
        System.out.print("\nEnter passenger name: ");
        String name = input.next();

        System.out.print("Enter passenger age: ");
        int age = input.nextInt();

        if (age <= 0) {
            System.out.println("\nInvalid age. Booking failed.");
            return;
        }

        System.out.println("\nTicket booked successfully.");
        System.out.println("\nPassenger Name : " + name);
        System.out.println("Passenger Age  : " + age);
		System.out.println("Passenger Seat Number : " + availableSeats);
    }

    // Method to show available seats
    public static void showAvailableSeats(int availableSeats) {
        System.out.println("Available Seats: " + availableSeats);
    }

    // Method to cancel ticket
    public static void cancelTicket(Scanner input) {
        System.out.print("Your choice: ");
        String choice = input.next().toLowerCase();

        if (choice.equals("yes")) {
            System.out.println("Ticket cancelled successfully.");
            System.out.println("70% refund will be processed.");
        } else {
            System.out.println("Cancellation aborted.");
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("==============================================");
        System.out.println("         TRAIN RESERVATION QUEUE SYSTEM        ");
        System.out.println("==============================================\n");
        int availableSeats = (int)(Math.random() * 50) +1;
        System.out.print("Total available seats: "+ availableSeats );

        // Loop until seats are exhausted
        while (true) {

            if (availableSeats == 0) {
                System.out.println("\nAll seats are booked.");
                System.out.println("Reservation closed.");
                break;
            }
			
			//Menu options
            System.out.println("\n------------------- MENU ----------------------");
            System.out.println("1. Book Ticket");
            System.out.println("2. View Available Seats");
            System.out.println("3. Cancel Ticket");
            System.out.println("4. Exit");
            System.out.println("----------------------------------------------");
            System.out.print("Enter your choice: ");

            int menuChoice = input.nextInt();

            switch (menuChoice) {

               case 1: //for booking ticket
                    if (availableSeats > 0) {
                        bookTicket(input, availableSeats);
                        availableSeats--;
                        System.out.println("\nSeats remaining: " + availableSeats);
                    }
                    break;

                case 2: //to check available seats
                    showAvailableSeats(availableSeats);
                    break;

                case 3: //for cancelling the ticket
                    System.out.println("\nTicket Cancellation Notice");
                    System.out.println("Only 70% of ticket price will be refunded.");
                    System.out.println("Type 'yes' to confirm or 'no' to go back.");
                    cancelTicket(input);
                    availableSeats++;
                    System.out.println("Seats updated. Current seats: " + availableSeats);
                    break;

                case 4: //exit
                    System.out.println("Thank you for using the reservation system.");
                    input.close();
                    return;

                default: //incase of invalid input
                    System.out.println("Invalid option. Please choose again.");
            }
        }

        input.close(); //Closing to prevent resource leakage
    }
}
