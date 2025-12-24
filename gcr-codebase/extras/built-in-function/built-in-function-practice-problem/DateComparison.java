//Writing a Java program to compare two dates using methods from java.time package.
import java.time.LocalDate;
import java.util.Scanner;

public class DateComparison {

    // Method to compare two dates
    public static void compareDates(LocalDate date1, LocalDate date2) {

        if (date1.isBefore(date2)) {
            System.out.println("First date is BEFORE the second date");
        } else if (date1.isAfter(date2)) {
            System.out.println("First date is AFTER the second date");
        } else if (date1.isEqual(date2)) {
            System.out.println("Both dates are the SAME");
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first date (yyyy-MM-dd): ");
        LocalDate firstDate = LocalDate.parse(scanner.nextLine());

        System.out.print("Enter second date (yyyy-MM-dd): ");
        LocalDate secondDate = LocalDate.parse(scanner.nextLine());

        // Calling the method
        compareDates(firstDate, secondDate);
        scanner.close();  // Closing the Scanner Object
    }
}
