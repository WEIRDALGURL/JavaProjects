package Calculator;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by sheamaynard on 10/10/16.
 */
public class Calculator {
        Scanner inputNum = new Scanner(System.in);

        Double numOne;
        Double numTwo;
        String op;
        Double subtotal;
        String response;
        public Calculator() throws IOException {
         System.out.println("\n\nCalculator");
            System.out.println("=============== \n\n");
            do{
                System.out.println("Please enter a mathematical expression: ");
                numOne = inputNum.nextDouble();
                op = inputNum.next();
                numTwo = inputNum.nextDouble();
                subtotal = (compute(numOne, op, numTwo));
                System.out.println("\n\t Your answer is: " + subtotal);
                System.out.println("Are you finished with this expression? yes/no");
                response = inputNum.next();
            } while (response.equals("no"));
        if (response.equals("yes")){
            new Menu();
        }
        }

    private static Double compute (Double numOne, String op, Double numTwo){
        switch (op.charAt(0)) {
            case '+':
                return numOne + numTwo;
            case '-':
                return numOne - numTwo;
            case '*':
                return numOne * numTwo;
            case '/':
                return numOne / numTwo;
        }
        throw new IllegalArgumentException("Unknown operator: " + op + "\n Please enter either + - / or *");
    }


}
