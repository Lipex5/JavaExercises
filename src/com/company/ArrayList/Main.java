package com.company.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void Menu() {
        ArrayList names = new ArrayList<String>();

        Scanner input = new Scanner(System.in);

        System.out.println(
                "What do you want to do?\n" +
                        "1 - Insert names\n" +
                        "2 - Find a name\n" +
                        "3 - Remove a name\n" +
                        "4 - Check for duplicates\n" +
                        "5 - Remove duplicates\n" +
                        "6 - Print all names");

        switch (input.nextInt()){
            case 1:
                insertName(names);
                Menu();
                break;

            case 2:
                findName(names);
                Menu();
                break;

            case 3:
                removeName(names);
                Menu();
                break;

            case 4:
                findDuplicates(names);
                Menu();
                break;

            case 5:
                removeDuplicates(names);
                Menu();
                break;

            case 6:
                printNames(names);
                Menu();
                break;

            case 7:
                System.exit(0);
        }
    }

    private static void insertName(ArrayList names){
        System.out.print("Insert name: ");
        Scanner input = new Scanner(System.in);
        names.add(input.nextLine());
        System.out.println("Name added successfully");
    }

    private static void findName(ArrayList names){
        System.out.print("Insert name to find: ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        if(names.contains(name)) name = name + "IS";
        else name = name + "ISN'T";
        System.out.println("The name " + name + " on the list");
    }

    private static void removeName(ArrayList names){
        System.out.print("Insert name to remove: ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        if(names.contains(name)){
            names.remove(name);
            System.out.println("Name successfully removed");
        }
        else System.out.println("Name cannot be found");
    }

    private static void findDuplicates(ArrayList names){
        System.out.print("Insert name to find duplicate of: ");
        Scanner input = new Scanner(System.in);
        if(names.contains(input.nextLine())) System.out.println("There are duplicates of that name");
        else System.out.println("There are NO duplicates of that name");
    }

    private static void removeDuplicates(ArrayList names){
        System.out.print("Insert name to remove duplicate of: ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        if(names.contains(name)){
            names.remove(name);
            System.out.println("Removal successful");
        }
        else System.out.println("Name cannot be found on the list");
    }

    private static void printNames(ArrayList names){
        Scanner input = new Scanner(System.in);
        System.out.println("Print on ascending (1) or descending (2) order?");
        int num = input.nextInt();
        if(num != 1 && num != 2) printNames(names);

        if(num == 1) {
            for (Object name : names) {
                System.out.println(name);
            }
        }
        else if(num == 2){
            for(int i = names.size(); i >= 0; i--) {
                System.out.println(names.get(i));
            }
        }
        else System.out.println("An error occurred");
    }
}
