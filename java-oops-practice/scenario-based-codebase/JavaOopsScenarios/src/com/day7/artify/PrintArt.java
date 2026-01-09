package com.day7.artify;

public class PrintArt extends Artwork {

    public PrintArt(String title, String artist, double price) {
        super(title, artist, price, "Print");
        licensingTerms = "Single Print Use Only";
    }

    @Override
    public void purchase(User user) {
        System.out.println("Purchasing Print Art: " + title);
        if (deductFromWallet(user, price)) {
            System.out.println("Print art purchased");
        }
    }

    @Override
    public void license(User user) {
        System.out.println("Licensing not available for Print Art");
    }
}
