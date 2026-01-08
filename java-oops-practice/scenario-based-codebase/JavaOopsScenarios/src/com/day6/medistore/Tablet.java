package com.day6.medistore;

import java.time.LocalDate;

public class Tablet extends Medicine {

    public Tablet(String name, double price, LocalDate expiryDate, int quantity) {
        super(name, price, expiryDate, quantity);
    }

    @Override
    public boolean checkExpiry() {
        return LocalDate.now().isBefore(expiryDate);
    }

    @Override
    public boolean sell(int qty) {

        if (!checkExpiry()) {
            System.out.println(" Tablet expired!");
            return false;
        }

        if (!reduceStock(qty)) {
            System.out.println(" Insufficient stock!");
            return false;
        }

        System.out.println(" Sold Tablets | Bill: Rs. " + calculateTotal(qty));
        return true;
    }
}
