class E implements Cloneable{
    // Attributes
    private int e=0;
 
   // Helping functions
   private void trace(String s) {
      System.out.println(s);
   }

    // Manager functions
    public E(int e1) { e = e1; }
    
    public Object clone() 
    {
       try 
       { return super.clone(); 
       }
       catch (CloneNotSupportedException e)
       {
          // This shouldn't happen, since we are Cloneable
          return null;
       }
    }
    
    //Predicate
    public boolean isLargeValue(){ return e > 100; }
 
    //Access functions 
    public int getE() { return e; }
    public void setE(int e1) { e = e1; }
    
 }