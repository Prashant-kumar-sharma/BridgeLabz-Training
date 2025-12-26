import java.util.Scanner;

public class MetroSmartCard {

    // Method to calculate fare using ternary operator
    public static int calculateFare(int distance) {
        return (distance <= 5) ? 10 : 20;
    }

    // Method to deduct fare and return updated balance
    public static double deductFare(double balance, int fare) {

        if (balance >= fare) {
            System.out.println("Fare deducted: ₹" + fare);
            return balance - fare;
        } else {
            System.out.println("Insufficient balance");
            return balance;
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double balance = 100;

        while (balance > 0) {

            System.out.println("Current Balance: ₹" + balance);
            System.out.print("Enter distance in km (Enter -1 to quit): ");
            int distance = scanner.nextInt();

            // Exit condition
            if (distance == -1) {
                break;
            }

            int fare = calculateFare(distance);
            balance = deductFare(balance, fare);

            System.out.println();
        }

        System.out.println("Journey Ended");
        System.out.println("Final Balance: ₹" + balance);

        scanner.close();
    }
}
