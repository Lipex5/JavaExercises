package com.company;

import java.util.Scanner;

public class FindWord {
    private static String getString(){
        Scanner input = new Scanner(System.in);
        System.out.println("Write the string: ");
        return input.nextLine();
    }

    private static String getWord(){
        Scanner input = new Scanner(System.in);
        System.out.println("Write the word to find within the string: ");
        return input.nextLine();
    }

    static void printWord(){
        String string = getString();
        String word = getWord();
        if(string.indexOf(word) != -1){
            int index = string.indexOf(word) + 1;
            System.out.println("The word '" + word + "' starts on the " + index + " spot in the string");
        }
        else{
            System.out.println("The word is not on the string");
        }

    }
}
