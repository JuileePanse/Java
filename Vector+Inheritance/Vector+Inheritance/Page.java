import java.util.*;
import java.lang.*;
import java.io.*;

class Page implements Cloneable
{
   // Data members
   private int pageNum=0;

   // Helping function
   private void trace(String s) {
      System.out.println(s);
   }

   // Manager function
   public Page(int pageNum1) {
      pageNum = pageNum1;
   }
   public Object clone() {
      try
      { 
         return super.clone();
      }
      catch (CloneNotSupportedException e)
      {
         // This shouldn't happen, since we are Cloneable
         return null;
      }
   }

   // Access function
   // get
   public int getPageNum() { return pageNum; }
   // set
   public void setPageNum(int pageNum1) { pageNum =  pageNum1; }
   public void setPage(Page page1) { pageNum =  page1.getPageNum(); }

   public void display() {
      System.out.println("Page Num: " + pageNum);
   }

   // Implementor
   public String toString() {
      return ("PageNum: " + pageNum + "\n");
   }
   public boolean equals(Page obj) {
      return (pageNum == obj.pageNum);
   }

};