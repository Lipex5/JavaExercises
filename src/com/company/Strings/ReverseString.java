package com.company.Strings;

import java.util.Scanner;

public class ReverseString {
    private static String getString() {
        System.out.println("Write a string to reverse:");

        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

    public static void printString() {
        String string = getString();
        String finalString = new StringBuffer(string).reverse().toString();
        System.out.println(finalString);
    }
}

