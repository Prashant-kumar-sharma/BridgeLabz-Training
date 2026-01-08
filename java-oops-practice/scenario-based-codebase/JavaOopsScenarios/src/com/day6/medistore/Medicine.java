package com.day6.medistore;

import java.time.LocalDate;

public abstract class Medicine implements ISellable {

    protected String name;
    protected double price;
    protected LocalDate expiryDate;
    private int quantity;   // encapsulated

    // Constructor with quantity
    public Medicine(String name, double price, LocalDate expiryDate, int quantity) {
        this.name = name;
        this.price = price;
        this.expiryDate = expiryDate;
        this.quantity = quantity;
    }

    // Constructor with default quantity
    public Medicine(String name, double price, LocalDate expiryDate) {
        this(name, price, expiryDate, 50);
    }

    // Only Medicine can modify stock
    protected boolean reduceStock(int qty) {
        if (qty <= quantity) {
            quantity -= qty;
            return true;
        }
        return false;
    }

    public int getQuantity() {
        return quantity;
    }

    // Sensitive pricing logic hidden
    protected double calculateTotal(int qty) {
        double total = price * qty;

        // 5% discount for bulk purchase
        if (qty > 10) {
            total -= total * 0.05;
        }
        return total;
    }
}

