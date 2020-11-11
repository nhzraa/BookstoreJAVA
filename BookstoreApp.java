import java.util.*;

public class BookstoreApp
{
   public static void main(String a[])
   {
       Bookstore[] b = new Bookstore[5];
       Scanner s=new Scanner(System.in);
       double nPrice=0.00, newA=0.00, newP=0.00, newG=0.00;
       int totalA=0, totalP=0, totalG=0;
      
      for(int i=0; i<5; i++)
        {
            System.out.println("Enter book category: ");
            String Category=s.next();
            b[i]=new Bookstore(Category);
            
            if(b[i].getCategory().equalsIgnoreCase("Quit"))
            {
                i=6;
                System.out.println(" ");
            }
        
            else
            {
                System.out.println("Enter price of the book: RM");
                double Price=s.nextDouble();
                b[i]=new Bookstore(Category,Price);
                System.out.println(" ");
            }
            
            if(i<5)
            {
            if (b[i].getCategory().equalsIgnoreCase("Academic"))
            {
                if (b[i].getPrice()<20)
                {
                    nPrice=b[i].getPrice()*0.95;
                }
            
                else if (b[i].getPrice()>=20 && b[i].getPrice()<=100)
                {
                    nPrice=b[i].getPrice()*0.90;
                }
            
                else if (b[i].getPrice()>100)
                {
                    nPrice=b[i].getPrice()*0.80;
                }
                
                totalA=totalA+1;
                newA=newA+nPrice;
            }
        
            else if (b[i].getCategory().equalsIgnoreCase("Pre-School"))
            {
                if (b[i].getPrice()<50)
                {
                    nPrice=b[i].getPrice()*0.85;
                }
            
                else if (b[i].getPrice()>=50)
                {
                    nPrice=b[i].getPrice()*0.75;
                }
                
                totalP=totalP+1;
                newP=newP+nPrice;
            }
        
            else if (b[i].getCategory().equalsIgnoreCase("General"))
            {
                if (b[i].getPrice()>0)
                {
                    nPrice=b[i].getPrice()*0.90;
                }
                
                totalG=totalG+1;
                newG=newG+nPrice;
            }
        }
        }
          
        if(totalA>0)
        {
          System.out.println("Num of book bought for Academic = "+totalA);
          System.out.println("Total net price for Academic = RM"+String.format("%.2f",newA));
          System.out.println(" ");
        }
        
        if (totalP>0)
        {
          System.out.println("Num of book bought for Pre-School ="+totalP);
          System.out.println("Total net price for Pre-School = RM"+String.format("%.2f",newP));
          System.out.println(" ");
        }
        
        if(totalG>0)
        {
          System.out.println("Num of book bought for General ="+totalG);
          System.out.println("Total net price for General = RM"+String.format("%.2f",newG));
        }
            
      }
}
