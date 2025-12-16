import java.util.*;
public class VolumeOfCylinder
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius and height of Cylinder");
		float radius=sc.nextFloat();
		float height= sc.nextFloat();
		float Volume= radius*radius*height*22/7;
		System.out.println("Volume of Cylinder  " + Volume);
	}
}