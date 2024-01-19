import java.util.*;
public class Java_6
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String args[])
    {
        System.out.print("Enter the number : ");
        int n=sc.nextInt();
        int arr[][]=new int[n][n];
        System.out.println();
        int counter=1;
        for(int i=0;i<(n+1)/2;i++)
        {
            for(int j=i;j<n-i;j++)
            {
                arr[i][j]=counter++;
            }
            for(int j=i+1;j<n-i;j++)
            {
                arr[j][n-i-1]=counter++;
            }
            for(int j=n-i-2;j>=i;j--)
            {
                arr[n-i-1][j]=counter++;
            }
            for(int j=n-i-2;j>i;j--)
            {
                arr[j][i]=counter++;
            }
        }
        System.out.println("Matrix :-");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
}