package com.constructors.level1;

import java.util.Scanner;

public class Person {

    // Attributes
    String name;
    int age;

    // Parameterized constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    public Person(Person other) {
        this.name = other.name;
        this.age = other.age;
    }

    // Method to display details
    public void displayDetails() {
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input in main
        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        // Creating original object
        Person p1 = new Person(name, age);

        // Creating a copy using copy constructor
        Person p2 = new Person(p1);

        System.out.println("\nOriginal Constructor Person:");
        p1.displayDetails();

        System.out.println("\nCopied Constructor Person:");
        p2.displayDetails();

        sc.close();
    }
}

