package Calculator;

import java.io.*;
import java.util.Scanner;

/**
 * Created by sheamaynard on 10/11/16.
 */
public class PastCalculations extends Main {
    Scanner input = new Scanner(System.in);
    int response;
    String answer;


    public PastCalculations() throws IOException {
        System.out.println("What previous calculations are you interested in? \n" +
                "1) Basic Math Calculator\n " +
                "2) Tip Calculator \n " +
                "3) Grocery Tax Calculator \n " +
                "4) Back to Main Menu \n");
        response = input.nextInt();
        switch (response) {
            case 1:
                readCalc();
                System.out.println("Would you like to clear the past data?\n");
                answer = input.next();
                if (answer.equals("yes")) {
                    String fileName = "calculate.txt";
                    PrintWriter outFile = new PrintWriter(new FileWriter(fileName));
                    outFile.close();
                }
            case 2:
                readTip();
                System.out.println("Would you like to clear the past data?\n");
                answer = input.next();
                if (answer.equals("yes")) {
                    String fileName = "tipCalculate.txt";
                    PrintWriter outFile = new PrintWriter(new FileWriter(fileName));
                    outFile.close();
                }
            case 3:
                readGrocery();
                System.out.println("Would you like to clear the past data?\n");
                answer = input.next();
                if (answer.equals("yes")) {
                    String fileName = "groceryTaxCalculate.txt";
                    PrintWriter outFile = new PrintWriter(new FileWriter(fileName));
                    outFile.close();
                }
            case 4:
                new Menu();
        }
    }
    public void readCalc() throws FileNotFoundException {
        String fileName = "calculate.txt";
        Scanner inFile = new Scanner(new FileReader(fileName));
        String toList;
        while (inFile.hasNextLine()) {
            toList = String.valueOf(inFile.nextLine());
            System.out.println(toList);
        }
    }

    public void readGrocery() throws FileNotFoundException {
        String fileName = "groceryTaxCalculate.txt";
        Scanner inFile = new Scanner(new FileReader(fileName));
        String toList;
        while (inFile.hasNextLine()) {
            toList = String.valueOf(inFile.nextLine());
            System.out.println(toList);
        }
    }

    public void readTip() throws FileNotFoundException {
        String fileName = "tipCalculate.txt";
        Scanner inFile = new Scanner(new FileReader(fileName));
        String toList;
        while (inFile.hasNextLine()) {
            toList = String.valueOf(inFile.nextLine());
            System.out.println(toList);

        }
    }
}