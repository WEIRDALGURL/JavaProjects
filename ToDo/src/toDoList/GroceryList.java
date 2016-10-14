package toDoList;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.io.File;

/**
 * Created by sheamaynard on 10/12/16.
 */
public class GroceryList {
    ArrayList<String> grocList = new ArrayList<>();
    Scanner input = new Scanner(System.in);
    String response;
    String item;
    String itemEntered;

    public GroceryList() throws IOException {
        Scanner s = new Scanner(new File("groceryList.txt"));
        while (s.hasNextLine()){
            grocList.add(s.nextLine());
        }
        s.close();
        do {
            System.out.println("Please enter an item: ");
            itemEntered = input.nextLine();
            System.out.println("Is this item a high priority? yes/no");
            response = input.nextLine();
            if (response.equals("yes"))
                grocList.add(0, itemEntered);
            else if (response.equals("no"))
                grocList.add(itemEntered);
            System.out.println("Do you want to add another item yes/no?");
            response = input.nextLine();
        } while (response.equals("yes"));

        if (response.equals("no")) {
            viewGrocList();


            //prints to a txt file
        } System.out.println("Would you like to save this information? yes/no");
        response = input.next();
        if (response.equals("yes")) {
            String fileName = "groceryList.txt";
            PrintWriter outFile = new PrintWriter(new FileWriter(fileName));
            for (int j = 0; j < grocList.size(); ++j) {
                outFile.println(grocList.get(j));
            }
            outFile.close();
            new Menu();
        }
    }

    public void viewGrocList() {
        System.out.println("These are the items in your grocery list: \n");
        Iterator it = grocList.iterator();
        while (it.hasNext()) {
            item = (String) it.next();
            System.out.println("Grocery Item: " + item);
        }
    }
}