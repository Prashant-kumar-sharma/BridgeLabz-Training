//Writing a Java Code  to check if a number is an Abundant Number.
import java.util.Scanner;
public class AbundantNumber {
    public static void main(String[] args) {
		//Create Scanner object to take input from the user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int sum = 0;

        //Calculating the sum of divisors
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum = sum + i;
            }
        }

        // Checking if its a Abundant Number or not
        if (sum > number) {
            System.out.println(number + " is an Abundant Number");
        } else {
            System.out.println(number + " is NOT an Abundant Number");
        }

        input.close(); //Closing the Scanner Object
    }
}
