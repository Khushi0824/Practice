import java.util.*;
public class Discounts
{

    public static double discount(double product)
    {
        double total=0.0;
        if(product>15000)
        {
            total=product-(product*0.2);
            System.out.println("total amount after discount = "+total);
            return total;
        }
        else if (product>5000 && product<=15000)
        {
            total=product-(product*0.1);
            System.out.println("total amount after discount = "+total);
            return total;
        }
        else
        {
            System.out.println("u have no discount  = "+total);
            return total;
        }
    }

    public static void main(String[] args)
    {
        int i;
        double product=0.0;
        int tp;
        Scanner sc = new Scanner (System.in);
        System.out.println("enter how many prices u want to enter");
        tp=sc.nextInt();
        int a[]=new int [tp];
        int b[]=new int [tp];

        System.out.println("enter the price of products ");

        for(i=0;i<tp;i++)
        {
            a[i]=sc.nextInt();
        }

        System.out.println("enter the quantity of each product");

        for(i=0;i<tp;i++)
        {
            b[i]=sc.nextInt();
        }

        for(i=0;i<tp;i++)
        {
            product=product+a[i]*b[i];
        }

        System.out.println("total amount before any discount = "+product);
        discount(product);
    }

}