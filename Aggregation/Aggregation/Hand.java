import java.util.*;

class Hand implements Cloneable
{
   // Data members
   private Vector fingers;
   private Palm palm = new Palm(0);

   // Helping function
   private void trace(final String s) {
      System.out.println(s);
   }

   // Manager function
   public Hand(Palm palm1, final Vector fingers1) {
      fingers=(Vector)fingers1.clone();
      palm.setSize(palm1.getSize());
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
   public Finger getFinger(final int i) { return ((Finger)fingers.elementAt(i)); }
  
   public Vector getfingers() { return fingers; }
  
   public Palm getPalm() { return palm; } 

   // predicate
   public boolean isNormal() { return getNumOffingers() == 5; }

   // Implementor
   public int getNumOffingers() { return fingers.size(); }

   public void lostOneFinger(int index){ fingers.remove(index); }
   
   public String toString() {
       StringBuffer s = new StringBuffer();
       for (int i=0; i < getNumOffingers(); i++)
          s.append("Finger"+ i +": " + getFinger(i).toString());
        return palm.toString() + "\n" + s.toString();
   }

   public boolean equals(final Hand obj) {
       for (int i=0; i < getNumOffingers(); i++)
          if (!getFinger(i).equals(obj.getFinger(i)))
             return false;
       return true;
   }
}