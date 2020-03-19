class B implements Cloneable{
    // Attributes
    private int b=0;
 
    // Manager functions
    public B(int b1) { b = b1; }
    
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
    public int getB() { return b; }
    public void setB(int b1) { b = b1; }
    
 }