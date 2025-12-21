//Writing a Java Code that takes two int values month and day and gives “Its a Spring Season” otherwise prints “Not a Spring Season”. 
public class SpringSeason {
	//
	public static boolean checkForSpring(int month, int day)
	{
		//Check if the Month resides between the spring season.
		boolean isSpring = 
				(month == 3 && day >= 20) ||
				(month == 4) ||
				(month == 5) ||
				(month == 6 && day <= 20);
		return isSpring;
	}
	public static void main(String args[]) {
		int month = Integer.parseInt(args[0]);
		int day = Integer.parseInt(args[1]);
		
		boolean isSpring = checkForSpring(month, day);
		
		//Display the result
			System.out.println("Is it a Spring Season : " + isSpring);
	}
}