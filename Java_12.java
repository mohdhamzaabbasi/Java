import java.util.*;
public class Java_12
{
    static Scanner sc=new Scanner(System.in);
    static void print(int n)
    {
        if(n==0)
        {
            return;
        }
        System.out.println(n);
        print(n-1);
    }
    public static void main(String args[])
    {
        System.out.println("Enter the value of n : ");
        int n=sc.nextInt();
        print(n);
    }
}
