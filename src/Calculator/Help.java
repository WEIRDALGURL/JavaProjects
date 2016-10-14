package Calculator;

import java.io.IOException;

/**
 * Created by sheamaynard on 10/11/16.
 */
public class Help extends Main {

    public Help() throws IOException {
        System.out.println("Allow me to assist you!");
        System.out.println("\t\t===============\n\n");
        System.out.println("Calculator\n\n" +
                "\t\tEnter a mathematical expression in order to either add '+', subtract '-', multiply  '*', or divide '/'two numbers.\n\n" +
                "Tip Calculator\n\n" +
                "\t\tTo calculate the tip on a delicious meal; enter the total check amount, followed by a percentage amount (preferably 15 or above) to get the recommended tip amount and the total.\n\n" +
                "Grocery Tax Calculator\n\n" +
                "\t\tEnter the prices of your grocery items in order to calculate what the Kentucky state tax will be on your total.");
        new Menu();


        }

    }