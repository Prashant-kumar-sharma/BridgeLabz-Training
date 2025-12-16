import java.util.*;
public class PerimeterOfRectangle
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length and breadth of Rectangle");
		float length=sc.nextFloat();
		float width= sc.nextFloat();
		float Perimeter = 2 * (length + width);
		System.out.println("Perimeter of Rectangle = " + Perimeter);
	}
}