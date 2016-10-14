package Zoo;

import java.util.Scanner;

/**
 * Created by sheamaynard on 10/13/16.
 */
public class Visitor extends Person{

    public String visitorID;


    public void Visitor(String fn, String ln, String vID, String ad, String phn, String g, int a) {
        super.Person(fn, ln, ad, phn, g, a);
        visitorID = vID;


    }


    //Display Info

    public String getVisitorID(){
        System.out.println("Please input your Visitor ID Number");
        visitorID = input.nextLine();
        return visitorID;
    }

    @Override
    public String displayInfo() {
        return "Name: " + firstName +" " + lastName +"\n" +
                "Visitor ID: " + visitorID +"\n" +
                "Address: " + address + "\n" +
                "Phone Number: " + phoneNumber +"\n" +
                "Gender: " + gender + "\n" +
                "Age: " + age + "\n";
    }

    //FORCE to input information

    //Once info is entered they can view exhibits
    //view animal information
    //add a checkout option which clears their info
}
