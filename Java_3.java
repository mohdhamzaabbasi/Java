import java.util.*;
public class Java_3
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String args[])
    {
        int arr[]={2,4,5,6,7,8,9};
        int arr2[]={0,0,0,0,0,0,0};
        int n=arr.length;
        for(int i=1;i<n-1;i++)
        {
            int lh=arr[i],rh=arr[i];
            for(int j=i;j>=0;j--)
            {
                if(arr[j]>lh)
                {
                    lh=arr[j];
                }
            }
            for(int j=i;j<n;j++)
            {
                if(arr[j]>rh)
                {
                    rh=arr[j];
                }
            }
            int m=Math.min(lh,rh);
            if(arr[i]<lh&&arr[i]<rh)
            {
                arr2[i]=m-arr[i];
            }
        }
        int sum=0;
        for(int i=0;i<n;i++)
        {
            System.out.print(arr2[i]);
            sum+=arr2[i];
        }
        System.out.println("\n"+sum);
    }
}