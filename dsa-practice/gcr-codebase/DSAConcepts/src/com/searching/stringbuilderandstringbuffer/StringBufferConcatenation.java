package com.searching.stringbuilderandstringbuffer;

import java.util.Scanner;

public class StringBufferConcatenation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();

        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter string " + (i + 1) + ": ");
            sb.append(sc.nextLine());
        }

        System.out.println("Concatenated String: " + sb);
        sc.close();
    }
}
