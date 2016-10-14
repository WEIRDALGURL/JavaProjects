package toDoList;

import java.io.IOException;

/**
 * Created by sheamaynard on 10/12/16.
 */
public class Help {
    public Help() throws IOException {
        System.out.println("Allow me to assist you!");
        System.out.println("\t\t===============\n\n");
        System.out.println("View a List\n\n" +
                "\t\tEnter a number to choose a list you would like to view. \n\n" +
                "Add to a List\n\n" +
                "\t\tEnter a number to choose the list you would like to add to, then enter an item." +
                "If the item is high priority it will be moved to the top of the list. " +
                "You will then be given the option to add additional items." +
                "Once you are finished adding items, your list will be displayed, and you will have the option to save the list so it will " +
                "be accessible when you return to the application.\n\n" +
                "Remove from a List\n\n" +
                "\t\tEnter a number to choose the list you would like to remove from.  You will have the choice to clear the entire list or to remove one specific item" +
                "If you choose to remove just one item you will be shown the list you have chosen, so that you can type in the item to remove it." +
                "You then confirm you want to remove that item, so you don't remove anything by mistake, then you have the option to remove more items if you want.");
        new Menu();


    }
}
