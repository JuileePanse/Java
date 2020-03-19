public class Demo {
    public static void main (String argv[]) 
    {
       F fObj = new F(1,3,4,2,5);
       printValues(fObj);
      
       fObj.setBObj(6, 4, 7);
       fObj.setD(1);
       fObj.setF(5);

       System.out.println("\nValues after changing ");
       printValues(fObj);
   }

   public static void printValues(F fObj)
    {
      System.out.println("Value of a: "+fObj.getA());
      System.out.println("Value of d: "+fObj.getD());
      System.out.println("Value of b: "+fObj.getB());
      System.out.println("Value of e: "+fObj.getE());
      System.out.println("Value of f: "+fObj.getF());
    }
 }