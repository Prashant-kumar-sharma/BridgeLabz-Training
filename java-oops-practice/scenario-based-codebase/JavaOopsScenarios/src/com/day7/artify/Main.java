package com.day7.artify;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        User user = new User("Amit", 5000);

        Artwork[] gallery = {
            new DigitalArt("Sunset Bliss", "Ravi", 2000),
            new PrintArt("Monochrome City", "Neha", 1500)
        };

        System.out.println("Welcome to Artify, " + user.getName());
        user.showWallet();

        System.out.println("\nAvailable Artworks:");
        for (int i = 0; i < gallery.length; i++) {
            System.out.println((i + 1) + ". " + gallery[i].title +
                    " by " + gallery[i].artist);
        }

        System.out.print("\nChoose artwork: ");
        int choice = sc.nextInt();

        System.out.println("1. Purchase");
        System.out.println("2. License");
        int action = sc.nextInt();

        Artwork selected = gallery[choice - 1];

        if (action == 1) {
            selected.purchase(user);
        } else {
            selected.license(user);
        }

        user.showWallet();
        sc.close();
    }
}
