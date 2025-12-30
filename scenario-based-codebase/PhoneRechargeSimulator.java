/*10. Phone Recharge Simulator 📱
Take the user's mobile operator and amount.
● Use a switch to display offers.
● Loop to allow repeated recharges.
● Show balance after each recharge. */ 

import java.util.Scanner;

public class PhoneRechargeSimulator {

    // Display wallet balance
    public static void displayBalance(double balance) {
        System.out.println("----------------------------------------");
        System.out.println("Wallet Balance : Rs. " + balance);
        System.out.println("----------------------------------------");
    }

    // Display plan categories with prompts
    public static void displayCategories() {
        System.out.println("\nSelect Plan Category (type the number):");
        System.out.println("1 - Popular Plans");
        System.out.println("2 - Annual Plans");
        System.out.println("3 - Data-Only Plans");
    }

    // Display plans based on operator and category
    public static void displayPlans(String operator, int category) {

        System.out.println("\nAvailable Plans (type the plan number):");

        switch (operator) {

            case "airtel":
                if (category == 1) {
                    System.out.println("1 - Rs. 265  | 1GB/day  | 28 Days");
                    System.out.println("2 - Rs. 299  | 1.5GB/day| 28 Days");
                } else if (category == 2) {
                    System.out.println("1 - Rs. 839  | 2GB/day  | 84 Days");
                    System.out.println("2 - Rs. 1799 | 2GB/day  | 365 Days");
                } else {
                    System.out.println("1 - Rs. 181  | 30GB Data");
                    System.out.println("2 - Rs. 301  | 50GB Data");
                }
                break;

            case "jio":
                if (category == 1) {
                    System.out.println("1 - Rs. 239  | 1.5GB/day| 28 Days");
                    System.out.println("2 - Rs. 299  | 2GB/day  | 28 Days");
                } else if (category == 2) {
                    System.out.println("1 - Rs. 666  | 1.5GB/day| 84 Days");
                    System.out.println("2 - Rs. 999  | 3GB/day  | 84 Days");
                } else {
                    System.out.println("1 - Rs. 181  | 30GB Data");
                    System.out.println("2 - Rs. 241  | 50GB Data");
                }
                break;

            case "vi":
                if (category == 1) {
                    System.out.println("1 - Rs. 249  | 1.5GB/day| 28 Days");
                    System.out.println("2 - Rs. 299  | 2GB/day  | 28 Days");
                } else if (category == 2) {
                    System.out.println("1 - Rs. 719  | 1.5GB/day| 84 Days");
                    System.out.println("2 - Rs. 1449 | 2GB/day  | 180 Days");
                } else {
                    System.out.println("1 - Rs. 199  | 25GB Data");
                    System.out.println("2 - Rs. 299  | 50GB Data");
                }
                break;
        }
    }

    // Get plan amount
    public static double getPlanAmount(String operator, int category, int plan) {

        if (operator.equals("airtel")) {
            if (category == 1) return (plan == 1) ? 265 : 299;
            if (category == 2) return (plan == 1) ? 839 : 1799;
            return (plan == 1) ? 181 : 301;
        }

        if (operator.equals("jio")) {
            if (category == 1) return (plan == 1) ? 239 : 299;
            if (category == 2) return (plan == 1) ? 666 : 999;
            return (plan == 1) ? 181 : 241;
        }

        if (operator.equals("vi")) {
            if (category == 1) return (plan == 1) ? 249 : 299;
            if (category == 2) return (plan == 1) ? 719 : 1449;
            return (plan == 1) ? 199 : 299;
        }

        return -1;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double walletBalance = 1500.0;

        // App header (printed directly)
        System.out.println("========================================");
        System.out.println("        MOBILE RECHARGE APPLICATION");
        System.out.println("========================================");

        displayBalance(walletBalance);

        while (true) {

            System.out.println("\nEnter Mobile Operator (type exactly):");
            System.out.println("airtel  - for Airtel");
            System.out.println("jio     - for Jio");
            System.out.println("vi      - for Vi");
            System.out.print("Your input: ");

            String operator = scanner.next().trim().toLowerCase();

            if (!(operator.equals("airtel") || operator.equals("jio") || operator.equals("vi"))) {
                System.out.println("Invalid operator input. Please type airtel, jio, or vi.");
                continue;
            }

            displayCategories();
            System.out.print("Enter category number: ");
            int category = scanner.nextInt();

            if (category < 1 || category > 3) {
                System.out.println("Invalid category selection.");
                continue;
            }

            displayPlans(operator, category);
            System.out.print("Enter plan number: ");
            int planChoice = scanner.nextInt();

            double planAmount = getPlanAmount(operator, category, planChoice);

            if (planAmount <= 0) {
                System.out.println("Invalid plan selection.");
                continue;
            }

            if (planAmount > walletBalance) {
                System.out.println("Insufficient wallet balance.");
                continue;
            }

            walletBalance -= planAmount;

            System.out.println("\nRecharge successful.");
            System.out.println("Amount Deducted : Rs. " + planAmount);
            displayBalance(walletBalance);

            System.out.println("\nWhat would you like to do next?");
            System.out.println("Type 'yes'  - Recharge again");
            System.out.println("Type 'exit' - Exit application");
            System.out.print("Your choice: ");

            String choice = scanner.next().toLowerCase();

            if (choice.equals("exit")) {
                System.out.println("\nThank you for using the Recharge Application.");
                System.out.println("Final Wallet Balance : Rs. " + walletBalance);
                break;
            }
        }

        scanner.close();
    }
}
