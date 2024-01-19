import java.util.*;
public class Java_5
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String args[])
    {
        int arr[]={1,4,1,3,2,4,3,7};
        int n=arr.length;
        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        int arr2[]=new int[max-min+1];
        int n2=arr2.length;
        for(int i=0;i<n2;i++)
        {
            arr2[i]=0;
        }
        for(int i=0;i<n;i++)
        {
            arr2[arr[i]-min]++;
        }
        System.out.print("Frequency Array -->");
        for(int i=0;i<n2;i++)
        {
            System.out.print(arr2[i]+"\t");
        }
        System.out.println();
        int k=0;
        for(int i=0;i<n;i++)
        {
            if(arr2[k]==0)
            {
                k++;
            }
            arr[i]=k+min;
            arr2[k]--;
        }
        System.out.print("Sorted Array --> ");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
    }
}