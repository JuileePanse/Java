/**
* Book is a class to model Book.
* <pre>
*   Book book = new Book(200, 3, 4, 5, 6);
*   book.getFrontCover();
*   book.setBackCover(15);
* </pre>
* @author Juilee Panse (juilee@yahoo.com)
* @version 0.1 19 March 2020
*/
class Book {
    /**
    * np represents number of pages of a book
    */
    private int np;
    /**
    * w,h represents the width and height of a book
    */
    private int w, h;
    /**
    * frontCover is a Object of cover class which represents front cover of a book
    */
    private Cover frontCover = new Cover(0);
    /**
    * backCover is a Object of cover class which represents back cover of a book
    */
    private Cover backCover = new Cover(0);

    /**
    * The constructor to create an object
    * @param np represents number of pages of a book
    * @param w represents the width of a book
    * @param h represents the width of a book
    * @param f_n1 represents number of lines of a Front cover
    * @param b_n1 represents number of lines of a Back cover
    * @exception InvalidFrontCover Number of lines for front cover more than 10
    * @exception InvalidBackCover Number of lines for back cover more than 20
    * @exception EmptyBook Number of pages of the book is less or equal to 0
    * @exception SquareBook The book's width is equal to its height 
    */
    public Book(int np, int w, int h, int f_n1, int b_n1)
            throws InvalidFrontCover, InvalidBackCover, EmptyBook, SquareBook {
        if (np <= 0)
            throw new EmptyBook(np);
        else if (w == h)
            throw new SquareBook(w);
        else if (f_n1 > 10)
            throw new InvalidFrontCover(f_n1);
        else if (b_n1 > 20)
            throw new InvalidBackCover(b_n1);
        else {
            this.np = np;
            this.w = w;
            this.h = h;
            frontCover.setN1(f_n1);
            backCover.setN1(b_n1);
        }
    }

    /**
    * get number of pages
    * @return np number of pages
    */
    public int getNp() {
        return this.np;
    }
    /**
    * get Width of a book
    * @return w width of a book
    */
    public int getW() {
        return this.w;
    }
    /**
    * get Height of a book
    * @return h height of a book
    */
    public int getH() {
        return this.h;
    }
    /**
    * get Front Cover of a book
    * @return frontCover cover class object
    */
    public Cover getFrontCover() {
        return this.frontCover;
    }
    /**
    * get Back Cover of a book
    * @return backCover cover class object
    */
    public Cover getBackCover() {
        return this.backCover;
    }
    /**
     * set the number of lines
     * @param np number of lines
     * @exception EmptyBook Number of pages of the book is less or equal to 0
     */
    public void setNp(int np) throws EmptyBook{
        if (np <= 0)
            throw new EmptyBook(np);
        else
            this.np = np;
    }
    /**
     * set width and height
     * @param w width of a book
     * @param h height of a book
     * @exception SquareBook The book's width is equal to its height 
     */
    public void setWH(int w, int h) throws SquareBook {
        if (w == h)
            throw new SquareBook(w);
        else {
            this.w = w;
            this.h = h;
        }
    }
    /**
     * set Front Cover
     * @param f_n1 represents number of lines of a Front cover
     * @exception InvalidFrontCover Number of lines for front cover more than 10 
     */
    public void setFrontCover(int f_n1) throws InvalidFrontCover{
        if (f_n1 > 10)
            throw new InvalidFrontCover(f_n1);
        else
            frontCover.setN1(f_n1);
    }
    /**
     * set Back Cover
     * @param b_n1 represents number of lines of a Back cover
     * @exception InvalidBackCover Number of lines for back cover more than 20 
     */
    public void setBackCover(int b_n1) throws InvalidBackCover{
        if (b_n1 > 20)
            throw new InvalidBackCover(b_n1);
        else
            backCover.setN1(b_n1);
    }

    /*To string method
    * @return String Data related to the book
    */
    public String toString(){
        return "\nNumber of pages: " + np + "\nwidth: " + w + "\nheight: " + h + 
            "\nNumber of lines of the Front Cover: " + frontCover.getN1() +
            "\nNumber of lines of the Back Cover: " + backCover.getN1();
    }
}