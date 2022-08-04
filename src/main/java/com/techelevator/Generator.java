package com.techelevator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Generator {

    public static void main(String[] args) {
        UserEntries userEntries = new UserEntries();
        Scanner input = new Scanner(System.in);
        List<String> draftOrder = new ArrayList<>();

        while (true) {
            //print out menu
            UserOutput.getMenuHeader();
            UserOutput.getMainMenu();
            //get menu selection choice
            String choice = UserInput.getMenuChoice();

            if (choice.equals("1")){
                //Add manager, place (weight) to entries list
                System.out.println("Manager Name: ");
                String name = input.nextLine();
                System.out.println("Place finished last season: ");
                double weight = Double.parseDouble(input.nextLine());
                userEntries.addEntry(name, weight);
            } else if (choice.equals("2")){
                //display entries already added to entries list
                userEntries.getEntries();
            } else if (choice.equals("3")){
                //calculate draft order (weighted random) and return new List draftOrder that includes ALL entries from entries list
                List<Entry> entries = userEntries.getListOfEntries();
                while (draftOrder.size() < entries.size()){
                    String name = userEntries.getRandom(entries);
                    if (!draftOrder.contains(name)){
                        draftOrder.add(name);
                    }
                }
                int count = 1;
                for (String name: draftOrder) {
                    System.out.println(count + "." + name);
                    count++;
                }


            } else if (choice.equals("4")){
                //exit program
                break;
            } else {
                System.out.println("Enter a valid option. Try again");;
            }
        }
    }
}
