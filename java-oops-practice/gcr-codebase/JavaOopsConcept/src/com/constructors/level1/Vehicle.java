package com.constructors.level1;

public class Vehicle {

    // Instance variables
    String ownerName;
    String vehicleType;

    // Class variable (common for all vehicles)
    static double registrationFee = 5000.0;

    // Parameterized constructor
    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Instance method
    public void displayVehicleDetails() {
        System.out.println("Owner Name        : " + ownerName);
        System.out.println("Vehicle Type      : " + vehicleType);
        System.out.println("Registration Fee  : " + registrationFee);
    }

    // Class method
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    // Main method
    public static void main(String[] args) {

        // Updating registration fee using class method
        Vehicle.updateRegistrationFee(6500.0);

        // Creating vehicle objects
        Vehicle v1 = new Vehicle("Amit", "Car");
        Vehicle v2 = new Vehicle("Neha", "Bike");

        // Displaying vehicle details
        System.out.println("Vehicle 1 Details:");
        v1.displayVehicleDetails();

        System.out.println("\nVehicle 2 Details:");
        v2.displayVehicleDetails();
    }
}
