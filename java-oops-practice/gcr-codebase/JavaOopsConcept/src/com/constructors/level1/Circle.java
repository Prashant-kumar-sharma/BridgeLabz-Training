package com.constructors.level1;

import java.util.Scanner;

public class Circle {

    // Attribute
    double radius;

    // Default constructor (calls parameterized constructor)
    public Circle() {
        this(1.0);   // default radius
    }

    // Parameterized constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to display radius
    public void displayRadius() {
        System.out.println("Radius: " + radius);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Using default constructor
        Circle c1 = new Circle();
        System.out.println("\nDefault Circle:");
        c1.displayRadius();

        // Taking user input
        System.out.print("\nEnter radius for parameterized circle: ");
        double r = sc.nextDouble();

        // Using parameterized constructor
        Circle c2 = new Circle(r);
        System.out.println("\nParameterized Circle:");
        c2.displayRadius();

        sc.close();
    }
}
