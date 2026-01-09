package com.day7.skillforge;

public class Student extends User implements ICertifiable {

    private int completedModules;

    public Student(String name, String email) {
        super(name, email);
        this.completedModules = 0;
    }

    // Progress tracking using operators
    public void completeModule() {
        completedModules++;
    }

    public boolean hasCompletedCourse(Course course) {
        return completedModules >= course.getTotalModules();
    }

    @Override
    public void generateCertificate(Course course) {
        if (hasCompletedCourse(course)) {
            System.out.println("\n🎓 CERTIFICATE 🎓");
            System.out.println("This certifies that " + name);
            System.out.println("has successfully completed the course:");
            System.out.println(course.getTitle());
            System.out.println("Instructor: " + course.getInstructor().getName());
            System.out.println("Level: " + course.getLevel());
        } else {
            System.out.println("❌ Course not completed. Certificate not generated.");
        }
    }
}
