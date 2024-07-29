public class Fibonacci 
{
    public static int nth(int n)
    {
        if(n<2)
        {
            return n;
        }
        return (nth(n-1)+nth(n-2));
    }    
    public static void main(String[]args)
    {
        System.out.println(nth(25));
        System.out.println(nth(1));
        System.out.println(nth(2));
        System.out.println(nth(3));
        System.out.println(nth(4));
        System.out.println(nth(5));
    }
}
