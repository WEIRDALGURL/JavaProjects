package Calculator;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by sheamaynard on 10/11/16.
 */
public class TipCalculator extends Main{

    Scanner tipCal = new Scanner(System.in);

    public TipCalculator() throws IOException {
        System.out.println("Tip Calculator");
        System.out.println("===============");
        System.out.println("Enter check amount: ");
        double subTotal = tipCal.nextDouble();
        System.out.print("Enter gratuity percentage: ");
        int gratuity = tipCal.nextInt();
        System.out.println("");
        double gratuityAmount = Math.round(gratuity * .01 * subTotal * 100.0) / 100.0;
        System.out.println("\tGratuity: " + gratuityAmount);
        double total = Math.round((gratuityAmount + subTotal) * 100.0) / 100.0;
        System.out.println("\tTotal: $" + total);
        String fileName = "tipCalculate.txt";
        PrintWriter outFile = new PrintWriter(new FileWriter(fileName, true));
        outFile.println("Check Amount: " + subTotal);
        outFile.println("Gratuity Amount: "+ gratuityAmount);
        outFile.println("==================\n");
        outFile.println("Total " + total + "\n\n");
        outFile.close();
        System.out.println("Would you like to calculate another tip?");
        String response = tipCal.next();
        if (response.equals("no")){
            new Menu();
        }else {
            new TipCalculator();
        }



        return;
    }
}