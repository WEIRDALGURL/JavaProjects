package toDoList;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by sheamaynard on 10/12/16.
 */
public class Menu {
    public Menu() throws IOException {
        System.out.println("\nHow can I help you? \n \n" +
                "1) View a List \n" +
                "2) Add to a List \n" +
                "3) Remove from a List \n" +
                "4) Help\n" +
                "5) Quit");


        Scanner userAnswer = new Scanner(System.in);
        int userInput = userAnswer.nextInt();



        switch (userInput) {

            case 1:
                new ListItems();
                break;

            case 2:
                new AddItems();
                break;

            case 3:
                new RemoveItems();
                break;

            case 4:
                new Help();
                break;

            case 5:
                System.out.println("\n Thank you for using my to do list!");
                System.exit(0);
                return;

            default:
                System.out.println("Please enter a valid option");
                new Menu();

        }
    }
}


