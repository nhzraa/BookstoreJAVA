import java.util.*;

public class Bstore
{
    public static void main(String a[])
    {
        Scanner s=new Scanner(system.in);
        
        for(int i=0; i<5; i++)
        {
            system.out.println("Enter book category: ");
            String category[i] =s.next();
        
            System.out.println("Enter price of the book: RM");
            String price[i] =s.next();
        }
        
        for(int i=0; i<5; i++)
        {
            if (category[i]=='Academic')
            {
                if (price[i]<20)
                {
                    nPrice=price*0.95;
                }
            
                else if (price[i]>=20 && price[i]<=100)
                {
                    nPrice=price*0.90;
                }
            
                else if (price[i]>100)
                {
                    nPrice=price*0.80;
                }
                
                totalA=totalA+1;
                newA=newA+nPrice;
            }
        
            else if (category[i]=='Pre-School')
            {
                if (price[i]<50)
                {
                    nPrice=price*0.85;
                }
            
                else if (price[i]>=50)
                {
                    nPrice=price*0.75;
                }
                
                totalP=totalP+1;
                newP=newP+nPrice;
            }
        
            else if (category[i]=='General')
            {
                if (price[i]>0)
                {
                    nPrice=price*0.90;
                }
                
                totalG=totalG+1;
                newG=newG+nPrice;
            }
        }
        
        System.out.println("Num of book bought for Academic = "+totalA);
        System.out.println("Total net price for Academic = RM"+newA);
        
        System.out.println("Num of book bought for Pre-School = "+totalA);
        System.out.println("Total net price for Pre-School = RM"+new);
        
        System.out.println("Num of book bought for Academic = "+totalA);
        System.out.println("Total net price for Academic = RM"+newA);
}
