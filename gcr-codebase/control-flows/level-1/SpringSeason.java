//Writing a Java Code that takes two int values month and day and gives “Its a Spring Season” otherwise prints “Not a Spring Season”. 
public class SpringSeason {
	public static void main(String args[]) {
		int month = Integer.parseInt(args[0]);
		int day = Integer.parseInt(args[1]);
		
		//Check if the Month resides between the spring season.
		boolean isSpring = 
				(month == 3 && day >= 20) ||
				(month == 4) ||
				(month == 5) ||
				(month == 6 && day <= 20);
		
		//Display the result
		if(isSpring)
			System.out.println("Its a Spring Season");
		else
			System.out.println("Not a Spring Season");
	}
}