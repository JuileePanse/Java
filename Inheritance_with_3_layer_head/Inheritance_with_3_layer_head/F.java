class F extends D
{
      // Attributes
      private int f;

      // Manager functions
      public F(int d1, int a1, int e1, int b1, int f1) { 
          super(d1,a1,e1,b1); 
          f = f1;
      }
      // Helping functions
      private void trace(String s) {
         System.out.println(s);
      }

      //Access functions 
    
      public int getF() {return f;}
      public void setF(int f1){ f = f1; }
      
      public int getD() { return super.getD(); } 
      public int getA() { return super.getBObj().getAObj().getA(); } 
      public int getE() { return super.getBObj().getEObj().getE(); }
      public int getB() { return super.getBObj().getB();}
      
    }
