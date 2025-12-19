//Writing a Java code to check if the given number is a prime number or not
import java.util.Scanner;
public class PrimeNumberCheck {
    public static void main(String[] args) {
		//Create Scanner object to take input from the user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        boolean isPrime = true;

        //Prime check only for numbers greater than 1
        if (num <= 1) {
            isPrime = false;
        } else {
            // Check divisibility from 2 to num-1
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break; // number is divisible, not prime
                }
            }
        }

        //Display Result
        if (isPrime) {
            System.out.println(num + " is a Prime Number");
        } else {
            System.out.println(num + " is NOT a Prime Number");
        }

        input.close();
    }
}
