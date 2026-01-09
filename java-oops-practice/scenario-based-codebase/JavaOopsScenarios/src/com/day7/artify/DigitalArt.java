package com.day7.artify;

public class DigitalArt extends Artwork {

    public DigitalArt(String title, String artist, double price) {
        super(title, artist, price, "Digital");
        licensingTerms = "Personal & Commercial Use";
    }

    @Override
    public void purchase(User user) {
    	System.out.println("Purchasing Digital Art for " + user.getName() + ": " + title);
        if (deductFromWallet(user, price)) {
        	System.out.println(user.getName() + " successfully licensed the artwork");
        }
    }

    @Override
    public void license(User user) {
        double licenseFee = price * 0.5;
        System.out.println("Licensing Digital Art: " + title);
        if (deductFromWallet(user, licenseFee)) {
            System.out.println("License granted (" + licensingTerms + ")");
        }
    }
}
