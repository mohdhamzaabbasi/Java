import java.util.*;
public class Java_4
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String args[])
    {
        int arr[]={2,4,5,6,7,8,9};
        int n=arr.length;
        int max=0;
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(arr[j]-arr[i]>max)
                {
                    max=arr[j]-arr[i];
                }
            }
        }
        System.out.println(max);;
    }
}