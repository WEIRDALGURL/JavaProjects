package Zoo;

import java.util.Scanner;

/**
 * Created by sheamaynard on 10/13/16.
 */

public class Menu extends Zoo{
    Scanner userAnswer = new Scanner(System.in);
    int userInput;
    private String enteredPassword;
    private String password = "password";

    public Menu() {


        System.out.println("\nAre you a(n): \n \n" +
                "1) Employee \n" +
                "2) Visitor \n" +
                "3) Quit");

        userInput = userAnswer.nextInt();

        switch (userInput) {
            case 1:
                employeeStop();
                break;

            case 2:
                visitorStop();
                break;

            case 3:
                System.out.println("\n Thank you for dancing at the Zombie Zoo!");
                System.exit(0);
                return;

            default:
                System.out.println("Please enter a valid option");
                new Menu();
        }
    }
   public void visitorStop() {
    System.out.println("Please input your information to access the zoo directory: ");
       addVisitor();
       visMenu();

}
    public void visMenu(){
        System.out.println("\nWhat would you like to do? \n \n" +
                "1) View Exhibits \n" +
                "2) View Animal Info \n" +
                "3) Check Out \n" +
                "4) Quit");

        userInput = userAnswer.nextInt();

        switch (userInput) {
            case 1:
                System.out.println("This option is not operational at this time.");
                visMenu();
                break;

            case 2:
                viewAnimals();
                visMenu();
                break;

            case 3:
                System.out.println("Your information has been removed form our system");
                new Menu();
                break;

            case 4:
                System.out.println("\n Thank you for dancing at the Zombie Zoo!");
                System.exit(0);
                break;

            default:
                System.out.println("Please enter a valid option");
                visMenu();
                break;
        }
    }
    public void employeeStop() {
        System.out.println("Please input your employee password for verification: (Hint: Enter password) ");
        enteredPassword = userAnswer.next();
        if (enteredPassword.equals(password)) {
            empMenu();

        } else {
            System.out.println("You have entered an incorrect password");
            employeeStop();
        }
    }

    public void empMenu() {
        System.out.println("\nWhat would you like to do? \n \n" +
                "1) Add Animals \n" +
                "2) Remove Animals \n" +
                "3) View Animals \n" +
                "4) Add Visitors \n" +
                "5) Remove Visitors \n" +
                "6) View Visitors\n" +
                "7) Add Employees\n" +
                "8) Remove Employees\n" +
                "9) View Employees\n" +
                "10) Quit");

        userInput = userAnswer.nextInt();

        switch (userInput) {
            case 1:
                addAnimal();
                empMenu();
                break;

            case 2:
                System.out.println("This option is not operational at this time.");
                empMenu();
                break;

            case 3:
                viewAnimals();
                empMenu();
                break;

            case 4:
                addVisitor();
                empMenu();
                break;

            case 5:
                System.out.println("This option is not operational at this time.");
                empMenu();
                break;

            case 6:
                viewVisitors();
                empMenu();
                break;

            case 7:
                addEmployee();
                empMenu();
                break;

            case 8:
                System.out.println("This option is not operational at this time.");
                empMenu();
                break;

            case 9:
                viewEmployees();
                empMenu();
                break;

            case 10:
                System.out.println("\n Thank you for dancing at the Zombie Zoo!");
                System.exit(0);
                break;

            default:
                System.out.println("Please enter a valid option");
                empMenu();
                break;
        }
    }
}
