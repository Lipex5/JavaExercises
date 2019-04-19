package com.company.Strings;

import java.util.Scanner;

public class ComparingStrings {
    private static String getString1(){
        Scanner input = new Scanner(System.in);
        System.out.println("Input the first string to compare");
        return input.nextLine();
    }

    private static String getString2(){
        Scanner input = new Scanner(System.in);
        System.out.println("Input the second string to compare");
        return input.nextLine();
    }

    public static void compareStrings(){
        if(getString1().equals(getString2())) {
            System.out.println("The strings are equal");
        }
        else {
            System.out.println("The strings are different");
        }
    }
}
