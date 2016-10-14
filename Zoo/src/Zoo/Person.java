package Zoo;

/**
 * Created by sheamaynard on 10/13/16.
 */
public class Person extends Zoo {
    public String lastName;
    public String address;
    public String phoneNumber;

    public void Person(String fn, String ln, String ad, String phn, String g, int a) {
        super.zooInfo(fn, g, a);
        lastName = ln;
        address = ad;
        phoneNumber = phn;
    }

        public String getLastName(){
            System.out.println("Please input your last name");
            lastName = input.nextLine();
            return lastName;
        }

        public String getAddress(){
            System.out.println("Please input your address");
            address = input.nextLine();
            return address;
        }

        public String getPhone() {
            System.out.println("Please input your phone number");
            phoneNumber = input.nextLine();
            return phoneNumber;
        }

        public String displayInfo() {
            return "Name: " + firstName + lastName +"\n" +
                    "Address: " + address + "\n" +
                    "Phone Number: " + phoneNumber +"\n" +
                    "Gender: " + gender + "\n" +
                    "Age: " + age + "\n";
        }
    }


