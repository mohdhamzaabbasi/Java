import java.util.*;
public class Java_14
{
    static Scanner sc=new Scanner(System.in);
    static void check(int arr[],int n)
    {
        if(n==0)
        {
            System.out.println("SORTED");
            return;
        }
        if(arr[n]<arr[n-1])
        {
            System.out.println("Unsorted");
            return;
        }
        check(arr,n-1);
    }
    public static void main(String args[])
    {
        int arr[]={1,3,4,5,6};
        int n=arr.length;
        check(arr,n-1);
    }
}