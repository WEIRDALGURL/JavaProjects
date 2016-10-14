package Zoo;

/**
 * Created by sheamaynard on 10/13/16.
 */
public class Gorilla extends Animal {
    private String latinName;
    private enum location{}



    public void Animal(String fn, String latn, String g, int a, String c, String t, boolean d, String f, boolean e) {
        super.Animal(fn, g, a, c, t, d, f, e);
        latinName = latn;

    }
}
