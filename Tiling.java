public class Tiling 
{
    public static int tile(int n)
    {
        if(n<2)
        {
            return 1;
        }
        return (tile(n-1)+tile(n-2));
    }    
    public static void main(String[]args)
    {
        System.out.println(tile(0));
        System.out.println(tile(1));
        System.out.println(tile(2));
        System.out.println(tile(3));
        System.out.println(tile(4));
        System.out.println(tile(5));
        System.out.println(tile(6));
    }
}
