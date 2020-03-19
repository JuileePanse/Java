class FrontCover{
    private String name;
    private int numOfDishes;

    public FrontCover(String name1, int numOfDishes1)
    {
        name = name1;
        numOfDishes = numOfDishes1;
    }

    // Access function
   // get
   public String getName() { return name; }
   // set
   public void setName(String name1) { name =  name1; }
   // get
   public int getNumOfDishes() { return numOfDishes; }
   // set
   public void setNumOfDishes(int numOfDishes1) { numOfDishes =  numOfDishes1; }

   // Implementor
   public String toString() {
      return ("Title: " + name +"\nDishes " + numOfDishes);
   }
   public boolean equals(FrontCover obj) {
      return (name.equals(obj.getName()) && numOfDishes == obj.getNumOfDishes());
   }

}