//Write a program to compare two substrings of equal length.
import java.util.Scanner;
public class CharacterArrayComparison {
    public static char[] getCharacterArray(String str) {
        char[] charArray = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            charArray[i] = str.charAt(i);
        }
        return charArray;
    } 
	public static boolean compareArrays(char[] userDefinedArray, char[] builtInMethod)
	{
		if(userDefinedArray.length != builtInMethod.length)
		{
			return false;
		}
		for(int i=0;i<userDefinedArray.length;i++)
		{
			if (userDefinedArray[i] != builtInMethod[i]) {
                return false;
            }
		}
		return true;
	}
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = input.next();

        char[] userDefinedArray = getCharacterArray(str);
		char[] builtInMethod = str.toCharArray();
		
		if(compareArrays(userDefinedArray, builtInMethod))
		{
			System.out.println("Both the Arrays are same");
		}
		else
		{
			System.out.println("Both the Arrays are not same");
		}
		input.close(); //Closing the Scanner Object.
    }
}
