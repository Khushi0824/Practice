import java.util.Scanner;
import java.util.*;
import java.util.Arrays;

public class Linearsearch {
    public static int linearSearch(   int arr[], int key)
    {
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]== key)
            {
                return i;
            }
        }
        return -1;
    }

    public static void main(String arr[])
    {
        int a[]={1,2,3,4,5,6,7,8,9,10};
        int key=5;
        System.out.println(key+" is found at index:"+linearSearch(a,key));


    }
}
