/**
* Cover is a class to model Book Cover.
* <pre>
*   Cover cover = new Cover(6);
*   cover.setN1(5);
* </pre>
* @author Juilee Panse (juilee@yahoo.com)
* @version 0.1 19 March 2020
*/
class Cover {
    /**
    * n1 represents number of lines of a cover
    */
    private int n1;
     /**
    * The constructor to create an object
    * @param n1 represents number of lines of a cover
    */
    public Cover(int n1)
    {
          this.n1 = n1;
    }
    /** 
     * set the number of pages
     * @param n1 number of pages
     */
    public void setN1(int n1){
        this.n1 = n1;
    }
    /** 
     * get number of pages
     * @return n1 number of pages
     */
    public int getN1()
    {
        return n1;
    }
 }