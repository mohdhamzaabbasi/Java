public class RemDup
{
    public static int rem(int n)    
    {
        if(n<=2)
        {
            return n;
        }
        return (rem(n-1)+(n-1)*rem(n-2));
    }
    public static void main(String[]args)
    {
        System.out.println(rem(0));
        System.out.println(rem(1));
        System.out.println(rem(2));
        System.out.println(rem(3));
        System.out.println(rem(4));
        System.out.println(rem(5));
        System.out.println(rem(6));
    }
}
