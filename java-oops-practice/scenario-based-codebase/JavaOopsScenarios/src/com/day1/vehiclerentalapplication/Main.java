package com.day1.vehiclerentalapplication;

import java.util.Scanner;

class Main {

	public static void displayMenu() {

		System.out.println("-------------------------------------------------------");
		System.out.println("|     Welcome to Prashant Vehicle Rental Centre       |");
		System.out.println("-------------------------------------------------------");
		System.out.println();
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Customer customer = new Customer();

		customer.setName("Prashant Kumar Sharma");

		Vehicle[] vehicles = { new Bike("BIKE101", " Royal Enfield Classic 350", 800),
				new Car("CAR101", "Tata Nexon", 1000), new Truck("TRUCK101", "Mahindra Jeeto", 2500) };

		displayMenu();
		System.out.print("Enter the number of days to rent the vehicle: ");
		int days = input.nextInt();

		System.out.println("\nCustomer : " + customer.getName());
		System.out.println("\n--------------------------------\n");

		System.out.println("Vehicles List");
		System.out.println("--------------------------------\n");
		for (Vehicle v : vehicles) {

			v.displayDetails();
			System.out.println("\n--------------------------------\n");
		}

		System.out.println("Enter the Vehicle to Rent (Bike, Car, Truck) :");
		String choice = input.next().trim().toLowerCase();
		switch (choice) {
		case "bike":
			System.out.println("Vehicle Choosed : Bike");
			vehicles[0].displayDetails();
			System.out.println("Total Rent  : Rs. " + vehicles[0].calculateRent(days));
			System.out.println("\n--------------------------------\n");
			break;

		case "car":
			System.out.println("Vehicle Choosed : Car");
			vehicles[1].displayDetails();
			System.out.println("Surcharge : Rs. 500");
			System.out.println("Total Rent  : Rs. " + vehicles[1].calculateRent(days));
			System.out.println("\n--------------------------------\n");
			break;

		case "truck":
			System.out.println("Vehicle Choosed : Truck");
			vehicles[2].displayDetails();
			System.out.println("Surcharge : Rs. 1000");
			System.out.println("Total Rent  : Rs. " + vehicles[2].calculateRent(days));
			System.out.println("\n--------------------------------\n");
			break;

		default:

			System.out.println("Invalid Input! Exitting the System");
		}

		input.close();
	}
}