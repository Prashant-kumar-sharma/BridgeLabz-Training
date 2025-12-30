/*13. Sandeep’s Fitness Challenge Tracker 🏋️
♂Each day Sandeep completes a number of push-ups.
● Store counts for a week.
● Use for-each to calculate total and average.
● Use continue to skip rest days. */

import java.util.Scanner;

public class FitnessChallengeTracker {

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        int[] pushUps = new int[7];

        System.out.println("==============================================");
        System.out.println("       SANDEEP'S FITNESS CHALLENGE TRACKER     ");
        System.out.println("==============================================");
        System.out.println("Enter daily push-up count for 7 days.");
        System.out.println("Enter 0 if it was a rest day.");
        System.out.println("----------------------------------------------");

        // get inputs for each day push ups count
        for (int i = 0; i < pushUps.length; i++) {
            System.out.print("Day " + (i + 1) + " push-ups: ");
            pushUps[i] = input.nextInt();
        }

        int totalPushUps = 0;
        int activeDays = 0;

        // Calculate total and average using for-each
        for (int count : pushUps) {

            if (count == 0) {
                continue; // Skip rest days
            }

            totalPushUps += count;
            activeDays++;
        }

		//Calculate average stepcount and excluding the inactive days
        double average = (activeDays > 0)
                ? (double) totalPushUps / activeDays
                : 0.0;

        // Output summary
        System.out.println("\n-------------- Weekly Summary ----------------");
        System.out.println("Total Push-Ups Performed : " + totalPushUps);
        System.out.println("Active Workout Days     : " + activeDays);
        System.out.printf("Average Push-Ups/Day    : %.2f%n", average);
        System.out.println("----------------------------------------------");
        System.out.println("Keep pushing your limits. Stay consistent!");
        System.out.println("==============================================");

        input.close();
    }
}
