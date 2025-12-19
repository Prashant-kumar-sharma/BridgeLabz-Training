// Writing a Java Code  to find the multiplication table of a number entered by the user from 6 to 9 and display the result
import java.util.Scanner;
public class MultiplicationTableFromSixToNine {
    public static void main(String[] args) {
		//Create Scanner object to take input from the user
        Scanner input = new Scanner(System.in);
		System.out.println("Enter a number from 6 to 9 ");
        int number = input.nextInt();
        int[] multiplicationResult = new int[10];
		int index = 0;
		
        // Calculating multiplication table 
        for (int i = 1; i <= 10; i++)
		{
            multiplicationResult[index] = number * i;
            index++;
        }

        // Display the result
        index = 0;
        for (int i = 1; i <= 10; i++)
		{
            System.out.println(number + " * " + i + " = " + multiplicationResult[index]);
            index++;
        }
        input.close(); //Closing the Scanner Object
    }
}
