/*15. Rohan’s Library Reminder App 📚
Rohan wants a fine calculator:
● Input return date and due date.
● If returned late, calculate fine: ₹5/day.
● Repeat for 5 books using for-loop. */


import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class RohansLibraryReminderApp {

    // Constant fine per day
    private static final int FINE_PER_DAY = 5;

    // Displays application header
    public static void showHeader() {
        System.out.println("=========================================");
        System.out.println("        ROHAN'S LIBRARY REMINDER");
        System.out.println("   Track Book Returns & Calculate Fine");
        System.out.println("=========================================");
        System.out.println("Date Format : dd-MM-yyyy");
        System.out.println("Fine Rule   : Rs. 5 per late day\n");
    }

    // Calculates fine based on due date and return date
    public static int calculateFine(LocalDate dueDate, LocalDate returnDate) {
        if (returnDate.isAfter(dueDate)) {
            long lateDays = ChronoUnit.DAYS.between(dueDate, returnDate);
            return (int) lateDays * FINE_PER_DAY;
        }
        return 0;
    }

    // Displays status for each book
    public static void showBookStatus(int bookNumber, int fine) {
        System.out.println("-----------------------------------------");
        System.out.println("Book #" + bookNumber + " Summary");
        System.out.println("-----------------------------------------");

        if (fine > 0) {
            System.out.println("Return Status : Late");
            System.out.println("Fine Charged  : Rs. " + fine);
        } else {
            System.out.println("Return Status : On Time");
            System.out.println("Fine Charged  : Rs. 0");
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        int totalFine = 0;

        showHeader();

        for (int book = 1; book <= 5; book++) {

            System.out.print("Enter due date for Book " + book + " (dd-MM-yyyy): ");
            LocalDate dueDate = LocalDate.parse(input.next(), formatter);

            System.out.print("Enter return date for Book " + book + " (dd-MM-yyyy): ");
            LocalDate returnDate = LocalDate.parse(input.next(), formatter);

            int fine = calculateFine(dueDate, returnDate);
            totalFine += fine;

            showBookStatus(book, fine);
        }

        System.out.println("\n=========================================");
        System.out.println(" FINAL SUMMARY ");
        System.out.println("=========================================");
        System.out.println("Total Fine Payable: ₹" + totalFine);
        System.out.println("=========================================");

        input.close();
    }
}
