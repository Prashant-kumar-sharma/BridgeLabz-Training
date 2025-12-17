// Writing a Java Code to calculate the volume of earth
public class VolumeOfEarth {
	public static void main(String args[]) {
		//Create variable radius ancd pi to store radius of earth and value of pi;
		int radius = 6378;
		double pi = 22.0/7.0;
		
		//Creating variable volumeInCubicKilometres and volumeInCubicMiles to store volume of earth in cubic kilometres and cubic miles
		double volumeInCubicKilometres = (double) 4.0/3.0*pi*Math.pow(radius,3);
		double volumeInCubicMiles = volumeInCubicKilometres/4.168;
		
		//Print the Result
		System.out.println("The volume of earth in cubic kilometers is " + volumeInCubicKilometres + " and cubic miles is " + volumeInCubicMiles);
	}
}
