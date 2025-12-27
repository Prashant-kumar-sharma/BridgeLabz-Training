package com.constructors.level1;


public class Book {

    // Attributes
    String title;
    String author;
    double price;

    // Default constructor
    public Book() {
        title = "Harry Potter";
        author = "J.K.Rowling";
        price = 1299.99;
    }

    // Parameterized constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display book details
    public void displayDetails() {
        System.out.println("Title  : " + title);
        System.out.println("Author : " + author);
        System.out.println("Price  : " + price);
    }
    public static void main(String[] args) {

        // Default Constructor
        Book book1 = new Book();
        System.out.println("\nDefault Constructor");
        book1.displayDetails();
        
        //Parameterized Constructor
        Book book2 = new Book("Merchant of Venice", "William Shakeshapeare", 134.99);
        System.out.println("\nParametrized Constructor");
        book2.displayDetails();

    }
}

