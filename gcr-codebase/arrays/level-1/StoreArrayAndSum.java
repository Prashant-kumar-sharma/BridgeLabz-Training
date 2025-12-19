//Writing a Java Code to store 10 numbers and displauy each number and the sum of all numbers.
import java.util.Scanner;
public class StoreArrayAndSum {
    public static void main(String[] args) {
		//Create Scanner object to take input from the user
        Scanner input = new Scanner(System.in);
		System.out.println("Enter numbers");
        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;

        while (true)
		{
            double value = input.nextDouble(); 
            if (value <= 0)
			{
                break;
            }
            if (value == 10)
			{
                break;
            }
            numbers[index] = value;
            index++;
        }

        // Display numbers and calculate total sum
        for (int i = 0; i < index; i++)
		{
            System.out.println(numbers[i]);
            total = total + numbers[i];
        }

        // Display total sum
        System.out.println("Total = " + total);

        input.close(); //Closing the Scanner Object
    }
}
