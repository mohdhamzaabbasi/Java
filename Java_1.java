import java.util.*;
public class Java_1
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String args[])
    {
        int arr[]={1,2,3,4,5};
        int n=arr.length;
        int prefix[]=new int[n];
        prefix[0]=arr[0];
        for(int i=1;i<n;i++)
        {
            prefix[i]=prefix[i-1]+arr[i];
        }
        System.out.print("PREFIX ARRAY--> ");
        for(int i=0;i<n;i++)
        {
            System.out.print(prefix[i]+"\t");
        }
        System.out.println();
        int max=arr[0],min=arr[0];
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                int t=0;
                if(i==0)
                {
                    t=prefix[j];
                }
                else
                {
                    t=prefix[j]-prefix[i-1];
                }
                System.out.println(t);
                if(t>max)
                {
                    max=t;
                }
                if(t<min)
                {
                    min=t;
                }
            }
        }
        System.out.println("MAX = "+max+"\nMIN = "+min);
    }
}