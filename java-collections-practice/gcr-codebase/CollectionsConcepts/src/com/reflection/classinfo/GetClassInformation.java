package com.reflection.classinfo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Scanner;

public class GetClassInformation {
    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {

            System.out.print("Enter fully qualified class name: ");
            String className = input.nextLine();

            Class<?> clazz = Class.forName(className);

            System.out.println("\n--- Fields ---");
            for (Field field : clazz.getDeclaredFields()) {
                System.out.println(field.getType().getSimpleName() + " " + field.getName());
            }

            System.out.println("\n--- Methods ---");
            for (Method method : clazz.getDeclaredMethods()) {
                System.out.println(
                    method.getReturnType().getSimpleName() + " " +
                    method.getName() +
                    Arrays.toString(method.getParameterTypes())
                );
            }

            System.out.println("\n--- Constructors ---");
            for (Constructor<?> constructor : clazz.getDeclaredConstructors()) {
                System.out.println(
                    constructor.getName() +
                    Arrays.toString(constructor.getParameterTypes())
                );
            }

        } catch (ClassNotFoundException e) {
            System.out.println("Class not found.");
        }
    }
}
