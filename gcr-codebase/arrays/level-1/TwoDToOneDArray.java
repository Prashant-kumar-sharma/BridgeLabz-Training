//Write a Java Code to create a 2D Array and Copy the 2D Array into a single dimension array.
import java.util.Scanner;
public class TwoDToOneDArray {
    public static void main(String[] args) {
        // Create Scanner object to store user input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = input.nextInt();
        System.out.print("Enter number of columns: ");
        int columns = input.nextInt();
        int[][] matrix = new int[rows][columns];

        // Take input for 2D array
        System.out.println("Enter elements of the matrix:");
        for (int i = 0; i < rows; i++)
		{
            for (int j = 0; j < columns; j++)
			{
                matrix[i][j] = input.nextInt();
            }
        }

        int[] array = new int[rows * columns];
        int index = 0;
        for (int i = 0; i < rows; i++)
		{
            for (int j = 0; j < columns; j++)
			{
                array[index] = matrix[i][j];
                index++;
            }
        }

        // Display 1D array
        System.out.println("Elements of the 1D array:");
        for (int i = 0; i < array.length; i++)
		{
            System.out.print(array[i] + " ");
        }

        input.close(); //Closing the Scanner Object
    }
}
