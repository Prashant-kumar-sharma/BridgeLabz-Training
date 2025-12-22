//Writing a Java program to compare two strings
import java.util.Scanner;
public class CompareStrings {
	//Checks if the strings are same or not.
	public static boolean compareTwoStrings(String str1, String str2) {
		if(str1.length() != str2.length())
		{
			return false ;
		}
		for(int i=0;i<str1.length();i++)
		{
			if(str1.charAt(i) != str2.charAt(i))
			{
				return false ;
			}
		}
		return true ;
	}
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter two strings:");
        String str1=input.next();
		String str2 = input.next();
        
		//By Using charAt() 
		boolean  charAtResult = compareTwoStrings(str1, str2);
		System.out.println("Are both the Strings same : " + charAtResult);
		
		//By using equals methods
		boolean equalsResult = str1.equals(str2);
		System.out.println("Are both the Strings same : " + equalsResult);

		//Check whether both results are same or not
		if(charAtResult == equalsResult) {
			System.out.println("Both methods give same result.");
		} else {
			System.out.println("Both methods give different result.");
		}
        input.close(); //Closing the Scanner Object
    }
}