package com.day6.medistore;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Medicine[] inventory = {
            new Tablet("Paracetamol", 2.5, LocalDate.of(2026, 5, 20), 100),
            new Syrup("Cough Syrup", 85, LocalDate.of(2025, 12, 10)),
            new Injection("Insulin", 450, LocalDate.of(2025, 8, 15), 30)
        };

        System.out.println(" Welcome to MediStore ");

        for (int i = 0; i < inventory.length; i++) {
            System.out.println((i + 1) + ". " +
                    inventory[i].name +
                    " | Stock: " + inventory[i].getQuantity());
        }

        System.out.print("\nChoose medicine number: ");
        int choice = sc.nextInt();

        System.out.print("Enter quantity to buy: ");
        int qty = sc.nextInt();

        inventory[choice - 1].sell(qty);

        sc.close();
    }
}
