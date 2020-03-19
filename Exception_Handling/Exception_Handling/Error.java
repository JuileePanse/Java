/**
* Error is a class to handle exception 
* @author Juilee Panse (juilee@yahoo.com)
* @version 0.1 19 March 2020
*/
class Error extends Exception {
    /**
    * code represents error code
    */
    private int code;
    /**
    * The constructor to create an object
    * @param i1 represents the error code
    */
    public Error(int i1){code = i1; }
    /**
    * get error code
    * @return code error code
    */
    public int getCode() { return code; }
 }