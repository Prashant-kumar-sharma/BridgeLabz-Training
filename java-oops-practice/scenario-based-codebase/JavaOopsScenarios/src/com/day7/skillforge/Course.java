package com.day7.skillforge;

public class Course {

    private String title;
    private Instructor instructor;
    private double rating;
    private String[] modules;
    private String level;

    public Course(String title, Instructor instructor, String level, String[] modules) {
        this.title = title;
        this.instructor = instructor;
        this.level = level;
        this.modules = modules;
        this.rating = 4.5;
    }

    public Course(String title, Instructor instructor, String level) {
        this(title, instructor, level,
             new String[]{"Introduction", "Basics", "Advanced Topics"});
    }

    protected void updateRating(double newRating) {
        rating = (rating + newRating) / 2;
    }

    public double getRating() {
        return rating;
    }

    public String getTitle() {
        return title;
    }

    public int getTotalModules() {
        return modules.length;
    }

    public String getLevel() {
        return level;
    }

    public Instructor getInstructor() {
        return instructor;
    }
}
