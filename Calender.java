import java.util.Scanner;

public class Calender {
    public static void main(String args[])
    {
        int key;
        int day;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter today's day:");
        day= sc.nextInt();
        System.out.println("After ");
        key=sc.nextInt();
        int r=key%7;
        int x=r+day;

        switch(x)
        {
            case 1:
            {
                System.out.println("It's Monday today");
                break;
            }
            case 2:
            {
                System.out.println("It's Tuesday today");
                break;
            }
            case 3:
            {
                System.out.println("It's Wednesday today");
                break;
            }
            case 4:
            {
                System.out.println("It's Thursday today");
                break;
            }
            case 5:
            {
                System.out.println("It's Friday today");
                break;
            }
            case 6:
            {
                System.out.println("It's Saturday today");
                break;
            }
            case 7:
            {
                System.out.println("It's Sunday today");
                break;
            }
        }



    }
}
