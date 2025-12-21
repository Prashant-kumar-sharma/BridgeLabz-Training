//Writing a Java Code to to Calculate Student Marks, Total, Average & Percentage
import java.util.Scanner;

public class StudentResult {

    // Method to generate random 2-digit PCM marks
    // Columns: 0-Physics, 1-Chemistry, 2-Maths
    public static int[][] generateMarks(int students) {

        int[][] marks = new int[students][3];

        for (int i = 0; i < students; i++) {
            marks[i][0] = 10 + (int)(Math.random() * 90);
            marks[i][1] = 10 + (int)(Math.random() * 90);
            marks[i][2] = 10 + (int)(Math.random() * 90);
        }
        return marks;
    }

    // Method to calculate total, average, and percentage
    // Columns: 0-Total, 1-Average, 2-Percentage
    public static double[][] calculateResults(int[][] marks) {

        double[][] result = new double[marks.length][3];

        for (int i = 0; i < marks.length; i++) {

            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            // Rounding to 2 digits
            average = Math.round(average * 100.0) / 100.0;
            percentage = Math.round(percentage * 100.0) / 100.0;

            result[i][0] = total;
            result[i][1] = average;
            result[i][2] = percentage;
        }
        return result;
    }

    // Method to calculate grade based on percentage
    public static String getGrade(double percentage) {

        if (percentage >= 80) return "A";
        else if (percentage >= 70) return "B";
        else if (percentage >= 60) return "C";
        else if (percentage >= 50) return "D";
        else if (percentage >= 40) return "E";
        else return "R";
    }

    // Method to display scorecard in tabular format
    public static void displayScorecard(int[][] marks, double[][] results) {

        System.out.println("---------------------------------------------------------------");
        System.out.println("Std\tPhy\tChem\tMath\tTotal\tAvg\t%\tGrade");
        System.out.println("---------------------------------------------------------------");

        for (int i = 0; i < marks.length; i++) {
            System.out.println(
                (i + 1) + "\t" +
                marks[i][0] + "\t" +
                marks[i][1] + "\t" +
                marks[i][2] + "\t" +
                results[i][0] + "\t" +
                results[i][1] + "\t" +
                results[i][2] + "\t" +
                getGrade(results[i][2])
            );
        }
    }

    // Main Method
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int students = input.nextInt();

        int[][] marks = generateMarks(students);
        double[][] results = calculateResults(marks);

        displayScorecard(marks, results);

        input.close();
    }
}
