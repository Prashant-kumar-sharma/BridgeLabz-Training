package com.day1.hospitalpatientmanagementsystem;

class Main {

    public static void main(String[] args) {

        Patient p1 = new InPatient(101, "Prashant", 21, 5);
        Patient p2 = new OutPatient(102, "Gautam", 12,  10);
        Patient p3 = new InPatient(103, "Ayush", 21,  "Diabetes, Hypertension", 10);

        Doctor d1 = new Doctor("Dr. Prashant Sharma", "Cardiology");
        Bill bill = new Bill(20000, 0.10, 2000);

        System.out.println("\n" + p1.getSummary());
        p1.displayInfo();

        System.out.println("\n" + p2.getSummary());
        p2.displayInfo();
        
        System.out.println("\n" + p3.getSummary());
        p3.displayInfo();

        d1.displayInfo();

        System.out.println("Final Bill Amount: ₹" + bill.calculatePayment());
    }
}