public class Pattern4
{
    public static void main(String args[])
    {
        int i, j,number, n=5;
        for(i=0; i<n; i++)
        {
            number=1;
            for(j=0; j<=i; j++)
            {
//prints num
                System.out.print(number+ " ");
//incrementing the value of number
                number++;
            }
            System.out.println();
        }
    }
}
