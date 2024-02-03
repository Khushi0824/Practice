import java.util.Scanner;

class Matrix1
{
    int r,c,k;
    // method for ADDITION
    void add(int a[][],int b[][])

    {
        int c[][]=new int[a.length][b[0].length];
        for(int i=0;i<a.length;i++)

        {
            for(int j=0;j<=i;j++)
            {
                c[i][j]=a[i][j]+b[i][j];
                System.out.print(" "+c[i][j]);
            }
            System.out.println(" ");
        }
    }
    // method for MULTIPLICATION

    void mul(int a[][],int b[][])
    {
        int c[][]=new int[a.length][b[0].length];
        for(int i=0;i<a.length;i++)
            for(int j=0;j<=i;j++)
                for(int k=0;k<a[0].length;k++)
                    c[i][j]+=a[i][k]*b[k][j];
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<=i;j++)
                System.out.print(" "+c[i][j]);
            System.out.println(" ");
        }
    }
    void sub(int a[][],int b[][])
    {
        int c[][]=new int[a.length][b[0].length];
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<=i;j++)
            {
                c[i][j]=a[i][j]-b[i][j];
                System.out.print(" "+c[i][j]);
            }
            System.out.println(" ");
        }
    }
}

class Operations
{
    public static void main(String args[])
    {
        int z;
        Matrix m=new Matrix();
        Scanner s=new Scanner(System.in);
        int x[][]=new int[3][3];
        int y[][]=new int[3][3];
        System.out.println("Enter matrix A  ");
        for(int i=0;i<3;i++)
            for(int j=0;j<3;j++)
                x[i][j]=s.nextInt();
        System.out.println("Enter matrix B ");
        for(int i=0;i<3;i++)
            for(int j=0;j<3;j++)
                y[i][j]=s.nextInt();
        System.out.println("Enter your  choice 1> Multiplication 2>Addition 3> Subtraction");
        z=s.nextInt();
        if(z==1)
            m.mul(x,y);
        else
        if(z==2)
            m.add(x,y);
        else
        if(z==3)
            m.sub(x,y);
        else
            System.out.println("Invalid option");
    }

}








