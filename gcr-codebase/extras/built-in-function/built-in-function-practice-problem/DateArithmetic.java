// Writing a Java program that performs date arithmetic using built-in date handling classes.
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

class DateArithmetic {

    // Method to parse input date
    public static LocalDate parseDate(String input) {
        DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE;
        return LocalDate.parse(input, formatter);
    }

    // Method to perform date arithmetic
    public static LocalDate performDateArithmetic(LocalDate date) {
        return date.plusDays(7)
                   .plusMonths(1)
                   .plusYears(2)
                   .minusWeeks(3);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a date (yyyy-MM-dd): ");
        String input = scanner.nextLine().trim();

        try {
            LocalDate date = parseDate(input);
            System.out.println("Input date: " + date);

            LocalDate finalDate = performDateArithmetic(date);
            System.out.println("Final date after calculations: " + finalDate);

        } catch (DateTimeParseException e) {
            System.out.println("Invalid date format. Please use yyyy-MM-dd");
        } finally {
            scanner.close(); // Closing the Scanner Object
        }
    }
}
