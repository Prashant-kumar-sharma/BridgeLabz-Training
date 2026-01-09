package com.day7.artify;

public class User {

    private String name;
    private double walletBalance;

    public User(String name, double walletBalance) {
        this.name = name;
        this.walletBalance = walletBalance;
    }

    public String getName() {
        return name;
    }

    public double getWalletBalance() {
        return walletBalance;
    }

    protected void deduct(double amount) {
        walletBalance -= amount;
    }

    public void showWallet() {
        System.out.println(name + "'s Wallet Balance: Rs. " + walletBalance);
    }
}
