import java.util.Scanner;

public class FibonacciSeries  {
    public static void main(String args[]) {
       int n1=0, n2=1, n3, i;
       int count=10;
       System.out.println("Fibonacci series till" + count + "terms is: ");
       for(i=1; i<=count; i++)
       {
           System.out.print(n1+ ",");
           n3=n1+n2;
           n1=n2;
           n2=n3;

       }
    }


}


