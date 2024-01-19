import java.util.*;
public class Java_13
{
    static Scanner sc=new Scanner(System.in);
    static int print(int n)
    {
        if(n==1)
        {
            return 0;
        }
        if(n==2)
        {
            return 1;
        }
        return(print(n-1)+print(n-2));
    }
    public static void main(String args[])
    {
        System.out.println("Enter the value of n : ");
        int n=sc.nextInt();
        System.out.println(print(n));
    }
}
