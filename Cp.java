import java.util.*;
class Cp
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[]args)
    {
        int n=sc.nextInt();
        int m=sc.nextInt();
        int arr[]=new int[n];
        int rep[]=new int[m];
        if(n==0)
        {
            System.out.println("NULL");
            return;
        }
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        if(m!=0)
        {
            for(int i=0;i<m;i++)
            {
                rep[i]=sc.nextInt();
            }
            for(int i=0;i<n;i++)
            {
                int max2=-1;
                for(int k=0;k<m;k++)
                {
                    if(rep[k]>max2)
                    {
                        max2=k;
                    }
                }
                if(arr[i]<rep[max2])
                {
                    arr[i]=rep[max2];
                    rep[max2]=-1;
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}