/* 9. School Bus Attendance System 🚍
Track 10 students' presence.
● Use for-each loop on names.
● Ask "Present or Absent?"
● Print total present and absent counts. */

import java.util.Scanner;

public class SchoolBusAttendanceSystem {

    static final int TOTAL_STUDENTS = 10;

    // Method to display individual student attendance
    public static void displayStudentStatus(String[] studentNames, String[] attendanceStatus) {
        System.out.println("\n----------------------------------------");
        System.out.println("STUDENT ATTENDANCE STATUS");
        System.out.println("----------------------------------------");

        int index = 0;
        for (String studentName : studentNames) {
            System.out.println(studentName + " : " + attendanceStatus[index]);
            index++;
        }
    }

    // Method to calculate attendance counts
    public static int[] calculateAttendance(String[] attendanceStatus) {
        int presentCount = 0;
        int absentCount = 0;

        for (String status : attendanceStatus) {
            if (status.equalsIgnoreCase("present")) {
                presentCount++;
            } else {
                absentCount++;
            }
        }

        return new int[] { presentCount, absentCount };
    }

    // Method to display attendance summary
    public static void displayAttendanceSummary(int presentCount, int absentCount) {
        System.out.println("\n========================================");
        System.out.println("        ATTENDANCE SUMMARY REPORT");
        System.out.println("========================================");
        System.out.println("Total Students on Route : " + TOTAL_STUDENTS);
        System.out.println("Students Present       : " + presentCount);
        System.out.println("Students Absent        : " + absentCount);
        System.out.println("========================================");

        if (absentCount > 0) {
            System.out.println("Action Required: Inform school office about absentees.");
        } else {
            System.out.println("All students present. Bus ready to depart.");
        }

        System.out.println("========================================");
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
		System.out.println("========================================");
        System.out.println("        SCHOOL BUS ATTENDANCE SYSTEM");
        System.out.println("========================================");
        System.out.println("Attendance must be recorded before bus departure.");
        System.out.println("Enter Present or Absent for each student.");
        System.out.println("========================================\n");

        String[] studentNames = {
            "Amit", "Riya", "Karan", "Neha", "Rahul",
            "Sneha", "Arjun", "Pooja", "Vikram", "Ananya"
        };

        String[] attendanceStatus = new String[TOTAL_STUDENTS];
        int index = 0;
        for (String studentName : studentNames) {
            System.out.print("Student: " + studentName + " | Status (Present/Absent): ");
            String status = scanner.next().trim().toLowerCase();

            if (!status.equals("present") && !status.equals("absent")) {
                System.out.println("Invalid input. Marked as Absent by default.");
                status = "absent";
            }
			
            attendanceStatus[index++] = status;
            System.out.println("Status Recorded.\n");
        }

        // Display student-wise status first
        displayStudentStatus(studentNames, attendanceStatus);

        // Calculate totals
        int[] attendanceResult = calculateAttendance(attendanceStatus);

        // Display final summary
        displayAttendanceSummary(attendanceResult[0], attendanceResult[1]);

        scanner.close(); // Prevent resource leakage
    }
}
