package com.company.Strings;

import java.util.Scanner;

public class CountingCharacter {
    private static String getString(){
        Scanner input = new Scanner(System.in);
        System.out.println("Write the string: ");
        return input.nextLine();
    }

    private static char getChar(){
        Scanner input = new Scanner(System.in);
        System.out.println("Write the character to search in the string: ");
        return input.next(".").charAt(0);
    }

    public static void printChar(){
        String string = getString();
        char letter = getChar();
        int count = 0;
        for(int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == letter) {
                count++;
            }
        }
        System.out.println("There are " + count + " '" + letter + "' on the text");
    }
}
