public class Singleton {
    // Create a singleton object at the beginning
    private static Singleton singleton = new Singleton( );
    
    /* A private Constructor prevents any other 
     * class from instantiating.
     */
    private Singleton(){ }
    
    /* Static 'instance' method */
    public static Singleton getInstance( ) {
       return singleton;
    }
    /* Other methods protected by singleton-ness */
    protected static void demoMethod( ) {
       System.out.println("\n\nMethod for singleton\n\n"); 
    }
 }
     
