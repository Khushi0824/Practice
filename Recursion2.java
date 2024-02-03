public class Recursion2 {
    public static int factorial(int n)
    {
        if(n==1 || n==0)
        {
            return 1;
        }
        int fact_num= factorial(n-1);
        int fact_n=n*fact_num;
        return fact_n;

    }
    public static void main(String args[])
    {
        int n=6;
        int fact= factorial(n);
        System.out.println(fact);
    }
}
