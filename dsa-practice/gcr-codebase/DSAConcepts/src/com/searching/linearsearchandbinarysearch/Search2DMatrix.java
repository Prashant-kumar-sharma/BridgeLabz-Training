package com.searching.linearsearchandbinarysearch;

import java.util.Scanner;

public class Search2DMatrix {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input matrix size
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        // Input matrix elements
        System.out.println("Enter matrix elements (row-wise sorted):");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Input target value
        System.out.print("Enter target value to search: ");
        int target = sc.nextInt();

        // Binary search on flattened matrix
        int left = 0;
        int right = rows * cols - 1;
        boolean found = false;

        while (left <= right) {

            int mid = (left + right) / 2;
            int row = mid / cols;
            int col = mid % cols;

            if (matrix[row][col] == target) {
                found = true;
                break;
            } else if (matrix[row][col] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        // Output result
        if (found) {
            System.out.println("Result: true (Target found)");
        } else {
            System.out.println("Result: false (Target not found)");
        }

        sc.close();
    }
}
