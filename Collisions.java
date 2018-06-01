/**
 * 
 */
package ca.bcit.comp1510.lab9;

/**
 * Class to describe particles colliding.
 * 
 * @author adams
 * @version 1.0
 *
 */
public class Collisions {

    /**
     * MAX STEPS.
     */
    public static final int MAX_STEPS = 100000;
    /**
     * BOUNDARY.
     */
    public static final int BOUNDARY = 2000000;
    /**
     * THREE.
     */
    public static final int THREE = 3;
    /**
     * MINUS THREE.
     */
    public static final int MINUS_THREE = -3;

    /**
     * Drives the program.
     * @param args  unused
     */
    public static void main(String[] args) {
       
        RandomWalker p1 = new RandomWalker(MAX_STEPS, MINUS_THREE, 0, BOUNDARY);
        RandomWalker p2 = new RandomWalker(MAX_STEPS, THREE, 0, BOUNDARY);
        int counter = 0;
        for (int i = 0; i < MAX_STEPS; i++) {
            p1.takeStep();
//            System.out.println(p1.toString());
            p2.takeStep();
//            System.out.println(p2.toString());
            if (samePosition(p1, p2)) {
                counter++;
            }
        }
        System.out.println(p1.getMaximumDistance());
        System.out.println(p2.getMaximumDistance());
        System.out.println(counter);


    }
    
    /**
     * Checks if there's been a collision.
     * @param p1 the first walker
     * @param p2 the second walker
     * @return true if they're the same
     */
    public static boolean samePosition(RandomWalker p1, RandomWalker p2) {
        return (p1.toString().equals(p2.toString())) ? true : false;
    }

}
