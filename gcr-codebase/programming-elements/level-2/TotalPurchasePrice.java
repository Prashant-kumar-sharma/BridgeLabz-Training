//Writing a Java Code  to input the unit price of an item and the quantity to be bought. Then, calculate the total price.
import java.util.Scanner;
public class TotalPurchasePrice {
    public static void main(String[] args) {
		// Create Scanner object to take input from user
        Scanner input = new Scanner(System.in);
        int unitPrice = input.nextInt();
        int quantity = input.nextInt();

        // Calculate total price
        int totalPrice = unitPrice * quantity;

        // Display the result
        System.out.println(
            "The total purchase price is INR " + totalPrice +
            " if the quantity " + quantity +
            " and unit price is INR " + unitPrice);
		input.close(); //Closing the Scanner Object
    }
}
