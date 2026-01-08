package com.day6.medistore;

import java.time.LocalDate;

public class Syrup extends Medicine {

    public Syrup(String name, double price, LocalDate expiryDate) {
        super(name, price, expiryDate);
    }

    @Override
    public boolean checkExpiry() {
        // Syrups expire earlier (liquid sensitivity)
        return LocalDate.now().isBefore(expiryDate.minusDays(30));
    }

    @Override
    public boolean sell(int qty) {

        if (!checkExpiry()) {
            System.out.println(" Syrup expired!");
            return false;
        }

        if (!reduceStock(qty)) {
            System.out.println(" Insufficient stock!");
            return false;
        }

        System.out.println(" Sold Syrup | Bill: Rs. " + calculateTotal(qty));
        return true;
    }
}
