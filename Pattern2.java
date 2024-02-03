public class Pattern2
{
    public static void main(String[] args)
    {
        int rows=7;
//inner loop
        for (int i= rows-1; i>=0 ; i--)
        {
//outer loop
            for (int j=0; j<=i; j++)
            {
//prints star and space
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}