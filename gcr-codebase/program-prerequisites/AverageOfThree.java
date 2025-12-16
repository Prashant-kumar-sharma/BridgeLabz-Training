import java.util.*;
public class AverageOfThree
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter three numbers");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();
		float average= (num1+num2+num3)/3;
		System.out.println("Average of 3 Numbers = " + average);
	}
}