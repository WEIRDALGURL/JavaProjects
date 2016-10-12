package Calculator;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by sheamaynard on 10/11/16.
 */
public class Menu extends Main {
    public Menu() throws IOException {
        System.out.println("\nHow can I help you? \n \n" +
                "1) Basic Math Calculator \n" +
                "2) Tip Calculator \n" +
                "3) Grocery Tax Calculator \n" +
                "4) Past Calculations Menu\n" +
                "5) Help\n" +
                "6) Quit");


        Scanner userAnswer = new Scanner(System.in);
        int userInput = userAnswer.nextInt();



            switch (userInput) {

                case 1:
                    new Calculator();
                    break;

                case 2:
                    new TipCalculator();
                    break;

                case 3:
                    new GroceryTaxCalculator();
                    break;

                case 4:
                    new PastCalculations();
                    break;

                case 5:
                    new Help();
                    break;

                case 6:
                    System.out.println("\n Thank you for using my calculator!");
                    System.exit(0);
                    return;

            }
        }
    }

