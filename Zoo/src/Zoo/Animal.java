package Zoo;

/**
 * Created by sheamaynard on 10/13/16.
 */

public class Animal extends Zoo {
    protected String color;
    private String type;
    private boolean isDangerous;
    private String diet;
    private boolean isEndangered;



    public void Animal(String fn, String g, int a, String c, String t, boolean d, String f, boolean e) {
        super.zooInfo(fn, g, a);
        color = c;
        type = t;
        isDangerous = d;
        diet = f;
        isEndangered = e;
    }

    public String getColor() {
        System.out.println("Please input color");
        color = input.nextLine();
        return firstName;
    }

    public String getType(){
        input.nextLine();
        System.out.println("Please input type");
        type = input.nextLine();
        return type;
    }

    public boolean getIsDangerous() {
        System.out.println("Is this animal dangerous? true/false");
        isDangerous = input.nextBoolean();
        return isDangerous;
    }

    public String getDiet(){
        System.out.println("Is this animal a: Carnivore / Herbivore / Omnivore");
        diet = input.nextLine();
        return diet;
    }

    public boolean getIsEndangered() {
        input.nextLine();
        System.out.println("Is this animal endangered? true/false");
        isEndangered = input.nextBoolean();
        return isEndangered;
    }
    @Override
    public String displayInfo() {
        return "Name: " + firstName +"\n" +
                "Gender: " +gender+"\n" +
                "Age: " + age + "\n" +
                "Color: " + color + "\n" +
                "Type: " + type + "\n" +
                "Dangerous: " + isDangerous + "\n" +
                "Diet: " + diet + "\n" +
                "Endangered Status: " + isEndangered + "\n";

    }

    }

