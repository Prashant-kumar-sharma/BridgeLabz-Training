/* 19. "Artify – Digital Art Marketplace"
Story: Artists sell digital art via Artify. Buyers can purchase, license, or subscribe to collections.
Requirements:
● Artwork class: title, artist, price, licenseType.
● User class: name, walletBalance.
● Interface IPurchasable with purchase() and license() methods.
● Encapsulation: licensing terms are protected. 
● Use constructors to initialize artworks with or without previews.
● Operators: deduct wallet balance on purchase.
● Inheritance: DigitalArt, PrintArt from Artwork.
● Polymorphism: licensing varies across art types.
 */

package com.day7.artify;

public abstract class Artwork implements IPurchasable {

    protected String title;
    protected String artist;
    protected double price;
    protected String licenseType;

    // Licensing terms protected (encapsulation)
    protected String licensingTerms;

    // Constructor without preview
    public Artwork(String title, String artist, double price, String licenseType) {
        this.title = title;
        this.artist = artist;
        this.price = price;
        this.licenseType = licenseType;
        this.licensingTerms = "Standard License";
    }

    // Constructor with preview (optional)
    public Artwork(String title, String artist, double price,
                   String licenseType, String preview) {
        this(title, artist, price, licenseType);
    }

    protected boolean deductFromWallet(User user, double amount) {
        if (user.getWalletBalance() >= amount) {
            user.deduct(amount);
            return true;
        }
        System.out.println("Insufficient wallet balance");
        return false;
    }
}
