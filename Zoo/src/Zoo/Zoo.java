package Zoo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Created by sheamaynard on 10/14/16.
 */
public class Zoo {
    Scanner input = new Scanner(System.in);
    ArrayList<String> Animals = new ArrayList<>();
    ArrayList<String> Visitors = new ArrayList<>();
    ArrayList<String> Employees = new ArrayList<>();
    public String firstName;
    public String gender;
    public int age;


    public void zooInfo(String fn, String g, int a) {
        firstName = fn;
        gender = g;
        age = a;
    }


    public String getFirstName() {
        System.out.println("Please input first name");
        firstName = input.nextLine();
        return firstName;
    }

    public String getGender() {
        System.out.println("Please input gender");
        gender = input.nextLine();
        return gender;
    }

    public int getAge() {
        System.out.println("Please input age");
        age = input.nextInt();
        return age;
    }

    public String displayInfo() {
        return "Name: " + firstName + "\n" +
                "Gender: " + gender + "\n" +
                "Age: " + age + "\n";
    }

    public void viewAnimals() {
        if (Animals.size() == 0) {
            System.out.println("This zoo needs some animals!");
        } else {
            Iterator it = Animals.iterator();
            while (it.hasNext()) {
                String animal = (String) it.next();
                System.out.println(animal);
            }
        }
    }

    public void viewEmployees() {
        if (Employees.size() == 0) {
            System.out.println("Better hire someone quick!");
        } else {
            Iterator it = Employees.iterator();
            while (it.hasNext()) {
                String employee = (String) it.next();
                System.out.println(employee);
            }
        }
    }
    public void viewVisitors() {
        if (Visitors.size() == 0) {
            System.out.println("This zoo won't last without customers!");
        } else {
            Iterator it = Visitors.iterator();
            while (it.hasNext()) {
                String visitor = (String) it.next();
                System.out.println(visitor);
            }
        }
    }

    public void addVisitor() {
        Visitor v1 = new Visitor();
        v1.getFirstName();
        v1.getLastName();
        v1.getVisitorID();
        v1.getAddress();
        v1.getPhone();
        v1.getGender();
        v1.getAge();
        System.out.println(v1.displayInfo());
        Visitors.add(v1.displayInfo());
        Visitors.add("\n");

    }
    public void addAnimal() {
        Animal a1 = new Animal();
        a1.getFirstName();
        a1.getGender();
        a1.getAge();
        a1.getColor();
        a1.getType();
        a1.getIsDangerous();
        a1.getDiet();
        a1.getIsEndangered();
        System.out.println(a1.displayInfo());
        Animals.add(a1.displayInfo());
        Animals.add("\n");


    }

    public void addEmployee() {
        Employee e1 = new Employee();
        e1.getFirstName();
        e1.getLastName();
        e1.getEmployeeID();
        e1.getDepartment();
        e1.getAddress();
        e1.getPhone();
        e1.getGender();
        e1.getAge();
        System.out.println(e1.displayInfo());

    }
}
