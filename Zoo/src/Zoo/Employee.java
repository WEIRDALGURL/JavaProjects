package Zoo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by sheamaynard on 10/13/16.
 */
public class Employee extends Person {
    Scanner userAnswer = new Scanner(System.in);
    ArrayList<String> Employees = new ArrayList<>();
    int userInput;
    public String employeeID;
    public String department;


    public void Employee(String fn, String ln, String eID, String dep, String ad, String phn, String g, int a) {
        super.Person(fn, ln, ad, phn, g, a);
        employeeID = eID;
        department = dep;

    }

    //Display Info

    public String getEmployeeID() {
        System.out.println("Please input your Employee ID Number");
        employeeID = input.nextLine();
        return employeeID;
    }

    public String getDepartment() {
        System.out.println("Please input your department");
        department = input.nextLine();
        return department;
    }

    public String displayInfo() {
        return "Name: " + firstName + " " + lastName + "\n" +
                "Employee ID: " + employeeID + "\n" +
                "Department: " + department + "\n" +
                "Address: " + address + "\n" +
                "Phone Number: " + phoneNumber + "\n" +
                "Gender: " + gender + "\n" +
                "Age: " + age + "\n";
    }

    //Add Animals  If animal count is <1 must add animal

    //Remove animals
    //View Animals

        //Add Visitors

        //Remove Visitors
        //Add Employees
        //Remove Employees


}
