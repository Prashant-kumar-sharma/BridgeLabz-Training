package com.constructors.level1;

public class Course {

    // Instance variables
    String courseName;
    int duration;     // in months
    double fee;

    // Class variable (common for all courses)
    static String instituteName = "ABC Institute";

    // Parameterized constructor
    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance method
    public void displayCourseDetails() {
        System.out.println("Institute Name : " + instituteName);
        System.out.println("Course Name    : " + courseName);
        System.out.println("Duration       : " + duration + " months");
        System.out.println("Fee            : " + fee);
    }

    // Class method
    public static void updateInstituteName(String newInstituteName) {
        instituteName = newInstituteName;
    }

    // Main method
    public static void main(String[] args) {

        // Updating institute name using class method
        Course.updateInstituteName("Tech Learning Academy");

        // Creating course objects
        Course c1 = new Course("Java Programming", 6, 25000);
        Course c2 = new Course("Data Science", 8, 45000);

        // Displaying course details
        System.out.println("Course 1 Details:");
        c1.displayCourseDetails();

        System.out.println("\nCourse 2 Details:");
        c2.displayCourseDetails();
    }
}
