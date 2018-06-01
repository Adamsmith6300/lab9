package ca.bcit.comp1510.lab9;

/**
 * class to describe a name.
 * @author adams
 * @version 1.0
 *
 */
public class Name implements Comparable<Name> {

    /**
     * first name.
     */
    private String first;
    /**
     * middle name.
     */
    private String middle;
    /**
     * last name.
     */
    private String last;
    
    
    /**
     * Main constructor.
     * @param first first name
     * @param middle middle name
     * @param last last name
     * @throws IllegalArgumentException 
     */
    public Name(String first, String middle, String last) 
            throws IllegalArgumentException {
        if (first != null && first.trim().length() > 0) {
            this.first = first; 
        } else {
            throw new IllegalArgumentException("Invalid Arguments!");
        }
        if (middle == null) {
            this.middle = middle;
        } else if  (middle.trim().length() == 0) {
            throw new IllegalArgumentException("Invalid Arguments");
        } else {
            this.middle = middle;
        }
        if (last != null && first.trim().length() > 0) {
            this.last = last; 
        } else {
            throw new IllegalArgumentException("Invalid Arguments");
        }       
    }



    @Override
    public int compareTo(Name name2) {
        int result = 0;
        if (this.getLAST().compareTo(name2.getLAST()) == 0) {
            if (this.getMIDDLE().compareTo(name2.getMIDDLE()) == 0) {
                if (this.getFIRST().compareTo(name2.getFIRST()) != 0) {
                    result = this.getFIRST().compareTo(name2.getFIRST());
                }
            } else {
                result = this.getMIDDLE().compareTo(name2.getMIDDLE());
            }
        } else {
            result = this.getLAST().compareTo(name2.getLAST()); 
        }
        return result;
    }



    /**
     * ACCESSOR.
     * @return the first
     */
    public String getFIRST() {
        return first;
    }



    /**
     * ACCESSOR.
     * @return the middle
     */
    public String getMIDDLE() {
        return middle;
    }



    /**
     * ACCESSOR.
     * @return the last
     */
    public String getLAST() {
        return last;
    }
    
    /**
     * returns name as a string.
     * @return the name
     */
    public String toString() {
        return this.getFIRST() + " " + this.getMIDDLE() + " " + this.getLAST();
    }
}
