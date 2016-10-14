package Calculator;

import java.util.Scanner;

/**
 * Created by sheamaynard on 10/11/16.
 */
//public class Temp {
//    Scanner userAnswer = new Scanner(System.in);
//    Scanner inputNum = new Scanner(System.in);
//    String userInput = userAnswer.next().toLowerCase();
//
//    Double numOne;
//    Double numTwo;
//    String op;
//    Double subtotal;
//    String response;
//    String nextOp;
//    Double nextNum;
//                    System.out.println("How can I help you? \n \n" +
//                            "1) Calculator \n" +
//                            "2) Tip Calculator \n" +
//                            "3) Sales Tax Calculator \n" +
//                            "4) Help \n" +
//                            "5) Quit");
//
//                    switch (userInput) {
//        case "calculator":
//            System.out.println("Calculator");
//            System.out.println("===============");
//            do{
//                System.out.println("Please enter a mathematical expression: ");
//                numOne = inputNum.nextDouble();
//                op = inputNum.next();
//                numTwo = inputNum.nextDouble();
//                subtotal = (compute(numOne, op, numTwo));
//                System.out.println("\t Your answer is: " + subtotal);
//                System.out.println("Are you finished with this expression? yes/no");
//                response = inputNum.next();
//            } while (response.equals("no"));
////
////                            if (response == "no") {
////                                System.out.println("Your subtotal is: " + subtotal + ". What would you like to do now?");
////                                nextOp = inputNum.next();
////                                nextNum = inputNum.nextDouble();
////
////                                if (nextOp.equals("+")) {
////                                    System.out.println("\t Your answer is: " + subtotal + nextNum);
////                                } else if (nextOp.equals("-")) {
////                                    System.out.println("\t Your answer is: " + +(subtotal - nextNum));
////                                } else if (nextOp.equals("*")) {
////                                    System.out.println("\t Your answer is: " + subtotal * nextNum);
////                                } else if (nextOp.equals("/")) {
////                                    System.out.println("\t Your answer is: " + subtotal / nextNum);
////                                } else {
////                                    System.out.println("Operation is invalid.");
////                                }
////                                return;
////                            } else if (response == "yes") {
////                                System.out.println("Thank you for using my calculator!");
////                                return;
////                            }
////                        case "tip calculator":
////                            Scanner tipCal = new Scanner(System.in);
////                            System.out.println("Tip Calculator");
////                            System.out.println("===============");
////                            System.out.println("Enter check amount: ");
////                            double subTotal = tipCal.nextDouble();
////                            System.out.print("Enter gratuity percentage: ");
////                            int gratuity = tipCal.nextInt();
////                            System.out.println("");
////                            double gratuityAmount = Math.round(gratuity * .01 * subTotal * 100.0) / 100.0;
////                            System.out.println("\tGratuity: " + gratuityAmount);
////                            double total = Math.round((gratuityAmount + subTotal) * 100.0) / 100.0;
////                            System.out.println("\tTotal: $" + total);
////                            return;
////                        case "sales tax calculator":
////                            Scanner salesTax = new Scanner(System.in);
////                            System.out.println("Sales Tax Calculator");
////                            System.out.println("===============");
////                            System.out.println("Enter an amount: ");
////                            numOne = inputNum.nextDouble();
////                            op = inputNum.next();
////                            numTwo = inputNum.nextDouble();
////                            subtotal = (compute(numOne, op, numTwo));
////                            System.out.println("\t Your answer is: " + subtotal);
////                            System.out.println("Would you like to enter another number? ");
////                            return;
////
////                        case "help":
////                            System.out.println("You needed help?");
////                            System.out.println("===============");
////                            System.out.println("\t Welcome to my calculator! \n \n" +
////                                    "If you need to calculate a mathematical expression please choose '1' to access the calculator. \n \n" +
////                                    "If you need to calculate a tip amount after a delicious meal choose '2' to access the tip calculator. \n\n" +
////                                    "You have already accessed the help menu by pressing '4'.\n\n" +
////                                    "If you would like to exit this program please select '5'.");
////                            break;
////                        case "quit":
////                            System.out.println("Thank you for your time!");
////                            System.exit(0);
////                            return;
//
//    }
//}
//    //
////
//    private static Double compute (Double numOne, String op, Double numTwo){
//        switch (op.charAt(0)) {
//            case '+':
//                return numOne + numTwo;
//            case '-':
//                return numOne - numTwo;
//            case '*':
//                return numOne * numTwo;
//            case '/':
//                return numOne / numTwo;
//        }
//        throw new IllegalArgumentException("Unknown operator: " + op + "\n Please enter either + - / or *");
//    }
//
//
//}
//
//}
