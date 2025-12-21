//Writing a Java Code to Transpose a Matrix
import java.util.Random;

public class MatrixOperations {

    // Method to create a random matrix
    public static double[][] createRandomMatrix(int rows, int cols) {
        double[][] matrix = new double[rows][cols];
        Random rand = new Random();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = rand.nextInt(10) + 1; // values 1 to 10
            }
        }
        return matrix;
    }

    // Method to find transpose of a matrix
    public static double[][] transposeMatrix(double[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        double[][] transpose = new double[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        return transpose;
    }

    // Method to find determinant of 2x2 matrix
    public static double findDeterminant(double[][] matrix) {
        return (matrix[0][0] * matrix[1][1]) -
               (matrix[0][1] * matrix[1][0]);
    }

    // Method to find inverse of 2x2 matrix
    public static double[][] findInverse(double[][] matrix) {
        double det = findDeterminant(matrix);

        if (det == 0) {
            System.out.println("Inverse does not exist (Determinant = 0)");
            return null;
        }

        double[][] inverse = new double[2][2];
        inverse[0][0] =  matrix[1][1] / det;
        inverse[0][1] = -matrix[0][1] / det;
        inverse[1][0] = -matrix[1][0] / det;
        inverse[1][1] =  matrix[0][0] / det;

        return inverse;
    }

    // Method to display matrix
    public static void displayMatrix(double[][] matrix) {
        if (matrix == null) return;

        for (double[] row : matrix) {
            for (double value : row) {
                System.out.printf("%8.2f", value);
            }
            System.out.println();
        }
    }

    // Main method
    public static void main(String[] args) {

        // Creating a random 2x2 matrix
        double[][] matrix = createRandomMatrix(2, 2);

        System.out.println("Original Matrix:");
        displayMatrix(matrix);

        System.out.println("\nTranspose Matrix:");
        double[][] transpose = transposeMatrix(matrix);
        displayMatrix(transpose);

        double det = findDeterminant(matrix);
        System.out.println("\nDeterminant: " + det);

        System.out.println("\nInverse Matrix:");
        double[][] inverse = findInverse(matrix);
        displayMatrix(inverse);
    }
}
