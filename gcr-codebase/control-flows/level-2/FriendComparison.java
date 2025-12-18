//Write a Java code to find the youngest friends among 3 friends based on their ages and the tallest among the friends based on their heights
import java.util.Scanner;
public class FriendComparison {
    public static void main(String[] args) {
        //Create Scanner object to take input from user
        Scanner input = new Scanner(System.in);

        //Taking age inputs of Amar, Akbar and Anthony
        System.out.print("Enter Amar, Akbar and Anthony age: ");
        int amarAge = input.nextInt();
        int akbarAge = input.nextInt();
        int anthonyAge = input.nextInt();

        //Taking height inputs of Amar, Akbar and Anthony
        System.out.print("Enter Amar, Akbar and Anthony height (in cm): ");
        int amarHeight = input.nextInt();
        int akbarHeight = input.nextInt();
        int anthonyHeight = input.nextInt();

        //Finding the Youngest Friend
        if (amarAge <= akbarAge && amarAge <= anthonyAge)
		{
            System.out.println("Amar is the youngest friend.");
        } 
        else if (akbarAge <= amarAge && akbarAge <= anthonyAge)
		{
            System.out.println("Akbar is the youngest friend.");
        } 
        else
		{
            System.out.println("Anthony is the youngest friend.");
        }

        //Finding the Tallest Friend 
        if (amarHeight >= akbarHeight && amarHeight >= anthonyHeight)
		{
            System.out.println("Amar is the tallest friend.");
        } 
        else if (akbarHeight >= amarHeight && akbarHeight >= anthonyHeight)
		{
            System.out.println("Akbar is the tallest friend.");
        } 
        else
		{
            System.out.println("Anthony is the tallest friend.");
        }
        input.close(); //Closing Scanner object
    }
}
