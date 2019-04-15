package com.company;

import java.util.Scanner;

class GetCharacter {

    private static String getString() {
        System.out.println("Write a string:");

        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

    private static int getIndex() {

        System.out.println("Write the position of the character you want to get");

        Scanner input = new Scanner(System.in);
        return input.nextInt() - 1;
    }

    static void printString() {      // <-- Only method you need to call to make the program work
        String charAtIndex = Character.toString(getString().charAt(getIndex()));

        System.out.println("The char you're looking for is: " + charAtIndex);
    }
}