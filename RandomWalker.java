/**
 * 
 */
package ca.bcit.comp1510.lab9;

import java.util.Random;

/**
 * Class to describe a random walker.
 * @author adams
 * @version 1.0
 *
 */
public class RandomWalker {
    /**
     * THREE.
     */
    public static final int THREE = 3;
    /**
     * FOUR.
     */
    public static final int FOUR = 4;
    /**
     * currentX.
     */
    private int currentX;
    /**
     * currentY.
     */
    private int currentY;
    /**
     * maxSteps.
     */
    private int maxSteps;
    /**
     * currentSteps.
     */
    private int currentSteps;
    /**
     * Boundary.
     */
    private int boundary;
    /**
     * maximum distance.
     */
    private int maximumDistance;
    /**
     * main constructor.
     * @param maxSteps 
     * @param boundary 
     */
    public RandomWalker(int maxSteps, int boundary) {
        setMaxSteps(maxSteps);
        setBoundary(boundary);
        setCurrentX(0);
        setCurrentY(0);
        setCurrentSteps(0);
        setMaximumDistance(0);
    }
    /**
     * secondary constructor.
     * @param maxSteps 
     * @param currentX 
     * @param currentY 
     * @param boundary 
     */
    public RandomWalker(int maxSteps, 
            int currentX, int currentY, int boundary) {
        setMaxSteps(maxSteps);
        setBoundary(boundary);
        setCurrentX(currentX);
        setCurrentY(currentY);
        setCurrentSteps(0);
        setMaximumDistance(0);

    }

    /**
     * ACCESSOR.
     * @return the maximumDistance
     */
    public int getMaximumDistance() {
        return maximumDistance;
    }

    /**
     * MUTATOR.
     * @param maximumDistance the maximumDistance to set
     */
    public void setMaximumDistance(int maximumDistance) {
        this.maximumDistance = maximumDistance;
    }

    /**
     * ACCESSOR.
     * @return the currentX
     */
    public int getCurrentX() {
        return currentX;
    }

    /**
     * MUTATOR.
     * @param currentX the currentX to set
     */
    public void setCurrentX(int currentX) {
        this.currentX = currentX;
    }

    /**
     * ACCESSOR.
     * @return the currentY
     */
    public int getCurrentY() {
        return currentY;
    }

    /**
     * MUTATOR.
     * @param currentY the currentY to set
     */
    public void setCurrentY(int currentY) {
        this.currentY = currentY;
    }

    /**
     * ACCESSOR.
     * @return the maxSteps
     */
    public int getMaxSteps() {
        return maxSteps;
    }

    /**
     * MUTATOR.
     * @param maxSteps the maxSteps to set
     */
    public void setMaxSteps(int maxSteps) {
        this.maxSteps = maxSteps;
    }

    /**
     * ACCESSOR.
     * @return the currentSteps
     */
    public int getCurrentSteps() {
        return currentSteps;
    }

    /**
     * MUTATOR.
     * @param currentSteps the currentSteps to set
     */
    public void setCurrentSteps(int currentSteps) {
        this.currentSteps = currentSteps;
    }

    /**
     * ACCESSOR.
     * @return the boundary
     */
    public int getBoundary() {
        return boundary;
    }

    /**
     * MUTATOR.
     * @param boundary the boundary to set
     */
    public void setBoundary(int boundary) {
        this.boundary = boundary;
    }
    /**
     * ACCESSOR.
     * @return the walker as string
     */
    public String toString() {
        return "Current X coordinate: " + this.getCurrentX() 
        + " Current Y coordinate: " + this.getCurrentY() 
        + " Current Steps Taken: " + this.getCurrentSteps();
    }
    /**
     * simulates taking a step.
     */
    public void takeStep() {
        Random gen = new Random();
        int a = gen.nextInt(FOUR);
        switch (a) {
        case 0:
            this.currentX++;
            break;
        case 1:
            this.currentY++;
            break;
        case 2:
            this.currentX--;
            break;
        case THREE:
            this.currentY--;
            break;
        default:
            break;
        }
        this.currentSteps++;
        int maxDXY = this.max(Math.abs(this.currentX), Math.abs(this.currentY));
        this.maximumDistance = (this.max(this.maximumDistance, maxDXY));
    }
    /**
     * check if steps are within max.
     * @return true if it is
     */
    public boolean moreSteps() {
        return (this.currentSteps < this.maxSteps) ? true : false;
    }
    /**
     * check if within bounds.
     * @return true if it is
     */
    public boolean inBounds() {
        int cX = Math.abs(this.currentX);
        int cY = Math.abs(this.currentY);
        return (cX <= this.boundary && cY <= this.boundary) ? true : false;
    }
    /**
     * simulate walking.
     */
    public void walk() {
        while (this.inBounds() && this.moreSteps()) {
            this.takeStep();
        }
    }
    /**
     * support method to determine the max of two ints.
     * @param a 
     * @param b 
     * @return the max
     */
    private int max(int a, int b) {
        return (a >= b) ? a : b;
    }
}
