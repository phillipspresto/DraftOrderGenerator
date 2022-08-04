package com.techelevator;

import java.util.Scanner;

public class UserInput {
    private static Scanner input = new Scanner(System.in);


    public static String getMenuChoice(){
        System.out.println("Enter number of selection: ");
        String choice = input.nextLine();

        if (choice.equals("1")){
            return "1";
        } else if (choice.equals("2")){
            return "2";
        } else if (choice.equals("3")){
            return "3";
        } else if (choice.equals("4")){
            return "4";
        } else {
            return "Enter a valid option";
        }
    }
}
