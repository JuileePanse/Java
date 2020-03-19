public class Demo {
    public static void main (String argv[]) 
    {
       E eObj = new E(4,3,1,2,5);
       System.out.println("Value of a: "+eObj.getA());
       System.out.println("Value of b: "+eObj.getB());
       System.out.println("Value of d: "+eObj.getDObj().getD());
       System.out.println("Value of e: "+eObj.getE());
       System.out.println("Value of f: "+eObj.getF());
    }
 }