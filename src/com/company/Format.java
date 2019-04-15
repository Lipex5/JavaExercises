package com.company;

import java.util.Scanner;

class Format {
    private static void Menu(String string){
        Scanner input = new Scanner(System.in);

        System.out.println(
                "What do you want to do?\n" +
                "1 - Remove all spaces in the beginning and in the end of the string\n" +
                "2 - Remove multiple spaces between words\n" +
                "3 - Uppercase the first letter of each word\n" +
                "4 - Lowercase all the letters in the string\n" +
                "5 - Return the final string and quit");

        switch (input.nextInt()){
            case 1:
                string = removeSpaces(string);
                System.out.println("The string now is: " + string);
                Menu(string);
                break;

            case 2:
                string = removeBetween(string);
                System.out.println("The string now is: " + string);
                Menu(string);
                break;

            case 3:
                string = uppercaseWord(string);
                System.out.println("The string now is: " + string);
                Menu(string);
                break;

            case 4:
                string = lowercaseAll(string);
                System.out.println("The string now is: " + string);
                Menu(string);
                break;

            case 5:
                quit(string);
                break;
        }
    }

    static void getString(){
        Scanner input = new Scanner(System.in);
        System.out.println("Write the string: ");
        Menu(input.nextLine());
    }

    private static String removeSpaces(String string){
        int step = 0;
        while(step < 2){
            while(string.charAt(0) == ' ') {
                if (step == 0) string = new StringBuilder(string).deleteCharAt(0).toString();

                else if(step == 1) string = new StringBuilder(string).deleteCharAt(0).toString();
                }

            string = new StringBuffer(string).reverse().toString();
            step++;
        }
        return string;
    }



    private static String removeBetween(String string){
        boolean end = false;
        while(!end){
            for(int i = 0; i < string.length(); i++) {
                if (string.charAt(i) == ' ' && string.charAt(i + 1) == ' ') {
                    string = new StringBuilder(string).deleteCharAt(i).toString();
                }
                if(i == string.length() - 1) end = true;
            }
        }
        return string;
    }

    private static String uppercaseWord(String string){
        return string;
    }

    private static String lowercaseAll(String string){
        return string;
    }

    private static String quit(String string){
        return string;
    }
}
