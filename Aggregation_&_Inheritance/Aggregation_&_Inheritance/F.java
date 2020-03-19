class F implements Cloneable{
    // Attributes
    private int f=0;
 
    // Manager functions
    public F(int f1) { f = f1; }
    
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
    
    // Helping functions
    private void trace(String s) {
       System.out.println(s);
    }
 
    //Access functions 
    public int getF() { return f; }
    public void setF(int f1) { f = f1; }
    
 }