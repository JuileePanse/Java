/**
* Invalid Back Cover is a class to handle exception 
* @author Juilee Panse (juilee@yahoo.com)
* @version 0.1 19 March 2020
*/
class InvalidBackCover extends Error {
    /**
    * l represents number of lines of a back cover
    */
    private int l;
    /**
    * The constructor to create an object
    * Calls the super constructor of Error class
    * @param l1 represents the number of lines of a back cover
    */
    public InvalidBackCover(int l1){super(2); l = l1; }
    /**
    * get number of lines of a back cover
    * @return l nunber of lines
    */
    public int getL() { return l; }
 }