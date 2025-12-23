/* Write a program to find and return the length of a string without using the length() method 
Hint => 
Take user input using the Scanner next() method 

Create a method to find and return a string's length without using the built-in length() method. 

The logic for this is to use the infinite loop to count each character till the charAt() method 
throws a runtime exception, handles the exception, and then return the count

The main function calls the user-defined method as well as the built-in length() method and displays the result
 
*/
//Writing a Java Program to find and return the length of a string without using the length() method 
import java.util.Scanner;

public class StringLengthWithoutMethod {

    // User-defined method to find length without using length()
    public static int findLength(String text) {
        int count = 0;

        try {
            // Infinite loop
            while (true) {
                text.charAt(count); // will throw exception at end
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // Exception handled when index exceeds string length
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input using Scanner next()
        System.out.print("Enter a string: ");
        String input = sc.next();

        // Calling user-defined method
        int customLength = findLength(input);

        // Calling built-in length() method
        int builtInLength = input.length();

        // Displaying results
        System.out.println("Length without using length(): " + customLength);
        System.out.println("Length using length(): " + builtInLength);

        sc.close();
    }
}
