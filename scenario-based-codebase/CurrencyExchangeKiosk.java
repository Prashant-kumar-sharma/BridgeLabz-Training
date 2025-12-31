/*18. Currency Exchange Kiosk 💱
Design a currency converter:
● Take INR amount and target currency.
● Use a switch to apply the correct rate.
● Ask if the user wants another conversion (do-while). */

import java.util.Scanner;

public class CurrencyExchangeKiosk {

    // Display currency exchange table
    public static void showCurrencies(String[][] currencyTable) {
        System.out.println("--------------------------------------");
        System.out.println("        INR EXCHANGE RATES");
        System.out.println("--------------------------------------");

        for (int i = 0; i < currencyTable.length; i++) {
            System.out.printf(
                    "%-3d. 1 INR = %-6s %s%n",
                    (i + 1),
                    currencyTable[i][1],
                    currencyTable[i][0]
            );
        }
        System.out.println("--------------------------------------");
    }

    // Currency conversion logic using switch
    public static double convertCurrency(String currencyCode, double amount) {

        switch (currencyCode) {
            case "USD":
                return amount * 0.0120;
            case "EUR":
                return amount * 0.0110;
            case "GBP":
                return amount * 0.0094;
            case "JPY":
                return amount * 1.78;
            case "AUD":
                return amount * 0.0180;
            case "CAD":
                return amount * 0.0160;
            case "CHF":
                return amount * 0.0105;
            case "CNY":
                return amount * 0.0860;
            case "SGD":
                return amount * 0.0162;
            default:
                return -1; // invalid currency
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        char choice;

        // INR to other currencies (2D array)
        String[][] currencyTable = {
                {"USD - US Dollar", "0.0120"},
                {"EUR - Euro", "0.0110"},
                {"GBP - British Pound", "0.0094"},
                {"JPY - Japanese Yen", "1.78"},
                {"AUD - Australian Dollar", "0.0180"},
                {"CAD - Canadian Dollar", "0.0160"},
                {"CHF - Swiss Franc", "0.0105"},
                {"CNY - Chinese Yuan", "0.0860"},
                {"SGD - Singapore Dollar", "0.0162"}
        };

        System.out.println("============================================");
        System.out.println("        CURRENCY EXCHANGE KIOSK");
        System.out.println("============================================");

        do {
            System.out.print("Enter amount in INR: ");
            double amount = input.nextDouble();

            showCurrencies(currencyTable);

            System.out.print("Enter currency code (USD/EUR/GBP/...): ");
            String currencyCode = input.next().trim().toUpperCase();

            double convertedAmount = convertCurrency(currencyCode, amount);

            if (convertedAmount == -1) {
                System.out.println("Invalid currency selection!");
            } else {
                System.out.printf(
                        "Converted Amount: %.2f %s%n",
                        convertedAmount,
                        currencyCode
                );
            }

            System.out.print("Do you want another conversion? (y/n): ");
            choice = input.next().toLowerCase().charAt(0);

            System.out.println();

        } while (choice == 'y');

        System.out.println("Thank you for using Currency Exchange Kiosk!");
        input.close();
    }
}
