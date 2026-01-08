package com.day6.medistore;

import java.time.LocalDate;

public class Injection extends Medicine {

    public Injection(String name, double price, LocalDate expiryDate, int quantity) {
        super(name, price, expiryDate, quantity);
    }

    @Override
    public boolean checkExpiry() {
        // Injections expire slightly earlier
        return LocalDate.now().isBefore(expiryDate.minusDays(15));
    }

    @Override
    public boolean sell(int qty) {

        if (!checkExpiry()) {
            System.out.println(" Injection expired!");
            return false;
        }

        if (!reduceStock(qty)) {
            System.out.println(" Insufficient stock!");
            return false;
        }

        System.out.println(" Sold Injection | Bill: Rs. " + calculateTotal(qty));
        return true;
    }
}
