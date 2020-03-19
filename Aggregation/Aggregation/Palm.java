import java.util.*;
import java.lang.*;
import java.io.*;
// Palm.java
class Palm implements Cloneable
{
   // Data members
   private int size=0;

   // Helping function
   private void trace(String s) {
      System.out.println(s);
   }

   public Palm(int size1) {
      size = size1;
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
   public boolean isLarge() { return size > 50; } // A palm is large if 
                                                  // size is larger than 50
   public int getSize() { return size; }
   public void setSize(int size1) { size = size1; }


   

   // Implementor
   public void enlarge(int sizeInc) { size += sizeInc; }
   public void shrink(int sizeDec) { size -= sizeDec; }
   
   public void display() {
      System.out.println(size);
   }
   public String toString() {
      return ("Size of Palm is: " + size);
   }
   public boolean equals(Palm obj) {
      return (size == obj.size);
   }

};