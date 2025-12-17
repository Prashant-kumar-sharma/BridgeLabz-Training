// Writing Java Code to take distance in kilometres and convert it into miles.
public class ConvertKilometresToMiles {
	public static void main(String args[]) {
		//create variable distanceInKilometres to store distance in kilometres
		double distanceInKilometres = 10.8;
		
		//Create a variable distanceInMiles  
		double distanceInMiles = distanceInKilometres / 1.6;
		
		//Print the distance in miles
		System.out.println("The distance "+distanceInKilometres+" km in miles is "+distanceInMiles);
	}
}