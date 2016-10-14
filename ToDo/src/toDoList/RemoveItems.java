package toDoList;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Created by sheamaynard on 10/12/16.
 */
public class RemoveItems extends RecallInfo {
    Scanner input = new Scanner(System.in);
    int numResponse;
    int removeResponse;
    String response;
    String item;
    String itemEntered;

    public RemoveItems() throws IOException {
        System.out.println("\nFrom which list would you like to remove an item? \n \n" +
                "1) Grocery List \n" +
                "2) Personal List \n" +
                "3) Miscellaneous \n" +
                "4) Help\n" +
                "5) Back to Main Menu");

        numResponse = input.nextInt();
        switch (numResponse) {
            case 1:
                System.out.println("What would you like to do? \n" +
                        "1) Remove single item \n" +
                        "2) Clear entire list");
                removeResponse = input.nextInt();
                switch (removeResponse) {
                    case 1:
                        recallGroceryList();
                        System.out.println("Grocery List: \n");
                        Iterator it = grocList.iterator();
                        while (it.hasNext()) {
                            item = (String) it.next();
                            System.out.println(item);
                        }
                        do {
                            System.out.println("Enter an item you would like to remove: ");
                            input.nextLine();
                            itemEntered = input.nextLine();
                            System.out.println("Are you sure you would like to remove " + itemEntered + " from your list?");
                            response = input.nextLine();
                            if (response.equals("yes")) {
                                grocList.remove(itemEntered);
                            }
                            System.out.println("Do you want to remove another item yes/no?");
                            response = input.nextLine().toLowerCase();
                        } while (response.equals("yes"));
                        String fileName = "groceryList.txt";
                        PrintWriter outFile = new PrintWriter(new FileWriter(fileName));
                        for (int j = 0; j < grocList.size(); ++j) {
                            outFile.println(grocList.get(j));
                        }
                        outFile.close();
                        new Menu();
                        break;
                    case 2:
                        System.out.println("Your list has been cleared");
                        fileName = "groceryList.txt";
                        outFile = new PrintWriter(new FileWriter(fileName));
                        outFile.close();
                        new Menu();
                        break;
                }break;

            case 2:
                System.out.println("What would you like to do? \n" +
                        "1) Remove single item \n" +
                        "2) Clear entire list");
                removeResponse = input.nextInt();
                switch (removeResponse) {
                    case 1:
                        recallPersonalList();
                        System.out.println("Personal List: \n");
                        Iterator it = personalList.iterator();
                        while (it.hasNext()) {
                            item = (String) it.next();
                            System.out.println(item);
                        }
                        do {
                            System.out.println("Enter an item you would like to remove: ");
                            input.nextLine();
                            itemEntered = input.nextLine();
                            System.out.println("Are you sure you would like to remove " + itemEntered + " from your list?");
                            response = input.nextLine();
                            if (response.equals("yes")) {
                                personalList.remove(itemEntered);
                            }
                            System.out.println("Do you want to remove another item yes/no?");
                            response = input.nextLine().toLowerCase();
                        } while (response.equals("yes"));
                        String fileName = "personalList.txt";
                        PrintWriter outFile = new PrintWriter(new FileWriter(fileName));
                        for (int j = 0; j < personalList.size(); ++j) {
                            outFile.println(personalList.get(j));
                        }
                        outFile.close();
                        new Menu();
                        break;
                    case 2:
                        System.out.println("Your list has been cleared");
                        fileName = "personalList.txt";
                        outFile = new PrintWriter(new FileWriter(fileName));
                        outFile.close();
                        new Menu();
                        break;
                }break;

            case 3:
                System.out.println("What would you like to do? \n" +
                        "1) Remove single item \n" +
                        "2) Clear entire list");
                removeResponse = input.nextInt();
                switch (removeResponse) {
                    case 1:
                        recallMiscList();
                        System.out.println("Miscellaneous List: \n");
                        Iterator it = miscList.iterator();
                        while (it.hasNext()) {
                            item = (String) it.next();
                            System.out.println(item);
                        }
                        do {
                            System.out.println("Enter an item you would like to remove: ");
                            input.nextLine();
                            itemEntered = input.nextLine();
                            System.out.println("Are you sure you would like to remove " + itemEntered + " from your list?");
                            response = input.nextLine();
                            if (response.equals("yes")) {
                                miscList.remove(itemEntered);
                            }
                            System.out.println("Do you want to remove another item yes/no?");
                            response = input.nextLine().toLowerCase();
                        } while (response.equals("yes"));
                        String fileName = "miscList.txt";
                        PrintWriter outFile = new PrintWriter(new FileWriter(fileName));
                        for (int j = 0; j < miscList.size(); ++j) {
                            outFile.println(miscList.get(j));
                        }
                        outFile.close();
                        new Menu();
                        break;
                    case 2:
                        System.out.println("Your list has been cleared");
                        fileName = "miscList.txt";
                        outFile = new PrintWriter(new FileWriter(fileName));
                        outFile.close();
                        new Menu();
                        break;
                }break;
            case 4:
                new Help();
                break;
            case 5:
                new Menu();
                break;
            default:
                System.out.println("Please select a valid option");
                new AddItems();
                break;

        }

    }

}
