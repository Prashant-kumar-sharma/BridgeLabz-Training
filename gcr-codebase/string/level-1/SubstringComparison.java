//Write a program to compare two substrings of equal length.
import java.util.Scanner;
public class SubstringComparison {
	//create a SubString
    public static String createSubstring(String str, int startIndex, int endIndex) {
        return str.substring(startIndex, endIndex);
    }
	//compare the String and SubString
    public static boolean CompareStrings (String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first string:");
        String str1 = input.next();
		System.out.print("Enter the start and end index for substring");
		int startIndex = input.nextInt();
		int endIndex = input.nextInt();
		
        String substring = createSubstring(str1, startIndex, endIndex);
        System.out.println("The substring is: " + substring);
		
        // Comparing the two substrings using charAt method
        System.out.println("Is the string and substring equal: " + CompareStrings(str1, substring));
        input.close();  // Closing the Scanner object
    }
}
