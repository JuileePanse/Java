/**
* SquareBook is a class to handle exception 
* @author Juilee Panse (juilee@yahoo.com)
* @version 0.1 19 March 2020
*/
class SquareBook extends Error {
    /**
    * side represents side of a book
    */
    private int side;
    /**
    * The constructor to create an object
    * Calls the super constructor of Error class 
    * @param side1 represents the side of a book
    */
    public SquareBook(int side1){super(4); side = side1; }
    /**
    * get side of book
    * @return side of a book
    */
    public int getSide() { return side; }
 }