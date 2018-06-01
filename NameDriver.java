/**
 * 
 */
package ca.bcit.comp1510.lab9;

import java.util.ArrayList;
import java.util.Collections;

/**
 * class to test name class.
 * @author adams
 * @version 1.0
 *
 */
public class NameDriver {

    /**
     * Drives the program.
     * @param args unused
     */
    public static void main(String[] args) {
        ArrayList<Name> names = new ArrayList<Name>();
        Name name1 = new Name("Adam", "Ian", "Smith");
        Name name2 = new Name("Bob", "b", "ray");
        Name name3 = new Name("A$ap", null, "rocky");
        Name name4 = new Name("A$ap", null, "ferg");
        names.add(name1);
        names.add(name2);
        names.add(name3);
        names.add(name4);
        for (Name name: names) {
            System.out.println(name.toString());
        }
        Collections.sort(names);
        for (Name name: names) {
            System.out.println(name.toString());
        }
    }

}
