//Writing a Java Code to find the maximum number of handshakes among students.
import java.util.Scanner;
public class Handshakes {
	//calculateNumberOfHandshakes to 
	public static int calculateNumberOfHandshakes(int numberOfStudents)
	{
		//Calculating Number Of Handshakes
		int maxHandshakes = numberOfStudents *(numberOfStudents-1)/2;
		return maxHandshakes;
	}
    public static void main(String[] args) {
        // Create Scanner object to take user input
        Scanner input = new Scanner(System.in);
		System.out.print("Enter Number of Students : ");
		int numberOfStudents = input.nextInt();
		
		//Calling the calculateHandshakes method
		int maxHandshakes = calculateNumberOfHandshakes(numberOfStudents);
		
		//Display the results
		System.out.println("Number of Possible Handshakes are : "+ maxHandshakes);
		
		input.close(); //Closing the Scanner Object
	}
}