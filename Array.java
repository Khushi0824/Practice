import java.util.Arrays;
public class Array {
    public static void main(String args[]) {
        int date=28;
        int month=2;
        int year=2001;
        int flag=0;
        int l=0;
        int valid=0;
        if(date <= 31 && month<=12 && year>=1000 && year <=9999)
        {
            flag=1;
        }
        if(flag==1)
        {
            if(year%4 ==0)
            {
                l = 1;
            }
            if(l==1)
            {
                if(month==2)
                {
                    if(date<=29)
                    {
                        valid=1;
                    }
                }
                else
                {
                    if(month==7 || month==8)
                    {
                        if(date<=31)
                        {
                            valid=1;
                        }
                    }
                    else
                    {
                        if(month%2==0 && month==7){
                            if(date<=31)
                            {
                                valid =1;
                            }
                        }
                        else{
                            if(date<=30){
                                valid=1;
                            }
                        }
                    }

                }
            }
            else{
                l=0;
                valid=1;
            }
        }
        if(valid==1){
            System.out.println("valid");
        }
        else{
            System.out.println("Not valid");
        }




    }
}

