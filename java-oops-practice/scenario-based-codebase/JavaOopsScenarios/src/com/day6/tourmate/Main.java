package com.day6.tourmate;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("✈️ Welcome to TourMate ✈️");

        // Trip type
        System.out.println("Choose Trip Type:");
        System.out.println("1. Domestic");
        System.out.println("2. International");
        int tripType = sc.nextInt();
        sc.nextLine();

        boolean international = (tripType == 2);

        // Destination
        System.out.print("Enter destination city: ");
        String destination = sc.nextLine();

        // Duration
        System.out.print("Enter duration (days): ");
        int days = sc.nextInt();

        // Hotel
        System.out.println("Choose Hotel Type:");
        System.out.println("1. Luxury");
        System.out.println("2. Budget");
        int hotelChoice = sc.nextInt();

        // Transport
        System.out.println("Choose Transport:");
        System.out.println("1. Flight");
        System.out.println("2. Train/Cruise");
        int transportChoice = sc.nextInt();

        // Activities
        System.out.println("Choose Activity:");
        System.out.println("1. Adventure");
        System.out.println("2. Sightseeing");
        int activityChoice = sc.nextInt();

        Transport transport = new Transport(transportChoice, international);
        Hotel hotel = new Hotel(hotelChoice, days, international);
        Activity activity = new Activity(activityChoice, international);

        Trip trip = international
                ? new InternationalTrip(destination, days, transport, hotel, activity)
                : new DomesticTrip(destination, days, transport, hotel, activity);

        trip.book();
        sc.close();
    }
}
