class A implements Cloneable{
    // Attributes
    private int a=0;
 
    // Helping functions
    private void trace(String s) {
        System.out.println(s);
     }

    // Manager functions
    public A(int a1) { a = a1; }
    
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
    public boolean isLargeValue(){ return a > 100; }
 
    //Access functions 
    public int getA() { return a; }
    public void setA(int a1) { a = a1; }
    
 }