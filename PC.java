import java.util.*;

public class PC {
    public static String properCompression(String s)
    {
        int i;
        StringBuilder compressedStr= new StringBuilder();
        for (i=0; i<s.length(); i+=2)
        {
            char c=s.charAt(i);
            int count=Character.getNumericValue(s.charAt(i+1));
            while (count>0)
            {
                compressedStr.append(c);
                count--;
            }
        }
        return compressedStr.toString();
    }
    public static void main(String[] args)
    {
        String inputStr="a3b5c2a3";
        String compressedResult=properCompression(inputStr);
        System.out.println(compressedResult);
    }
}