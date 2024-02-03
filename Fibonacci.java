import java.util.Scanner;

public class Fibonacci {
    public static void main(String args[]) {
        int n1 = 0, n2 = 1, n3, i;
        int count = 10;
        System.out.println("Fibonacci seried till " + count +"terms:" );
        for (i=1; i <= count; i++)
        {
            System.out.print(n1+",");
            n3 = n2 + n1;
            n1 = n2;
            n2 = n3;
        }
    }


}


