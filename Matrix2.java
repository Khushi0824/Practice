import jdk.internal.icu.impl.CharacterIteratorWrapper;

import java.util.*;
import java.util.Scanner;

public class Matrix2
{
    int c[][] = new int[3][3];
    public void display_normal(){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(c[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
    public void display_bottom_left_triangle(){
        for(int i=0;i<3;i++){
            for(int j=0;j<=i;j++){
                System.out.print(c[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
    public void display_top_left_triangle(){
        for(int i=0;i<3;i++){
            for(int j=0;j<3-i;j++){
                System.out.print(c[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
    public void display_top_right_triangle(){
        for(int i=0;i<3;i++){
            for(int k=0;k>i;i++){
                System.out.print(" ");
            }
            for(int j=i;j<3;j++){
                System.out.print(" "+c[i][j]);
            }
            System.out.println(" ");

        }
    }

    public void display_bottom_right_triangle(){
        for(int i=0;i<3;i++){
            for(int k=2;k>i;k--){
                System.out.print(" ");
            }
            for(int j=2;j>=2-i;j--){
                System.out.print(" "+c[i][j]);
            }
            System.out.println(" ");
        }
    }
    public void add(int a[][],int b[][]){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                c[i][j] = a[i][j] + b[i][j];

            }

        }
    }
    public void subtract(int a[][],int b[][]){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                c[i][j] = a[i][j] - b[i][j];

            }

        }
    }
    public void division(int a[][],int b[][]){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                c[i][j] = a[i][j] / b[i][j];

            }

        }
    }
    public void multiple(int a[][],int b[][]){
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                c[i][j] = 0;
                for(int k=0;k<2;k++){
                    c[i][j] = c[i][j] + a[i][k] * b[k][j];
                }

            }

        }
    }
    public static void main(String args[])
    {
        int z;
        String operator;
        Matrix2 obj=new Matrix2();
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
        System.out.println("Enter the operator");
        Scanner sc= new Scanner(System.in);
        operator = sc.next();
        switch(operator){
            case "+" :
                obj.add(x,y);
                break;
            case "-" :
                obj.subtract(x,y);
                break;
            case "*" :
                obj.multiple(x,y);
                break;
            case "/" :
                obj.division(x,y);
                break;
        }
        obj.display_bottom_right_triangle();
        System.out.println(" ");
        obj.display_bottom_left_triangle();
        System.out.println(" ");
        obj.display_top_left_triangle();
        System.out.println(" ");
        obj.display_top_right_triangle();

    }
}