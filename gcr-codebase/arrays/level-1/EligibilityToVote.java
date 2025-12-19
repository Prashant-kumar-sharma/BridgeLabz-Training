//Writing a Java Code to print if the students are eligibe to vote depending on their ages.
import java.util.Scanner;
public class EligibilityToVote {
    public static void main(String[] args) {
		//Create Scanner object to take input from the user
        Scanner input = new Scanner(System.in);
		System.out.println("Enter the age of Students");
		int[] studentAge = new int[10];
		
		for(int i = 0 ; i < studentAge.length ; i++)
		{
			studentAge[i] = input.nextInt();
		}
		
		//Checking if students are eligible to give vote or not.
		for(int i = 0 ; i < studentAge.length ; i++)
		{
			if(studentAge[i] >= 18) //check if age is greater than 
			{
				System.out.println("The student with the age " + studentAge[i] + " can vote."); 
			}
			else
			{
				System.out.println("The student with the age " + studentAge[i] + " cannot vote."); 
			}
		}
		input.close(); // Closing the Scanner Object.
	}
}