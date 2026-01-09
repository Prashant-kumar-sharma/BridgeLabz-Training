package com.day7.foodloop;

public abstract class FoodItem {

    protected String name;
    protected String category;
    protected double price;
    private int stock; // encapsulated

    public FoodItem(String name, String category, double price, int stock) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.stock = stock;
    }

    public boolean isAvailable() {
        return stock > 0;
    }

    protected boolean reduceStock() {
        if (stock > 0) {
            stock--;
            return true;
        }
        return false;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
