/* 2. Vehicle Rental Application
Scenario: Build a system for renting bikes, cars, and trucks to customers.
Concepts Used:
● Class: Vehicle, Bike, Car, Truck, Customer
● Constructors: Custom constructors for different vehicle types
● Access Modifiers: protected for vehicle attributes to allow subclass access
● Interface: Rentable with method calculateRent(int days)
● Operators: Used in rent calculation (e.g., baseRate × days ± surcharges)

● OOP:
	○ Abstraction: Rentable abstracts rental behavior
	○ Inheritance: Car, Bike, Truck inherit from Vehicle
	○ Polymorphism: Rent calculation differs by vehicle type
	○ Encapsulation: All fields hidden behind getters/setters 
*/

package com.day1.vehiclerentalapplication;

abstract class Vehicle implements Rentable {

	protected String vehicleNumber;
	protected String vehicleName;
	protected double baseRate;

	public Vehicle(String vehicleNumber, String vehicleName, double baseRate) {
		this.vehicleNumber = vehicleNumber;
		this.baseRate = baseRate;
		this.vehicleName = vehicleName;
	}

	// Encapsulation
	public String getVehicleNumber() {
		return vehicleNumber;
	}

	public double getBaseRate() {
		return baseRate;
	}
	
	public String getVehicleName() {
		return vehicleName;
	}

	public void displayDetails() {
		System.out.println("Vehicle Name : " + vehicleName);
		System.out.println("Vehicle No : " + vehicleNumber);
		System.out.println("Base Rate  : Rs. " + baseRate + " per day");
	}
}