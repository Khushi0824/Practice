import java.util.*;
import java.util.Scanner;


public class Discount {
    public static void main(String args[])
    {
        String Item[]=new String[]{ };
        int Price[]=new int[]{};
        int Qty[]= new int[]{};
        double Quantity, price, Amount,Discount;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the price of the product:");
        price=sc.nextDouble();
        System.out.println("Enter the Quantity: ");
        Quantity=sc.nextDouble();
        Amount=Quantity * price;

        if(Amount>10000)
        {
            Discount=Amount*0.10;
            Amount=Amount-Discount;
            System.out.println("Total amount after discount is :"+Amount);
        }
        else if (Amount>5000)
        {
            Discount=Amount*0.05;
            Amount=Amount-Discount;
            System.out.println("Total amount after discount is :"+Amount);
        }
        else
        {
            Discount=0.0;
            Amount=Amount-Discount;
            System.out.println("Total amount after discount is :2"+Amount);
        }


    }
}
