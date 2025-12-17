// Write a Java Code by taking a, b, and c as input values and print some integer operations
import java.util.Scanner;
public class IntOperation {
    public static void main(String[] args) {
		//Create variable a,b,c to store input values
		int a,b,c;
		
        // Creating Scanner object to take input from user
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();

        // Perform integer operations (operator precedence applies)
        int result1 = a + b * c;   // * has higher precedence than +
        int result2 = a * b + c;   // * evaluated before +
        int result3 = c + a / b;   // / evaluated before +
        int result4 = a % b + c;   // % evaluated before +

        // Print results
        System.out.println(
            "The results of Int Operations are " +
            result1 + ", " + result2 + ", " +
            result3 + ", and " + result4);
		input.close(); //Closing the Scanner Object
    }
}
