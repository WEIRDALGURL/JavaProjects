package Calculator;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Created by sheamaynard on 10/11/16.
 */
public class GroceryTaxCalculator extends Main {
    ArrayList<Double> groceryList = new ArrayList<>();
    Scanner inputGroc = new Scanner(System.in);
    String answer;
    Double sum = 0.0;
    Double stateTax;
    Object item;

    public GroceryTaxCalculator() throws IOException {
        System.out.println("Please enter the prices of your groceries!");
        do {
            System.out.println("Please enter a price: ");
            groceryList.add(inputGroc.nextDouble());
            System.out.println("Do you want to add another item yes/no?");
            answer = inputGroc.next();
        } while (answer.equals("yes"));

        if (answer.equals("no")) {
            System.out.println("These are the grocery items you entered: \n");
            Iterator it = groceryList.iterator();
            while (it.hasNext()) {
                item = it.next();
                System.out.println("Grocery Item: " + item);
            }
            for (int i = 0; i < groceryList.size(); i++)
                sum += Double.parseDouble(String.valueOf(groceryList.get(i)));
            {
                System.out.println("Subtotal: " + sum);
                stateTax = sum * 0.06;
                System.out.println("Tax: " + stateTax);
                Double total = sum + stateTax;
                System.out.println("Total: " + total);


                //Prints information to a txt file
                System.out.println("Would you like to save this information to a txt file? yes/no");
                answer = inputGroc.next();
                if (answer.equals("yes")) {
                    String fileName = "groceryTaxCalculate.txt";
                    PrintWriter outFile = new PrintWriter(new FileWriter(fileName, true));
                    outFile.println("\n ");
                    for (int j = 0; j < groceryList.size(); ++j) {
                        outFile.println("Grocery Item Price: " + groceryList.get(j));
                    }
                    outFile.println("\n Subtotal: " + sum);
                    outFile.println("Kentucky State Tax: " + stateTax);
                    outFile.println("=====================");
                    outFile.println("Your total is: " + total);
                    outFile.close();


                    //Enter more items?
                    System.out.println("Would you like to enter more items?");
                    String response = inputGroc.next().toLowerCase();
                    if (response.equals("yes")) {
                        new GroceryTaxCalculator();
                    } else if (response.equals("no")){
                        new Menu();
                    }else {
                        System.out.println("Please enter either yes or no.");
                    }

                }
            }
        }
    }
}
