package com.company;

import java.util.Scanner;

public class FormatToLowercase {
    private static String getString(){
        Scanner input = new Scanner(System.in);
        System.out.println("Write the string: ");
        return input.nextLine();
    }

    static void printString(){
        System.out.println("The string is: " + getString().toLowerCase());
    }
}
