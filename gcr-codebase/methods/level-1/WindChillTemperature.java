//Writing a Java Code to calculate the wind chill temperature given the temperature and wind speed
import java.util.Scanner;
public class WindChillTemperature {
	//method to calculate wind chill temperature
	public double calculateWindChill(double temperature, double windSpeed)
	{
		double windChill = 35.74 + 0.6215*temperature + (0.4275*temperature - 35.75) * Math.pow(windSpeed, 0.16);
		
		return windChill;
	}
    public static void main(String[] args) {
        // Creating Scanner object to take input from user
        Scanner input = new Scanner(System.in);
		System.out.print("Enter the temperature and wind speed : ");
		double temperature = input.nextDouble();
		double windSpeed = input.nextDouble();

		//Creating an object to access the non-static method calculateWindChill
		WindChillTemperature windChillTemperature =new WindChillTemperature();
		
		//Calling the method
		double windChillTemp = windChillTemperature.calculateWindChill(temperature, windSpeed);
		
		//Display the results
        System.out.println("The Wind Chill Temperature : " + windChillTemp);
			
		input.close(); //Closing the Scanner Object
    }
}
