package com.techelevator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Generator {

    private static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {

        userEntries userEntries = new userEntries();
        List<String> draftOrder = new ArrayList<>();

        while (true) {
            System.out.println("[1] add new manager");
            System.out.println("[2] calculate draft order");
            System.out.println("[3] exit program");
            System.out.println("Enter selection: ");
            String userChoice = userInput.nextLine();

            System.out.println();

            if (userChoice.equals("1")) {
                System.out.println("Enter team manager name: ");
                String managerName = userInput.nextLine();

                System.out.println("Enter place finished last season (number): ");
                Integer place = Integer.parseInt(userInput.nextLine());

                userEntries.addEntry(managerName, place);

            } else if (userChoice.equals("2")) {
                for (Entry entry: userEntries.getEntries()) {
                    String name = userEntries.getRandom();
                    if (!draftOrder.contains(name)) {
                        draftOrder.add(name);
                    }
                }
                for (int i = 0; i < draftOrder.size(); i++){
                    System.out.println((i + 1) + ". " + draftOrder.get(i));
                }
                System.out.println("");
            } else {
                break;
            }
        }
    }
}
