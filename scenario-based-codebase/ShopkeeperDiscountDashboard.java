/*8. Shopkeeper’s Discount Dashboard 🛍️
A shopkeeper gives discounts based on total bill:
● Input item prices in a for-loop.
● Use if-else for discount logic.
● Use proper indentation, constants, and comments.
*/
import java.util.Scanner;

public class ShopkeeperDiscountDashboard {

    // Discount constants 
    static final double DISCOUNT_FIVE_PERCENT  = 0.05;
    static final double DISCOUNT_TEN_PERCENT   = 0.10;
    static final double DISCOUNT_FIFTEEN_PERCENT = 0.15;

    // Method to calculate total bill amount
    public static double calculateTotalBillAmount(Scanner scanner, int totalItems) {
        double totalBillAmount = 0.0;

        for (int itemIndex = 1; itemIndex <= totalItems; itemIndex++) {
            System.out.print("Enter price of item " + itemIndex + ": ");
            double itemPrice = scanner.nextDouble();
            totalBillAmount += itemPrice;
        }

        return totalBillAmount;
    }

    // Method to determine discount rate based on total bill
    public static double determineDiscountRate(double totalBillAmount) {
        if (totalBillAmount >= 5000) {
            return DISCOUNT_FIFTEEN_PERCENT;
        } else if (totalBillAmount >= 3000) {
            return DISCOUNT_TEN_PERCENT;
        } else if (totalBillAmount >= 1000) {
            return DISCOUNT_FIVE_PERCENT;
        } else {
            return 0.0;
        }
    }

    // Method to display the final bill summary
    public static void displayBillSummary(int totalItems, double totalBillAmount, double discountRate, double finalPayableAmount) {

        double discountAmount = totalBillAmount * discountRate;

        System.out.println("\n----------------------------------------");
        System.out.println("BILL SUMMARY");
        System.out.println("----------------------------------------");
        System.out.println("Total Items           : " + totalItems);
        System.out.println("Total Bill Amount     : Rs. " + totalBillAmount);
        System.out.println("Discount Applied      : " + (discountRate * 100) + "%");
        System.out.println("Discount Amount       : Rs. " + discountAmount);
        System.out.println("Final Payable Amount  : Rs. " + finalPayableAmount);
        System.out.println("----------------------------------------");
        System.out.println("Thank you for shopping with us!");
        System.out.println("----------------------------------------");
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("========================================");
        System.out.println("        SHOPKEEPER DISCOUNT SYSTEM");
        System.out.println("========================================");

        System.out.print("Enter number of items purchased: ");
        int totalItems = scanner.nextInt();

        // Calculate total bill amount
        double totalBillAmount = calculateTotalBillAmount(scanner, totalItems);

        // Determine discount rate
        double discountRate = determineDiscountRate(totalBillAmount);

        // Calculate final payable amount
        double finalPayableAmount = totalBillAmount - (totalBillAmount * discountRate);

        // Display bill summary
        displayBillSummary(totalItems, totalBillAmount, discountRate, finalPayableAmount);

        scanner.close(); // Prevent resource leakage
    }
}
