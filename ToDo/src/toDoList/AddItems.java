package toDoList;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by sheamaynard on 10/12/16.
 */
public class AddItems {
    Scanner input = new Scanner(System.in);
    int numResponse;

    public AddItems() throws IOException {
        System.out.println("\nWhich list would you like to add to? \n \n" +
                "1) Grocery List \n" +
                "2) Personal List \n" +
                "3) Miscellaneous \n" +
                "4) Help\n" +
                "5) Back to Main Menu");

        numResponse = input.nextInt();
        switch (numResponse){
            case 1:
                new GroceryList();
                break;
            case 2:
                new PersonalList();
                break;
            case 3:
                new MiscList();
                break;
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
