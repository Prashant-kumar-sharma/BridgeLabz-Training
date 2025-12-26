//Writing a Java Code to Generate Student Results Based on Marks                                                    1`
import java.util.Scanner;

public class RajResultGenerator {

    // Method to calculate average
    public static double calculateAverage(int[] marks) {
        int sum = 0;

        for (int i = 0; i < marks.length; i++) {
            sum += marks[i];
        }

        return sum / 5.0;
    }

    // Method to assign grade using switch
    public static char assignGrade(double average) {

        int gradeCategory = (int) average / 10;

        switch (gradeCategory) {
            case 10:
            case 9:
                return 'A';
            case 8:
                return 'B';
            case 7:
                return 'C';
            case 6:
                return 'D';
            default:
                return 'F';
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] marks = new int[5];

        // Input marks using for-loop
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }

        double average = calculateAverage(marks);
        char grade = assignGrade(average);

        System.out.println("\nAverage Marks: " + average);
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}
