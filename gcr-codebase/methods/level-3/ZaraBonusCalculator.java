//Writing a Java Program to Calculate Zara Company Employee Bonus 
public class ZaraBonusCalculator {

    // Method to generate salary and years of service
    // Column 0 → Salary, Column 1 → Years of Service
    public static double[][] generateEmployeeData(int employees) {

        double[][] data = new double[employees][2];

        for (int i = 0; i < employees; i++) {
            // Generate 5-digit salary (10000–99999)
            data[i][0] = 10000 + Math.random() * 90000;

            // Generate years of service (1–10)
            data[i][1] = 1 + (int)(Math.random() * 10);
        }
        return data;
    }

    // Method to calculate bonus and new salary
    // Column 0 → Old Salary, Column 1 → Bonus, Column 2 → New Salary
    public static double[][] calculateBonus(double[][] data) {

        double[][] result = new double[data.length][3];

        for (int i = 0; i < data.length; i++) {

            double salary = data[i][0];
            double years = data[i][1];
            double bonus;

            if (years > 5) {
                bonus = salary * 0.05; // 5% bonus
            } else {
                bonus = salary * 0.02; // 2% bonus
            }

            result[i][0] = salary;
            result[i][1] = bonus;
            result[i][2] = salary + bonus;
        }
        return result;
    }

    // Method to calculate totals and display output
    public static void displayResults(double[][] oldData, double[][] newData) {

        double totalOldSalary = 0;
        double totalBonus = 0;
        double totalNewSalary = 0;

        System.out.println("---------------------------------------------------------------");
        System.out.println("Emp\tYears\tOld Salary\tBonus\t\tNew Salary");
        System.out.println("---------------------------------------------------------------");

        for (int i = 0; i < oldData.length; i++) {

            totalOldSalary += newData[i][0];
            totalBonus += newData[i][1];
            totalNewSalary += newData[i][2];

            System.out.printf(
                "%d\t%.0f\t%.2f\t%.2f\t%.2f%n",
                (i + 1),
                oldData[i][1],
                newData[i][0],
                newData[i][1],
                newData[i][2]
            );
        }

        System.out.println("---------------------------------------------------------------");
        System.out.printf("TOTAL\t\t%.2f\t%.2f\t%.2f%n",
                totalOldSalary, totalBonus, totalNewSalary);
    }

    // Main Method
    public static void main(String[] args) {

        int employees = 10;

        double[][] employeeData = generateEmployeeData(employees);
        double[][] salaryDetails = calculateBonus(employeeData);

        displayResults(employeeData, salaryDetails);
    }
}
