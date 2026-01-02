package com.day1.hospitalpatientmanagementsystem;


/* 1. Hospital Patient Management System
Scenario: A hospital wants a software module to register patients, assign doctors, and maintain billing.

Concepts Used:
● Class: Patient, Doctor, Bill
● Constructor: Overloaded for emergency vs. normal patient admission
● Access Modifiers: Keep sensitive data like medicalHistory as private, expose getSummary() via public
● Interface: Payable with method calculatePayment() implemented in Bill
● Operators: Used to compute discounts, taxes, totals

● OOP:
	○ Encapsulation: Private fields with getter/setters
	○ Abstraction: Hide billing calculation behind interface
	○ Inheritance: InPatient, OutPatient extend Patient
	○ Polymorphism : displayInfo() overridden for Doctor, Patient, etc.
 */


abstract class Patient {

    private int patientId;
    private String name;
    private int age;
    private String medicalHistory; //sensitive data so kept private

    //constructor for Normal admission
    public Patient(int patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    //Constructor for Emergency admission
    public Patient(int patientId, String name, int age,  String medicalHistory) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.medicalHistory = medicalHistory;
    }

    //Exposing getSummary() with public
    public String getSummary() {
        String historyStatus =
                (medicalHistory == null) ? "Not Provided" : "Available (Secured)";
        return " Patient ID: " + patientId +
               "\n Name: " + name +
       		   "\n Age: " + age +
               "\n Medical History: " + historyStatus;
    }

    public abstract void displayInfo();
}