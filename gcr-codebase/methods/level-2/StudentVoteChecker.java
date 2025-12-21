
// Writing a Java Program to check voting eligibility of 10 students
import java.util.Scanner;

public class StudentVoteChecker {

    // Method to check whether a student can vote
    public boolean canStudentVote(int age) {

        // Validate age
        if (age < 0) {
            return false;
        }

        // Check voting eligibility
        if (age >= 18) {
            return true;
        }

        return false;
    }

    // Main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        StudentVoteChecker checker = new StudentVoteChecker();
        int[] ages = new int[10];

        // Take input for 10 students
        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = input.nextInt();

            boolean canVote = checker.canStudentVote(ages[i]);

            if (canVote) {
                System.out.println("Student " + (i + 1) + " is eligible to vote.");
            } else {
                System.out.println("Student " + (i + 1) + " is NOT eligible to vote.");
            }
        }

        input.close();
    }
}
