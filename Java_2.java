import java.util.*;
public class Java_2
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String args[])
    {
        int arr[]={1,2,3,4,5};
        int n=arr.length;
        int ms=Integer.MIN_VALUE;
        int cs=0;
        for(int i=0;i<n;i++)
        {
            cs=cs+arr[i];
            if(cs<0)
            {
                cs=0;
            }
            if(ms<cs)
            {
                ms=cs;
            }
        }
        System.out.println(ms);
    }
}