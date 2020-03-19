/**
* Invalid Front Cover is a class to handle exception 
* @author Juilee Panse (juilee@yahoo.com)
* @version 0.1 19 March 2020
*/
class InvalidFrontCover extends Error {
    /**
    * l represents number of lines of a front cover
    */
    private int l;
    /**
    * The constructor to create an object
    * Calls the super constructor of Error class
    * @param l1 represents the number of lines of a front cover
    */
    public InvalidFrontCover(int l1){super(1); l = l1; }
    /**
    * get number of lines of a front cover
    * @return l number of lines
    */
    public int getL() { return l; }
 }