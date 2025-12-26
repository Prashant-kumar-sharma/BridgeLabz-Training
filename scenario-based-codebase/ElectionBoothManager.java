//Writing a Java Code to Manage an Election Booth
import java.util.Scanner;

public class ElectionBoothManager {

    // Method to record vote
    public static void recordVote(int age, Scanner scanner, int[] votes) {

        if (age >= 18) {
            System.out.println("Eligible to vote");
            System.out.print("Vote for candidate (1 / 2 / 3): ");
            int choice = scanner.nextInt();

            if (choice >= 1 && choice <= 3) {
                votes[choice - 1]++;
            } else {
                System.out.println("Invalid vote");
            }

        } else {
            System.out.println("Not eligible to vote");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] votes = new int[3]; // index 0->C1, 1->C2, 2->C3

        while (true) {
            System.out.print("Enter age (Enter -1 to exit): ");
            int age = scanner.nextInt();

            // Exit condition
            if (age == -1) {
                break;
            }

            // Call method
            recordVote(age, scanner, votes);
        }

        // Final result
        System.out.println("Voting Closed");
        System.out.println("Candidate 1 Votes: " + votes[0]);
        System.out.println("Candidate 2 Votes: " + votes[1]);
        System.out.println("Candidate 3 Votes: " + votes[2]);

        scanner.close();
    }
}
