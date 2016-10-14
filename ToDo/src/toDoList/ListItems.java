package toDoList;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;

/**
 * Created by sheamaynard on 10/12/16.
 */
public class ListItems {
    Scanner input = new Scanner(System.in);
    int numResponse;

public ListItems() throws IOException {
    System.out.println("\nWhich list would you like to view? \n \n" +
            "1) Grocery List \n" +
            "2) Personal Shopping List \n" +
            "3) Miscellaneous \n" +
            "4) Help\n" +
            "5) Back to Main Menu");

    numResponse = input.nextInt();
    switch (numResponse){
        case 1:
            try {
                File fileName = new File("groceryList.txt");
                FileReader fileReader = new FileReader(fileName);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                StringBuffer stringBuffer = new StringBuffer();
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    stringBuffer.append(line);
                    stringBuffer.append("\n");
                }
                fileReader.close();
                System.out.println("Grocery Shopping List:");
                System.out.println("===============");
                System.out.println(stringBuffer.toString());
                new Menu();
            } catch (IOException e) {
                e.printStackTrace();
            }
            break;
        case 2:
            try {
            File fileName = new File("personalList.txt");
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            StringBuffer stringBuffer = new StringBuffer();
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                stringBuffer.append(line);
                stringBuffer.append("\n");
            }
            fileReader.close();
            System.out.println("Personal List:");
            System.out.println("===============");
            System.out.println(stringBuffer.toString());
                new Menu();
    } catch (IOException e) {
        e.printStackTrace();
    }break;
        case 3:
            try {
            File fileName = new File("miscList.txt");
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            StringBuffer stringBuffer = new StringBuffer();
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                stringBuffer.append(line);
                stringBuffer.append("\n");
            }
            fileReader.close();
            System.out.println("Miscellaneous List:");
            System.out.println("===============");
            System.out.println(stringBuffer.toString());
            new Menu();
    } catch (IOException e) {
        e.printStackTrace();
    }
    break;
        case 4:
            new Help();
            break;
        case 5:
            new Menu();
            break;
        default:
            System.out.println("Please select a valid option");
            new ListItems();
            break;

    }

}
}
