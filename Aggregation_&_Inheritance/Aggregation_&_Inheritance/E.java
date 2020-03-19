class E extends A
{
      // Attributes
      private int e;
      private D dObj = new D(0);

      // Manager functions
      public E(int a1,int b1,int f1, int e1, int d1) { 
          super(a1,b1,f1);e = e1;dObj.setD(d1);
      }
      // Helping functions
      private void trace(String s) {
         System.out.println(s);
      }

      //Access functions 
      public D getDObj() { return dObj; }
      public void setDObj(int d1) { dObj.setD(d1); }
      
      public int getE() {return e;}
      public void setE(int e1){e=e1;}
      
      public int getA() { return super.getA(); } 
      public int getB() {return getBObj().getB(); }
     
      public void setA(int a1) { super.setA(a1); }
      public void setB(int b1) { getBObj().setB(b1); } 

      public int getF() { return super.getFObj().getF(); }
      public void setF(int f1) { super.getFObj().setF(f1); }
}
