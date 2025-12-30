/* 14. Movie Ticket Booking App 🎬
Ask users for movie type, seat type (gold/silver), and snacks.
● Use switch and if together.
● Loop through multiple customers.
● Clean structure and helpful variable names.  */

import java.util.Scanner;

public class MovieTicketBookingSystem {

    final static int TOTAL_SEATS = 50;
    static String[] customerNames = new String[TOTAL_SEATS];
    static int bookingCount = 0;
	
	//Method to display Movie Type
    public static void displayMovieType() {
        System.out.println("\nMovie Type");
        System.out.println("1. Action");
        System.out.println("2. Comedy");
        System.out.println("3. Thriller");
        System.out.print("Select movie type: ");
    }
	
	//Method to display Movie Name
    public static void displayMovieNames(String[] moviesName) {
        System.out.println("\nAvailable Movies");
        for (int i = 0; i < moviesName.length; i++) {
            System.out.println((i + 1) + ". " + moviesName[i]);
        }
        System.out.print("Select movie: ");
    }
	
	//Method to display Seat Type
    public static void displaySeatType() {
        System.out.println("\nSeat Type");
        System.out.println("1. Silver (Rs. 150)");
        System.out.println("2. Gold   (Rs. 250)");
        System.out.print("Select seat type: ");
    }
	
	//Method to display Snacks Menu
    public static void displaySnacksMenu() {
        System.out.println("\nSnacks");
        System.out.println("1. Popcorn (Rs. 80)");
        System.out.println("2. Nachos  (Rs. 100)");
        System.out.println("3. No Snacks");
        System.out.print("Select option: ");
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int availableTickets = TOTAL_SEATS;

        String[] moviesName = { "Dhurandhar", "Avatar: Fire and Ash", "Wake Up Dead Man", "Zootopia 2", "The Girlfriend" };

        System.out.println("==============================================");
        System.out.println("          MOVIE TICKET BOOKING SYSTEM          ");
        System.out.println("==============================================");

        while (true) {

            if (availableTickets == 0) {
                System.out.println("\nAll tickets sold out.");
                break;
            }

            int totalAmount = 0;
            int seatPrice = 0;
            int snackPrice = 0;

            // Movie Type
            displayMovieType();
            int movieType = input.nextInt();
            if (movieType < 1 || movieType > 3) continue;

            // Movie Name
            displayMovieNames(moviesName);
            int movieChoice = input.nextInt();
            if (movieChoice < 1 || movieChoice > moviesName.length) continue;

            // Seat Type
            displaySeatType();
            int seatType = input.nextInt();

            if (seatType == 1) seatPrice = 150;
            else if (seatType == 2) seatPrice = 250;
            else continue;

            // Snacks
            displaySnacksMenu();
            int snackChoice = input.nextInt();

            if (snackChoice == 1) snackPrice = 80;
            else if (snackChoice == 2) snackPrice = 100;
            else snackPrice = 0;

            totalAmount = seatPrice + snackPrice;

            //BILL BREAKDOWN
            System.out.println("\n--------------- BILL DETAILS ----------------");
            System.out.println("Seat Charge   : Rs. " + seatPrice);
            System.out.println("Snacks Charge : Rs. " + snackPrice);
            System.out.println("---------------------------------------------");
            System.out.println("Total Amount  : Rs. " + totalAmount);
            System.out.println("---------------------------------------------");

            System.out.print("Confirm payment (yes/no): ");
            String payment = input.next();

            if (!payment.equalsIgnoreCase("yes")) {
                System.out.println("Payment cancelled. Booking aborted.");
                continue;
            }

			input.nextLine(); // consume leftover newline
			
            // Customer Details
            System.out.print("\nEnter customer name: ");
            String customerName = input.nextLine();

            System.out.print("\nEnter customer age: ");
            int age = input.nextInt();
            if (age <= 0) continue;

            customerNames[bookingCount++] = customerName;
            availableTickets--;

            //Ticket Confirmation
            System.out.println("\n----------- TICKET BOOKED SUCCESSFULLY -----------");
            System.out.println("Customer Name : " + customerName);
            System.out.println("Age           : " + age);
            System.out.println("Movie         : " + moviesName[movieChoice - 1]);
            System.out.println("Seat Type     : " + (seatType == 1 ? "Silver" : "Gold"));
            System.out.println("Amount Paid   : Rs. " + totalAmount);
            System.out.println("Tickets Left  : " + availableTickets);
            System.out.println("-------------------------------------------------");

            System.out.print("\nBook for another customer? (yes/no): ");
            if (!input.next().equalsIgnoreCase("yes")) break;
        }

        input.close();
        System.out.println("\nThank you for using the booking system.");
    }
}