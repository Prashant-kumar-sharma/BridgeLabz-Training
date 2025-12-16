import java.util.*;
public class AreaOfCircle
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the radius of circle");
		float radius=sc.nextFloat();
		float area=(float)22*radius*radius/7;
		System.out.println("Area of Circle " +area);
	}
}