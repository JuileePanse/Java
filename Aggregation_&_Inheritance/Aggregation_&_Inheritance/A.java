class A {
    // Attributes
    private int a;
    private B bObj = new B(0);
    private F fObj = new F(0);

    // Manager functions
    public A(int a1, int b1, int f1) { a = a1; bObj.setB(b1); fObj.setF(f1);}
    // Helping functions
    private void trace(String s) {
       System.out.println(s);
    }

    //Access functions 
    public B getBObj() { return bObj; }
    public void setBObj(int b1) { bObj.setB(b1); }

    public F getFObj() { return fObj; }
    public void setFObj(int f1) { fObj.setF(f1); }
    
    public int getA() { return a; }
    public void setA(int a1) { a = a1; }
   
}