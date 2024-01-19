import java.util.*;
public class Java_11
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String args[])
    {
        int a=3;
        int ans=1;
        int p=6;
        while(p!=0)
        {
            if((p&1)==1)
            {
                ans*=a;
            }
            a=a*a;
            p=p>>1;
        }
        System.out.println(ans);
    }
}
