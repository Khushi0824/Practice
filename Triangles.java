import java.util.*;
class A extends B
{
    void Scaline(int x,int y,int z)
    {
        if (x!=y && y!=z && z!=x)
        {
            System.out.print("its Scaline triangle");
        }
    }

}
class B
{
    void Isosceles(int x,int y,int z){
        if ((x == y || y == z || z == x) && (x!=y || y!=z || z!=x) )
        {
            System.out.println("Isosceles Triangle");
        }
    }

}
class C extends A
{
    void equalteral(int x,int y,int z){
        if (x == y && y == z && z==x )
        {
            System.out.println("its equalteral traingle");
        }
    }

}

public class Triangles
{
    public static void main(String[] args)
    {
        int x,y,z;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 1st side of the triangle");
        x=sc.nextInt();
        System.out.println("enter 2nd side of the triangle");
        y=sc.nextInt();
        System.out.println("enter 3rd side of the triangle");
        z=sc.nextInt();

        C obj = new C();
        obj.equalteral(x,y,z);
        obj.Scaline(x,y,z);
        obj.Isosceles(x,y,z);


    }
}