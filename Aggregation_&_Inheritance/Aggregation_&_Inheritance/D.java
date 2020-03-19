class D implements Cloneable{
    // Attributes
    private int d=0;
 
    // Manager functions
    public D(int d1) { d = d1; }
    
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
    public int getD() { return d; }
    public void setD(int d1) { d = d1; }
    
 }