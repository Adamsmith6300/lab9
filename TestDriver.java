/**
 * 
 */
package ca.bcit.comp1510.lab9;

import java.util.Scanner;

/**
 * test driver class.
 * @author adams
 * @version 1.0
 *
 */
public class TestDriver {

    /**
     * Twenty five.
     */
    public static final int TF = 25;
    /**
     * Two hundred.
     */
    public static final int TWO_HUNNY = 200;
    /**
     * Ten.
     */
    public static final int TEN = 10;
    /**
     * FIVE.
     */
    public static final int FIVE = 5;
    
    /**
     * Drives the program.
     * @param args unused
     */
    public static void main(String[] args) {
        RandomWalker wlkr = new RandomWalker(TF, TF);
        Scanner scan = new Scanner(System.in);
        System.out.println("Gimme max steps and boundary size: ");
        int max = scan.nextInt();
        int bound = scan.nextInt();
        RandomWalker wlkr2 = new RandomWalker(max, bound);
        System.out.println(wlkr.toString());
        for (int i = 0; i < TF; i++) {
            wlkr.takeStep();
            System.out.println(wlkr.toString());
            System.out.println(wlkr.moreSteps());
            System.out.println(wlkr.inBounds());
            System.out.println(wlkr.getMaximumDistance());
        }
        System.out.println(wlkr2.toString());
        for (int i = 0; i < FIVE; i++) {
            wlkr2.takeStep();
            System.out.println(wlkr2.toString());
            System.out.println(wlkr2.moreSteps());
            System.out.println(wlkr2.inBounds());
        }
        RandomWalker wlkr3 = new RandomWalker(TWO_HUNNY, TEN);
        System.out.println(wlkr3.toString());
        wlkr3.walk();
        System.out.println(wlkr3.toString());
        
        scan.close();
        
    }

}
