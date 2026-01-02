package com.day1.universitycourseenrollmentsystem;

class Main {

    public static void main(String[] args) {

        Student ug = new Undergraduate(101, "Amit", 7.5);
        Student pg = new Postgraduate(102, "Riya", 4.0);

        Course course = new Course("CS101", "Data Structures");

        Enrollment enrollment = new Enrollment();
        Faculty faculty = new Faculty("Dr. Sharma");

        enrollment.enroll(ug, course);
        faculty.evaluateStudent(ug, 8.5);
        ug.printTranscript();

        System.out.println();

        enrollment.enroll(pg, course);
        faculty.evaluateStudent(pg, 9.0);
        pg.printTranscript();
    }
}