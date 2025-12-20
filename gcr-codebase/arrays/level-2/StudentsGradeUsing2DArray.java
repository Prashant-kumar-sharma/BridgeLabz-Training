//Writing a Java Code to calculate percentage and grade of 2D array
import java.util.Scanner;
public class StudentsGradeUsing2DArray {
    public static void main(String[] args) {
        // Create Scanner object to take user input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of students:");
        int students = input.nextInt();
        int[][] marks = new int[students][3];
        double[] percentage = new double[students];
        char[] grade = new char[students];

        for (int i = 0; i < students; i++)
		{
            System.out.println("Enter marks for student " + (i + 1));
            System.out.print("Physics: ");
            marks[i][0] = input.nextInt();
            System.out.print("Chemistry: ");
            marks[i][1] = input.nextInt();
            System.out.print("Maths: ");
            marks[i][2] = input.nextInt();

            //Checking for Valid Marks
            if (marks[i][0] < 0 || marks[i][1] < 0 || marks[i][2] < 0) 
			{
                System.err.println("Invalid marks. Please enter positive values.");
                i--; 
            }
        }

        //Calculating percentage and grade
        for (int i = 0; i < students; i++) {

            int total = marks[i][0] + marks[i][1] + marks[i][2];
            percentage[i] = total / 3.0;

            //Determining grade based on percentage
            if (percentage[i] >= 80)
			{
                grade[i] = 'A';
            }
			else if (percentage[i] >= 70)
			{
                grade[i] = 'B';
            }
			else if (percentage[i] >= 60)
			{
                grade[i] = 'C';
            }
			else if (percentage[i] >= 50)
			{
                grade[i] = 'D';
            }
			else if (percentage[i] >= 40)
			{
                grade[i] = 'E';
            }
			else
			{
                grade[i] = 'R';
            }
        }

        //Displaying the result
        System.out.println("\nStudent Report:");
        for (int i = 0; i < students; i++)
		{
            System.out.println(
                "Student " + (i + 1) +
                " | Physics: " + marks[i][0] +
                " | Chemistry: " + marks[i][1] +
                " | Maths: " + marks[i][2] +
                " | Percentage: " + percentage[i] +
                " | Grade: " + grade[i]);
        }
		input.close() //Closing the Scanner Object
    }
}
