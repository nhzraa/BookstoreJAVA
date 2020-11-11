public class Bookstore
{
   private String Category;
   private double Price;

   public Bookstore() //constructor to declare @ initialize
   {
       Category=" ";
       Price=0.00;
   }
   
   public Bookstore(String c) //constructor to declare @ initialize
   {
       Category=c;
       Price=0.00;
   }
   
   public Bookstore(String c, double p) //constructor to declare @ initialize
   {
       Category=c;
       Price=p;
   }
   
   public String getCategory()
   {
       return Category;
   }
   
   public double getPrice()
   {
       return Price;
   }
   
}
