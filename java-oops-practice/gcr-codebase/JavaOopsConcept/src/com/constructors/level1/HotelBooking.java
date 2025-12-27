package com.constructors.level1;

import java.util.Scanner;

public class HotelBooking {

    // Attributes
    String guestName;
    String roomType;
    int nights;

    // Parameterized constructor
    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    // Method to display booking details
    public void displayBookingDetails() {
        System.out.println("Guest Name : " + guestName);
        System.out.println("Room Type  : " + roomType);
        System.out.println("Nights     : " + nights);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input in main
        System.out.print("Enter guest name: ");
        String guestName = sc.nextLine();

        System.out.print("Enter room type: ");
        String roomType = sc.nextLine();

        System.out.print("Enter number of nights: ");
        int nights = sc.nextInt();

        // Creating object using parameterized constructor
        HotelBooking booking = new HotelBooking(guestName, roomType, nights);

        System.out.println("\nBooking Details:");
        booking.displayBookingDetails();

        sc.close();
    }
}
