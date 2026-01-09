package com.day7.foodloop;

import java.util.ArrayList;
import java.util.List;

public class Order implements IOrderable {

    private List<FoodItem> items = new ArrayList<>();
    private double total;

    // Add item to order
    public void addItem(FoodItem item) {
        if (item.isAvailable() && item.reduceStock()) {
            items.add(item);
            total += item.getPrice();
            System.out.println(item.getName() + " added to order");
        } else {
            System.out.println(item.getName() + " is out of stock");
        }
    }

    // Discount logic (polymorphic behavior by total)
    private double applyDiscount() {
        if (total >= 1000)
            return total * 0.20;
        else if (total >= 500)
            return total * 0.10;
        else
            return 0;
    }

    @Override
    public void placeOrder() {
        double discount = applyDiscount();
        double finalAmount = total - discount;

        System.out.println("\nOrder Placed Successfully!");
        System.out.println("Total Amount : ₹" + total);
        System.out.println("Discount     : ₹" + discount);
        System.out.println("Payable      : ₹" + finalAmount);
    }

    @Override
    public void cancelOrder() {
        items.clear();
        total = 0;
        System.out.println("❌ Order Cancelled");
    }
}
