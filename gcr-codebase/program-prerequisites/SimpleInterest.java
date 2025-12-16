import java.util.*;
public class SimpleInterest
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Principal, rate of Interest and time");
		float Principal=sc.nextFloat();
		float Rate= sc.nextFloat();
		float Time= sc.nextFloat();
		float Interest= (Principal * Rate * Time) / 100;
		System.out.println("Simple Interest = " + Interest);
	}
}