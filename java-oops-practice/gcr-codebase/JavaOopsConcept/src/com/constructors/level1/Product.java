package com.constructors.level1;

public class Product {

    // Instance variables (unique for each object)
    String productName;
    double price;

    // Class variable (shared among all objects)
    static int totalProducts = 0;

    // Parameterized constructor
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;   // increment when a new product is created
    }

    // Instance method
    public void displayProductDetails() {
        System.out.println("Product Name : " + productName);
        System.out.println("Price        : " + price);
    }

    // Class method
    public static void displayTotalProducts() {
        System.out.println("Total Products Created: " + totalProducts);
    }

    // Main method for testing
    public static void main(String[] args) {

        Product p1 = new Product("Laptop", 55000);
        Product p2 = new Product("Mobile", 25000);

        System.out.println("Product 1 Details:");
        p1.displayProductDetails();

        System.out.println("\nProduct 2 Details:");
        p2.displayProductDetails();

        System.out.println();
        Product.displayTotalProducts();
    }
}
