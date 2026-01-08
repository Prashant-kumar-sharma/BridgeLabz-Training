package com.searching.linearsearchandbinarysearch;

import java.util.Arrays;
import java.util.Scanner;

public class LinearAndBinarySearchChallenge {

    // -------- LINEAR SEARCH PART --------
    // Find first missing positive integer
    public static int findFirstMissingPositive(int[] arr) {

        int n = arr.length;
        boolean[] visited = new boolean[n + 1];

        // Mark visited positive numbers
        for (int num : arr) {
            if (num > 0 && num <= n) {
                visited[num] = true;
            }
        }

        // Find first missing positive
        for (int i = 1; i <= n; i++) {
            if (!visited[i]) {
                return i;
            }
        }

        return n + 1;
    }

    // -------- BINARY SEARCH PART --------
    // Find index of target after sorting
    public static int binarySearch(int[] arr, int target) {

        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == target)
                return mid;
            else if (arr[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }

        return -1;
    }

    // -------- MAIN METHOD --------
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Linear Search result
        int missing = findFirstMissingPositive(arr);
        System.out.println("First missing positive integer: " + missing);

        // Binary Search target
        System.out.print("Enter target value to search: ");
        int target = sc.nextInt();

        // Sort array before binary search
        Arrays.sort(arr);

        int index = binarySearch(arr, target);

        if (index != -1) {
            System.out.println("Target found at index (after sorting): " + index);
        } else {
            System.out.println("Target not found (index = -1)");
        }

        sc.close();
    }
}
