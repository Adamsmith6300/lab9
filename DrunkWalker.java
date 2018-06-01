
package ca.bcit.comp1510.lab9;

import java.util.Scanner;

/**
 * class to describe a drunk walker.
 * @author adams
 * @version 1.0
 *
 */
public class DrunkWalker {

    /**
     * Drives the program.
     * @param args
     *              unused.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input maximum steps and boundary: ");
        int steps = scan.nextInt();
        int boundary = scan.nextInt();
        System.out.println("Input number of drunks: ");
        int drunks = scan.nextInt();
        int counter = 0;
        for (int i = 0; i < drunks; i++) {
            RandomWalker drunk = new RandomWalker(steps, boundary);
            System.out.println(drunk.toString());
            drunk.walk();
            System.out.println(drunk.toString());
            counter = (drunk.inBounds()) ? counter : counter + 1;
        }
        System.out.println("Total tests: " + drunks);
        System.out.println("Total falls out of bounds: " + counter);
        scan.close();
        
        
        
        
    }

}
