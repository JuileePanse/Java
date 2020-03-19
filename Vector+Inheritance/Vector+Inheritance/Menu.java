import java.util.*;
class Menu implements Cloneable
{
   // Data members
   private Vector pages;
   private String title;
   private FrontCover frontCover= new FrontCover("", 10);
   private BackCover backCover = new BackCover("0");

   // Helping function
   private void trace(String s) {
      System.out.println(s);
   }

   // Manager function
   public Menu(String title1, String name1, int numOfDishes1, String phoneNum1, Vector pages1) {
      pages = (Vector)pages1.clone();
      title = title1;
      frontCover.setName(name1);
      frontCover.setNumOfDishes(numOfDishes1);
      backCover.setPhoneNum(phoneNum1);
   }
   public Object clone()
   {
      try 
      { 
        Menu e = (Menu)super.clone();
        e.pages = (Vector)pages.clone();
        for (int i=0; i < pages.size(); i++) {
          e.pages.setElementAt(
                  ((Page)pages.elementAt(i)).clone(), i);
        }
        return e;
      }
      catch (CloneNotSupportedException e)
      {
        // This shouldn't happen, since we are Cloneable
        return null;
      }
    }

   // Access function
   // get
   public Page getPage(int i) {
            return ((Page)pages.elementAt(i)); }
   public int getPageNum(int i) {
            return ((Page)pages.elementAt(i)).getPageNum(); }
   public Vector getPages() { return pages; }
   public int getNumOfPages() { return pages.size(); }
   
   public String getTitle(){
      return title;
   }

   public FrontCover getFrontCover(){return frontCover;}
   public BackCover getBackCover(){return backCover;}

   // set

   public void setTitle(String title1){
      title  =  title1;
   }
   public void setPage(int i, int pageNum) {
            pages.setElementAt(new Page(pageNum), i); }
   public void setPages(Vector pages1) {
      removePages();
      pages=(Vector)pages1.clone();
      for (int i=0; i < pages1.size(); i++) {
        pages.setElementAt(
               ((Page)pages1.elementAt(i)).clone(), i);
      }
   }

   public void setFrontCover(String name1, int numOfDishes1){
      frontCover.setName(name1);
      frontCover.setNumOfDishes(numOfDishes1);
   }

   public void setBackCover(String phoneNum1){
      backCover.setPhoneNum(phoneNum1);
   }


   // Implementor
   public void addPage(int pageNum) { pages.addElement(new Page(pageNum)); }
                           // Add at the end
   public void insertPage(int age, int index) {
          pages.insertElementAt(new Page(age), index); }

   public void dispPages() {
      for (int i=0; i < getNumOfPages(); i++)
         getPage(i).display();
      }
   public void removePage(int index) { pages.removeElementAt(index); }
   
   public String toString() {
      
       return pages.toString();
   }
   public boolean equals(Menu obj) {
       // The following line is not enough:
       // Need to compare one by one.
       for (int i=0; i < getNumOfPages(); i++)
          if (!getPage(i).equals(obj.getPage(i)))
             return false;
       return true;
   }
   public void removePages() {
       for (int i=0; i < getNumOfPages(); i++)
          removePage(i);
   }

}