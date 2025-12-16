import java.util.*;
public class ConvertCelsiusToFahrenheit
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the temperature in Celsius");
		float Celsius=sc.nextFloat();
		float Fahrenheit= (Celsius * 9/5) + 32;
		System.out.println("Fahrenheit Temperature is " +Fahrenheit);
	}
}