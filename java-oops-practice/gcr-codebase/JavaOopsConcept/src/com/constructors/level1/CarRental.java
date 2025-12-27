package com.constructors.level1;

import java.util.Scanner;

public class CarRental {

    // Attributes
    String customerName;
    String carModel;
    int rentalDays;
    double costPerDay;

    // Parameterized constructor
    public CarRental(String customerName, String carModel, int rentalDays, double costPerDay) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.costPerDay = costPerDay;
    }

    // Method to calculate total rental cost
    public double calculateTotalCost() {
        return rentalDays * costPerDay;
    }

    // Method to display rental details
    public void displayRentalDetails() {
        System.out.println("Customer Name : " + customerName);
        System.out.println("Car Model     : " + carModel);
        System.out.println("Rental Days   : " + rentalDays);
        System.out.println("Cost Per Day  : " + costPerDay);
        System.out.println("Total Cost    : " + calculateTotalCost());
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input in main
        System.out.print("Enter customer name: ");
        String customerName = sc.nextLine();

        System.out.print("Enter car model: ");
        String carModel = sc.nextLine();

        System.out.print("Enter rental days: ");
        int rentalDays = sc.nextInt();

        System.out.print("Enter cost per day: ");
        double costPerDay = sc.nextDouble();

        // Creating object using parameterized constructor
        CarRental rental = new CarRental(customerName, carModel, rentalDays, costPerDay);

        System.out.println("\nRental Details:");
        rental.displayRentalDetails();

        sc.close();
    }
}

