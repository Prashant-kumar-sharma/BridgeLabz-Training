package com.searching.filereaderandinputstreamreader;

import java.io.*;

public class ReadFileLineByLine {
    public static void main(String[] args) {
        // Specify the file path
        String filePath = "C:\\Users\\Vikash Kumar\\Desktop\\BridgeLabz-Training\\dsa-practice\\gcr-codebase\\DSAConcepts\\src\\com\\searching\\stringbuilderandstringbuffer\\ReverseString.java"; // Replace with your file path

        // Create FileReader and BufferedReader objects
        try (FileReader fileReader = new FileReader(filePath);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {

            String line;

            // Read each line and print it
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            // Handle exceptions (e.g., file not found, I/O errors)
            System.err.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}