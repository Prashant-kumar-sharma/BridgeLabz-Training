package com.day7.foodloop;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        FoodItem[] menu = {
            new VegItem("Paneer Butter Masala", 250, 5),
            new VegItem("Veg Biryani", 200, 3),
            new NonVegItem("Chicken Biryani", 300, 4),
            new NonVegItem("Fish Fry", 350, 2)
        };

        Order order = new Order();

        System.out.println("🍽️ Welcome to FoodLoop 🍽️");

        boolean ordering = true;
        while (ordering) {

            System.out.println("\nMenu:");
            for (int i = 0; i < menu.length; i++) {
                System.out.println((i + 1) + ". " +
                        menu[i].getName() +
                        " (₹" + menu[i].getPrice() + ")");
            }

            System.out.println("\nChoose an option:");
            System.out.println("1. Add Item");
            System.out.println("2. Place Order");
            System.out.println("3. Cancel Order");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter item number: ");
                    int itemChoice = sc.nextInt();
                    order.addItem(menu[itemChoice - 1]);
                    break;

                case 2:
                    order.placeOrder();
                    ordering = false;
                    break;

                case 3:
                    order.cancelOrder();
                    ordering = false;
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        }

        sc.close();
    }
}
