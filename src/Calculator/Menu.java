package Calculator;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Created by sheamaynard on 10/11/16.
 */
public class Menu extends Main {
    public Menu() throws IOException {
        System.out.println("\n\nHow can I help you? \n \n" +
                "Basic Math Calculator \n" +
                "Tip Calculator \n" +
                "Grocery Tax Calculator \n" +
                "Past Calculations Menu\n" +
                "Help\n" +
                "Quit");


        Scanner userAnswer = new Scanner(System.in);
        String userInput = userAnswer.nextLine().toLowerCase();



            switch (userInput) {

                case "calculator":
                    new Calculator();
                    break;

                case "tip calculator":
                    new TipCalculator();
                    break;

                case "grocery tax":
                    new GroceryTaxCalculator();
                    break;

//       case "past calculations":
//           new PastCalculations();
//           break;

                case "help":
                    new Help();
                    break;

                case "quit":
                    System.out.println("\n Thank you for using my calculator!");
                    System.exit(0);
                    return;

            }
        }
    }

