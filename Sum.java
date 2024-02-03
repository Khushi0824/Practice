public class Sum {
    public static void main(String args [])
    {
        int[] arr= new int[]{23,15,4,9,1};
        int sum=0;
        for(int i=0; i<arr.length; i++)
        {
            sum=sum+arr[i];
        }
        System.out.println("Sum of all elements is;"+sum);
    }
}
