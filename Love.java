

import java.util.Scanner;

public class Love {

    public static void main(String[] args) {
        float count=0f;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name1: ");
        String sr1 = sc.nextLine();
        System.out.print("Enter name2: ");
        String sr2 = sc.nextLine();

        char a[] = sr1.toCharArray();
        char b[] = sr2.toCharArray();
        StringBuilder sb = new StringBuilder(sr2);
        try
        {
            for(int i=0;i<a.length;i++)
            {
                for(int j=0;j<b.length;j++)
                {
                    if(a[i]==b[j])
                    {
                        count++;
                        sb.deleteCharAt(j);
                    }
                }
            }
        }
        catch(StringIndexOutOfBoundsException e) {
            float total = (a.length+b.length);
            float percent = (count/total)*100;

            System.out.println("Percentage is: "+percent);
        }

    }

}