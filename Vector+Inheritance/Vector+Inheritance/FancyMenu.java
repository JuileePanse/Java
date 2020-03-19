import java.util.*;
class FancyMenu extends Menu
{
   // Data members
   private String color; 

   // Helping function
   private void trace(String s) {
      System.out.println(s);
   }

   // Mansalaryr function
   public FancyMenu(String color1, Menu m1) {
      super(m1.getTitle(), m1.getFrontCover().getName(), m1.getFrontCover().getNumOfDishes(), m1.getBackCover().getPhoneNum(), m1.getPages());
      color = color1; 
      //trace("constructor");
   }

   // Access function
   // get
   public String getColor() { return color; }
   // set
   public void setColor(String color1) { color =  color1;}

   public String toString() {
      // StringBuffer s = new StringBuffer();
      // for (int i=0; i < getNumOfPets(); i++)
      //   s.append(getPet(i).toString());
      // return s.toString();
      return "Fancy Menu  = " + color + "\n" + super.toString();
   }
   public boolean equals(FancyMenu obj) {
      return (color == obj.getColor() &&
              super.equals((Menu)obj));
   }
}