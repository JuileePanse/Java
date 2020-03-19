import java.util.*;
public class Demo {
    public static void main (String argv[])
    {
       //Menu 1
       Vector pages1 = new Vector();
       for(int i = 1; i <= 3; i++){
         pages1.addElement(new Page(i));
       }
       
       Menu menu1 = new Menu("Chineese Food", "Forbidden City" , 123, "408-123-4356", pages1);
       FancyMenu fancyMenu1  = new FancyMenu("Black", menu1);
       printMenu(fancyMenu1);

       //Menu 2
       Vector pages2 = new Vector();
       for(int i = 1; i <= 4; i++){
         pages2.addElement(new Page(i));
       }

       Menu menu2 = new Menu("Mexican Food", "Taco Bell" , 46, "510-123-4567", pages1);
       FancyMenu fancyMenu2  = new FancyMenu("Red", menu2);
       printMenu(fancyMenu2);
    }

   static void printMenu(FancyMenu f) {
         System.out.println("\n============================================================");
         System.out.println("Title: " + f.getTitle());
         System.out.println("Front Cover: \n" + f.getFrontCover().toString() + "\n");
         System.out.println("Back Cover: \n" + f.getBackCover().toString() + "\n");
         System.out.println("Total Number of pages: " + f.getNumOfPages());
         f.dispPages();
         System.out.println("\nColor: " + f.getColor());
    }
 }