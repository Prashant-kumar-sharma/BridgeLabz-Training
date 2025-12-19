//Writing a Java Code to count the number of digits in an integer.
import java.util.Scanner;
public class CountDigits {
    public static void main(String[] args) {
		//Create Scanner object to take input from the user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int count = 0;

		//Counting no. of digits
        while (number != 0) {
            number = number / 10; 
            count++;              
        }

        //Display the  result
        System.out.println("Number of digits: " + count);
        input.close(); //Closing Scanner object
    }
}
