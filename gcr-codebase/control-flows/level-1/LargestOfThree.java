//Writing a Java Code  to check if the first, second, or third number is the largest of the three.
import java.util.Scanner;
public class LargestOfThree {
	public static void main(String args[]) {
		// Create a Scanner Object to take input from user
		Scanner input = new Scanner(System.in);
		int first = input.nextInt();
		int second = input.nextInt();
		int third = input.nextInt();
		
		//Check which is the largest among three and Print the result
		System.out.println(
			"Is the first number the largest? " + ((first>second) && (first > third)) +
			"\nIs the second number the largest? " + ((second > first) && (second > third)) +
			"\nIs the third number the largest? " + ((third > first) && (third > second)));
		input.close(); //Closing the Scanner Object
	}
}

