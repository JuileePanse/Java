class B {
    // Attributes
    private int b;
    private A aObj = new A(0);
    private E eObj = new E(0);

    // Manager functions
    public B(int b1, int a1, int e1) { b = b1; aObj.setA(a1); eObj.setE(e1);}
    // Helping functions
    private void trace(String s) {
       System.out.println(s);
    }

    //Access functions 
    public A getAObj() { return aObj; }
    public void setAObj(int a1) { aObj.setA(a1); }

    public E getEObj() { return eObj; }
    public void setEObj(int e1) { eObj.setE(e1); }
    
    public int getB() { return b; }
    public void setB(int b1) { b = b1; }
   
}