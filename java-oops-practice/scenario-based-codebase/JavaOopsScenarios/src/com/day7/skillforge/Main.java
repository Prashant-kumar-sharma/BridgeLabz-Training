package com.day7.skillforge;

public class Main {

	public static void main(String[] args) {

		// Instructor
		Instructor instructor = new Instructor("Anand", "anand@skillforge.com");

		// Course with default modules
		Course course = new Course("Java Fundamentals", instructor, "Beginner");

		instructor.uploadCourse(course);

		// Student
		Student student = new Student("Adarsh", "adarsh@gmail.com");

		System.out.println("\nStudent enrolling in course: " + course.getTitle());
        System.out.println("Instructor: " + instructor.getName());

		// Progress tracking
		student.completeModule();
		student.completeModule();
		student.completeModule();


		// Certificate generation (polymorphism)
		student.generateCertificate(course);

		// Read-only rating access
		System.out.println("\nCourse Rating: " + course.getRating());
	}
}
