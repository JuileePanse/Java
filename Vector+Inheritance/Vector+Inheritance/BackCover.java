class BackCover{
    private String phoneNum;

    public BackCover(String phoneNum1)
    {
        phoneNum = phoneNum1;
    }

    // Access function
   // get
   public String getPhoneNum() { return phoneNum; }
   // set
   public void setPhoneNum(String phoneNum1) { phoneNum =  phoneNum1; }

   // Implementor
   public String toString() {
      return ("Phone Number: " + phoneNum);
   }
   public boolean equals(BackCover obj) {
      return (phoneNum.equals(obj.getPhoneNum()));
   }

}