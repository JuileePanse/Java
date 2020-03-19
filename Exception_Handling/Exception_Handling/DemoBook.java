public class DemoBook {
   public static void main(String argv[]) {
      try {
         Book book1 = new Book(200, 3, 4, 5, 6);
         System.out.println(book1.toString());

      } catch (InvalidFrontCover n) {
         System.out.println(
               "\nError " + n.getCode() + ": " + "Number of lines for front cover  " + n.getL() + " is more than 10");
      } catch (InvalidBackCover n) {
         System.out.println(
               "\nError " + n.getCode() + ": " + "Number of lines for back cover  " + n.getL() + " is more than 10");
      } catch (SquareBook n) {
         System.out.println("\nError " + n.getCode() + ": " + "Book's width " + n.getSide()
               + " is equal to book's height" + n.getSide());
      } catch (EmptyBook n) {
         System.out.println("\nError " + n.getCode() + ": " + "Number of pages of book " + n.getNp()
               + " is less than or equal to 0");
      } finally {
         System.out.println("end");
         System.out.println("==============================================");
      }

      try {
         Book book2 = new Book(300, 4, 4, 4, 5);
         System.out.println(book2.toString());

      } catch (InvalidFrontCover n) {
         System.out.println(
               "\nError " + n.getCode() + ": " + "Number of lines for front cover  " + n.getL() + " is more than 10");
      } catch (InvalidBackCover n) {
         System.out.println(
               "\nError " + n.getCode() + ": " + "Number of lines for back cover  " + n.getL() + " is more than 10");
      } catch (SquareBook n) {
         System.out.println("\nError " + n.getCode() + ": " + "Book's width " + n.getSide()
               + " is equal to book's height" + n.getSide());
      } catch (EmptyBook n) {
         System.out.println("\nError " + n.getCode() + ": " + "Number of pages of book " + n.getNp()
               + " is less than or equal to 0");
      } finally {
         System.out.println("end");
         System.out.println("==============================================");
      }

      try {
         Book book3 = new Book(435, 5, 7, 5, 6);
         System.out.println(book3.toString());

      } catch (InvalidFrontCover n) {
         System.out.println(
               "\nError " + n.getCode() + ": " + "Number of lines for front cover  " + n.getL() + " is more than 10");
      } catch (InvalidBackCover n) {
         System.out.println(
               "\nError " + n.getCode() + ": " + "Number of lines for back cover  " + n.getL() + " is more than 10");
      } catch (SquareBook n) {
         System.out.println("\nError " + n.getCode() + ": " + "Book's width " + n.getSide()
               + " is equal to book's height" + n.getSide());
      } catch (EmptyBook n) {
         System.out.println("\nError " + n.getCode() + ": " + "Number of pages of book " + n.getNp()
               + " is less than or equal to 0");
      } finally {
         System.out.println("end");
         System.out.println("==============================================");
      }
   }

}