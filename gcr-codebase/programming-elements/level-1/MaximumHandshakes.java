//Writing a Java Code to find the maximum number of handshakes among N number of students.
import java.util.Scanner;
public class MaximumHandshakes {
	public static void main(String args[]) {
		//Create variable numberOfStudents and numberOfHandshakes
		int numberOfStudents, numberOfHandshakes;
		
		// Creating Scanner object to take input from user
		Scanner input = new Scanner(System.in);
		numberOfStudents = input.nextInt();
		
		//Calculating maximum no. of handshakes among students and printing the result
		numberOfHandshakes = (numberOfStudents*(numberOfStudents-1))/2;
		System.out.println("The number of possible handshakes are " + numberOfHandshakes);
		input.close(); //Closing the Scanner object
	}
}
