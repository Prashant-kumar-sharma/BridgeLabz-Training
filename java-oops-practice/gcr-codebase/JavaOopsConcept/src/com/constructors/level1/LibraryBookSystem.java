package com.constructors.level1;

import java.util.Scanner;

public class LibraryBookSystem {

    // Attributes
    String title;
    String author;
    double price;
    boolean availability;

    // Parameterized constructor
    public LibraryBookSystem(String title, String author, double price, boolean availability) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.availability = availability;
    }

    // Method to borrow a book
    public void borrowBook() {
        if (availability) {
            availability = false;
            System.out.println("Book borrowed successfully.");
        } else {
            System.out.println("Sorry, the book is already borrowed.");
        }
    }

    // Method to display book details
    public void displayDetails() {
        System.out.println("Title        : " + title);
        System.out.println("Author       : " + author);
        System.out.println("Price        : " + price);
        System.out.println("Availability : " + (availability ? "Available" : "Not Available"));
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input in main
        System.out.print("Enter book title: ");
        String title = sc.nextLine();

        System.out.print("Enter author name: ");
        String author = sc.nextLine();

        System.out.print("Enter book price: ");
        double price = sc.nextDouble();

        // Initially book is available
        boolean availability = true;

        // Creating object using parameterized constructor
        LibraryBookSystem book =
                new LibraryBookSystem(title, author, price, availability);

        System.out.println("\nBook Details:");
        book.displayDetails();

        System.out.println("\nBorrowing the book...");
        book.borrowBook();

        System.out.println("\nUpdated Book Details:");
        book.displayDetails();

        sc.close();
    }
}
