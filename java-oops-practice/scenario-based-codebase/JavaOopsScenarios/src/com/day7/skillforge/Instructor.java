package com.day7.skillforge;

public class Instructor extends User {

    public Instructor(String name, String email) {
        super(name, email);
    }

    public void uploadCourse(Course course) {
        System.out.println("📚 Course uploaded by " + name + ": " + course.getTitle());
    }
}
