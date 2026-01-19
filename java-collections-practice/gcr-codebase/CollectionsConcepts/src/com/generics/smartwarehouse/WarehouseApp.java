package com.generics.smartwarehouse;

public class WarehouseApp {

    public static void main(String[] args) {

        // Electronics Storage
        Storage<Electronics> electronicsStorage = new Storage<>();
        electronicsStorage.addItem(new Electronics("Bluetooth Speaker", 4200));
        electronicsStorage.addItem(new Electronics("Wireless Headphones", 5800));
        electronicsStorage.addItem(new Electronics("Smart Watch", 12999));

        // Groceries Storage
        Storage<Groceries> groceriesStorage = new Storage<>();
        groceriesStorage.addItem(new Groceries("Wheat Flour", 980));
        groceriesStorage.addItem(new Groceries("Sugar", 55));
        groceriesStorage.addItem(new Groceries("Tea Powder", 430));
        groceriesStorage.addItem(new Groceries("Salt Pack", 28));

        // Furniture Storage
        Storage<Furniture> furnitureStorage = new Storage<>();
        furnitureStorage.addItem(new Furniture("Office Desk", 14500));
        furnitureStorage.addItem(new Furniture("Bookshelf", 8200));
        furnitureStorage.addItem(new Furniture("Sofa Set", 36500));

        System.out.println("===== SMART WAREHOUSE INVENTORY REPORT =====\n");

        System.out.println(">>> Electronics Inventory");
        Storage.displayAllItems(electronicsStorage.getItems());

        System.out.println("\n>>> Groceries Inventory");
        Storage.displayAllItems(groceriesStorage.getItems());

        System.out.println("\n>>> Furniture Inventory");
        Storage.displayAllItems(furnitureStorage.getItems());
    }
}
