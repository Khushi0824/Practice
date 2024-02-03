import java.util.Scanner;

public class Reverse {
    public static void main(String args[])
    {
        int n,r=0,rem;
        System.out.println("Enter the number");
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        while(n>0)
        {
            rem=n%10;
            r=r*10+rem;
            n=n/10;
        }
        System.out.println("The reverse of the given number is:"+r);
    }

}
