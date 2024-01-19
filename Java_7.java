import java.util.*;
public class Java_7
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String args[])
    {
        System.out.print("Enter the number : ");
        int n=sc.nextInt();
        int arr[][]=new int[n][n];
        System.out.println();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=arr[i][i];
            sum+=arr[i][n-i-1];
        }
        if(n%2==1)
        {
            sum-=arr[n/2][n/2];
        }
        System.out.println("SUM = "+sum);
    }
}