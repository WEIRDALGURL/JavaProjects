package toDoList;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by sheamaynard on 10/13/16.
 */
public class RecallInfo {
    public static ArrayList<String> grocList = new ArrayList<>();
    public static ArrayList<String> personalList = new ArrayList<>();
    public static ArrayList<String> miscList = new ArrayList<>();

    public void recallGroceryList() throws IOException {
        Scanner s = new Scanner(new File("groceryList.txt"));
        while (s.hasNextLine()) {
            grocList.add(s.nextLine());
        }
        s.close();

    }
    public void recallPersonalList() throws IOException {
        Scanner s = new Scanner(new File("personalList.txt"));
        while (s.hasNextLine()) {
            personalList.add(s.nextLine());
        }
        s.close();
    }
    public void recallMiscList() throws IOException {
        Scanner s = new Scanner(new File("miscList.txt"));
        while (s.hasNextLine()) {
            miscList.add(s.nextLine());
        }
        s.close();
    }
}