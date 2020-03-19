import java.util.*;
import java.lang.*;
import java.io.*;
// Finger.java
class Finger implements Cloneable
{
   // Data members
   private int len=0;

   // Helping function
   private void trace(String s) {
      System.out.println(s);
   }

   public Finger(int len1) {
      len=len1;
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
   public int getlen() { return len; }
   // set
   public void setlen(int len1) { len =  len1; }
   public void setFinger(Finger Finger1) { len =  Finger1.getlen(); }
   

   // Implementor
   public void enlarge(int lenInc) { len += lenInc; }
   public void shrink(int lenDec) { len -= lenDec; }
   
   public void display() {
      System.out.println(len);
   }
   public String toString() {
      return ("Length of Finger is : " + len + "\n");
   }
   public boolean equals(Finger obj) {
      return (len == obj.len);
   }

};