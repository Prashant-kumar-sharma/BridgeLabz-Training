
// Writing a Java Program to check whether a given Year is a Leap Year or not
import java.util.Scanner;

public class LeapYearCheck {

    // Method to check Leap Year using given conditions
    public static boolean isLeapYear(int year) {

        // Condition a: year must be >= 1582
        if (year < 1582) {
            return false;
        }

        // Condition b: Leap year rules
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        }

        return false;
    }

    // Main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = input.nextInt();

        if (year < 1582) {
            System.out.println("Leap Year check is valid only for year >= 1582 (Gregorian calendar).");
        } else if (isLeapYear(year)) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is not a Leap Year.");
        }

        input.close(); // Closing the Scanner Object
    }
}
