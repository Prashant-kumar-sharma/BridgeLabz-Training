import java.util.*;
public class PowerCalculation
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a base and an exponent");
		float base=sc.nextFloat();
		float exponent= sc.nextFloat();
		float power =(float)Math.pow(base, exponent);
		System.out.println("Power =  " + power);
	}
}