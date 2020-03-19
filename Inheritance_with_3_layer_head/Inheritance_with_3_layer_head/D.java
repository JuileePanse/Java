class D {
    // Attributes
    private int d;
    private B bObj = new B(0, 0, 0);

    // Manager functions
    public D(int d1, int a1, int e1, int b1) { 
        d = d1; 
        bObj.getAObj().setA(a1);
        bObj.getEObj().setE(e1);
        bObj.setB(b1);
    }
    // Helping functions
    private void trace(String s) {
       System.out.println(s);
    }

    //Access functions 
    public B getBObj() { return bObj; }
    
    public void setBObj(int a1, int e1, int b1) { 
        bObj.getAObj().setA(a1);
        bObj.getEObj().setE(e1);
        bObj.setB(b1);
     }
    
    public int getD() { return d; }
    public void setD(int d1) { d = d1; }
   
}