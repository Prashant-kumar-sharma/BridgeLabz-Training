package com.searching.stringbuilderandstringbuffer;

import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicatesStringBuilder {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        StringBuilder result = new StringBuilder();
        HashSet<Character> set = new HashSet<>();

        for (char ch : input.toCharArray()) {
            if (!set.contains(ch)) {
                set.add(ch);
                result.append(ch);
            }
        }

        System.out.println("String without duplicates: " + result);
        sc.close();
    }
}
