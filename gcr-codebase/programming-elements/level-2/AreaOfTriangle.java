//Writing a Java Code  that takes the base and height in cm to find the area of a triangle in square inches and square centimeters 
import java.util.Scanner;
public class AreaOfTriangle {
	public static void main(String args[]) {
		//create variable base and height to store base and height of triangle
		double base, height;
		
		// Creating Scanner object to take input from user
		Scanner input = new Scanner(System.in);
		base = input.nextDouble();
		height = input.nextDouble();
		
		//calculating area of triangle in square centimetres and square inches
		double areaInSquareCentimetres = 1.0/2.0*base*height;
		double areaInSquareInches = areaInSquareCentimetres/6.452;
		
		//Printing the results
		System.out.println("The Area of the triangle in sq in is " + areaInSquareInches + " and sq cm is " + areaInSquareCentimetres);
		input.close(); //Closing the Scanner Object
	}
}
