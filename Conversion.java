import java.util.*;

class Conversion {
    static void decToBin(int n){
        int[] binaryNum=new int[1000];
        int i=0;
        while(n>0)
        {
            binaryNum[i]=n%2;
            n=n/2;
            i++;
        }
        for(int j=i-1; j>=0; j--)
        {
            System.out.print(binaryNum[j]);
        }
    }
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Decimal number to be converted:");
        n=sc.nextInt();
        System.out.print("Binary number is:");
        decToBin(n);
    }
}
