import java.util.*;
import java.util.Scanner;


public class Numbers {
    public static int add(int a, int b)
    {
        int c=0;
        c=a+b;
        System.out.println("Sum:"+c);
        return c;
    }
    public static int diff(int a, int b)
    {
        int c=0;
        c=a-b;
        System.out.println("Difference:"+c);
        return c;
    }
    public static int product(int a, int b)
    {
        int c=0;
        c=a*b;
        System.out.println("Product:"+c);
        return c;
    }
    public static int div(int a, int b)
    {
        int c=0;
        c=a/b;
        System.out.println("Divide:"+c);
        return c;
    }
    public static void main(String args[])
    {
        int a,b;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number:");
        a= sc.nextInt();
        System.out.println("Enter number:");
        b= sc.nextInt();
        Numbers obj= new Numbers();
        obj.add(a,b);
        obj.diff(a,b);
        obj.product(a,b);
        obj.div(a,b);

    }
}
