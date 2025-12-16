import java.util.*;
public class ConvertKilometresToMiles
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the distance in kilometres");
		float Kilometers=sc.nextFloat();
		double Miles =(double)( 0.621371 * Kilometers);
		System.out.println("Miles = " + Miles);
	}
}