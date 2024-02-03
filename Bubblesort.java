import java.util.*;

public class Bubblesort {
    static void sort(int arr[], int n)
    {
        int i, j, temp;
        boolean swapped;
        for(i=0; i<n-1; i++)
        {
            swapped= false;
            for(j=0; j<n-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    temp=arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]=temp;
                    swapped=true;
                }
            }
            if(swapped==false)
                break;

        }
    }
    static void printArray(int arr[], int size)
    {
        int i;
        for(i=0; i<size; i++)
            System.out.print(arr[i]+" ");
    }
    public static void main(String args[])
    {
        int arr[]={12,56,1,-1,90,26,-20};
        int n= arr.length;
        sort(arr,n);
        System.out.print("Sorted array is:");
        printArray(arr,n);
    }

}
