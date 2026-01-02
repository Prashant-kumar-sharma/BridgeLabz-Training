package com.day1.ewalletapplication;

class Main {

    public static void main(String[] args) {

        User gautam = new User("Gautam71", "Gautam", new PersonalWallet(1000));

        User prashant = new User("Prashar85211", "Prashant", new BusinessWallet(5000)
        );

        // User actions
        gautam.loadMoney(2000);
        gautam.transferTo(prashant, 1200);

        System.out.println("\n===== WALLET SUMMARY =====\n");

        // Alice summary (balance first, then history)
        System.out.println("User : Gautam (Gautam71)");
        System.out.println("Balance : ₹" + gautam.checkBalance());
        gautam.showTransactions();

        System.out.println();

        // Shop summary
        System.out.println("User : Prashant (Prashar85211)");
        System.out.println("Balance : ₹" + prashant.checkBalance());
        prashant.showTransactions();
    }
}