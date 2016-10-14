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
public class PersonalList{
    ArrayList<String> personalList = new ArrayList<>();

    Scanner input = new Scanner(System.in);
    String response;
    String item;
    String itemEntered;


    public PersonalList() throws IOException {
        do {
            System.out.println("Please enter an item: ");
            itemEntered = input.nextLine();
            System.out.println("Is this item a high priority? yes/no");
            response = input.nextLine();
            if (response.equals("yes"))
                personalList.add(0, itemEntered);
            else if (response.equals("no"))
                personalList.add(itemEntered);
            System.out.println("Do you want to add another item yes/no?");
            response = input.nextLine();
        } while (response.equals("yes"));

        if (response.equals("no")) {
            System.out.println("These are the personal items you entered: \n");
            Iterator it = personalList.iterator();
            while (it.hasNext()) {
                item = (String) it.next();
                System.out.println("Personal Item: " + item);
            }
        }
        System.out.println("Would you like to save this information? yes/no");
        response = input.next();
        if (response.equals("yes")) {
            String fileName = "personalList.txt";
            PrintWriter outFile = new PrintWriter(new FileWriter(fileName));
            for (int j = 0; j < personalList.size(); ++j) {
                outFile.println(personalList.get(j));
            }

            outFile.close();
            new Menu();
        }

    }
}

