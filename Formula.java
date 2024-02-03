import java.util.Scanner;

public class Formula
{
    public static void main(String[] args)
    {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter choice: ");
        System.out.print("1.D & T :speed?\n 2.time?\n 3.S&T :distance\n");
        int ch=sc.nextInt();

        switch(ch)
        {
            case 1:
            {
                float s ;
                System.out.println("Enter distance(km):");
                int d=sc.nextInt();
                System.out.println("Enter time(h):");
                int t=sc.nextInt();
                s=d/t;
                System.out.println("Speed calculated(km/h): "+s);
                break;
            }
            case 3:
            {
                float d;
                System.out.println("Enter speed(km/h):");
                int s=sc.nextInt();
                System.out.println("Enter time(h):");
                int t=sc.nextInt();
                d=(s*t);
                System.out.println(" Distance calculated(km): "+d);
                break;
            }
            case 2:
            {
                float t ;
                System.out.println("Enter distance(km):");
                int d=sc.nextInt();
                System.out.println("Enter speed(km/h):");
                int s=sc.nextInt();
                t=d/s;
                System.out.println(" Time calculated(h):" +t);
                break;
            }
        }
    }
}