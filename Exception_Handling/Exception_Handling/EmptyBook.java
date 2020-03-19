/**
* EmptyBook is a class to handle exception 
* @author Juilee Panse (juilee@yahoo.com)
* @version 0.1 19 March 2020
*/
class EmptyBook extends Error{
    /**
    * np represents number of pages of a book
    */
    private int np;
    /**
    * The constructor to create an object
    * Calls the super constructor of Error class
    * @param n1 represents number of lines of a cover
    */
    public EmptyBook(int np1){super(3); np = np1; }
    /**
    * get number of pages
    * @return np number of pages
    */
    public int getNp() { return np; }
 }