package toDoList;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Created by sheamaynard on 10/12/16.
 */
public class MiscList {
      static ArrayList<String> miscList = new ArrayList<>();
     Scanner input = new Scanner(System.in);
     String response;
     String item;
     String itemEntered;

    public MiscList() throws IOException {
        do {
            System.out.println("Please enter an item: ");
            itemEntered = input.nextLine();
            System.out.println("Is this item a high priority? yes/no");
            response = input.nextLine().toLowerCase();
            if (response.equals("yes"))
                miscList.add(0, itemEntered);
            else if (response.equals("no"))
                miscList.add(itemEntered);
            System.out.println("Do you want to add another item yes/no?");
            response = input.nextLine().toLowerCase();
        } while (response.equals("yes"));

        if (response.equals("no")) {
            System.out.println("These are the items you entered: \n");
            Iterator it = miscList.iterator();
            while (it.hasNext()) {
                item = (String) it.next();
                System.out.println("Miscellaneous Item: " + item);
            }
        }System.out.println("Would you like to save this information? yes/no");
        response = input.next();
        if (response.equals("yes")) {
            String fileName = "miscList.txt";
            PrintWriter outFile = new PrintWriter(new FileWriter(fileName));
            for (int j = 0; j < miscList.size(); ++j) {
                outFile.println(miscList.get(j));
            }

            outFile.close();
        }new Menu();
    }

}
