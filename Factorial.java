import java.util.Scanner;

public class Factorial {
    public static void main(String args[])
    {
        int i, fact=1;
        int n;
        System.out.println("Enter the number:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=1; i<=n; i++ )
        {
            fact=fact*i;
        }
        System.out.println("Factorial of a number is: "+fact);
        if(n<0)
        {
            System.out.println("Invalid input");
        }
    }

}
