package com.searching.stringbuilderandstringbuffer;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Input string
		System.out.print("Enter a string: ");
		String input = sc.nextLine();

		// Create StringBuilder object
		StringBuilder sb = new StringBuilder();

		// Append the string
		sb.append(input);

		// Reverse the string
		sb.reverse();

		// Convert back to string
		String reversed = sb.toString();

		// Output result
		System.out.println("Reversed string: " + reversed);

		sc.close();
	}
}
prashant
