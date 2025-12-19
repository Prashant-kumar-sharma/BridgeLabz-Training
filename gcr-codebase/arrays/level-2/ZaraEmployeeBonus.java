//Writing a Java code  to find the bonus of 10 employees based on their years of service and the total bonus amount the company Zara has to pay, along with the old and new salary.
import java.util.Scanner;
public class ZaraEmployeeBonus {
    public static void main(String[] args) {
        // Create Scanner object to store user input
        Scanner sc = new Scanner(System.in);
        int employeeCount = 10;
        double[] salary = new double[employeeCount];
        double[] yearsOfService = new double[employeeCount];

        double[] bonus = new double[employeeCount];
        double[] newSalary = new double[employeeCount];
        double totalBonus = 0.0;
        double totalOldSalary = 0.0;
        double totalNewSalary = 0.0;

        // Loop to take salary and years of service for 10 employees
        for (int i = 0; i < employeeCount; i++) {

            System.out.println("Enter details for Employee " + (i + 1));

            System.out.print("Salary: ");
            double sal = sc.nextDouble();

            System.out.print("Years of Service: ");
            double yrs = sc.nextDouble();

            // Checking if the input is valid or not
            if (sal <= 0 || yrs < 0) {
                System.out.println("Invalid input! Please enter valid salary and years.");
                i--; 
                continue;
            }
            salary[i] = sal;
            yearsOfService[i] = yrs;
        }

        //Calculating bonus, new salary, and totals
        for (int i = 0; i < employeeCount; i++) {

            // Calculating bonus based on years of service
            if (yearsOfService[i] > 5) {
                bonus[i] = salary[i] * 0.05;   
            } else {
                bonus[i] = salary[i] * 0.02;   
            }
			
            newSalary[i] = salary[i] + bonus[i];
            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        // Display the results
        System.out.println("\n----- Zara Bonus Summary -----");
        System.out.println("Total Old Salary = " + totalOldSalary);
        System.out.println("Total Bonus Paid = " + totalBonus);
        System.out.println("Total New Salary = " + totalNewSalary);

        sc.close(); // Closing the Scanner Object 
    }
}
