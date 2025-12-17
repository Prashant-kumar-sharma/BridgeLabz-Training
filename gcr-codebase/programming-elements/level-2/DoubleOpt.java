//Write a Java Code by taking a, b, and c as input values and print some integer operations
import java.util.Scanner;
public class DoubleOpt {
    public static void main(String[] args) {
		//Create variable a,b,c to store input values
		double a,b,c;
        
		//Creating Scanner object to take input from user
        Scanner input = new Scanner(System.in);
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();

        // Perform double operations (operator precedence applies)
        double result1 = a + b * c;   // * has higher precedence than +
        double result2 = a * b + c;   // * evaluated before +
        double result3 = c + a / b;   // / evaluated before +
        double result4 = a % b + c;   // % evaluated before +

        // Print results
        System.out.println(
            "The results of Double Operations are " +
            result1 + ", " + result2 + ", " +
            result3 + ", and " + result4);
		input.close(); //Closing the Scanner Object
    }
}
