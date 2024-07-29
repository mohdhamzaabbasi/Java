public class power 
{
    public static int pow(int n,int x)
    {
        if(x==0)
        {
            return 1;
        }
        if(x%2==0)
        {
            return (pow(n,x/2)*pow(n,x/2));
        }
        else 
        {
            return (n*pow(n,x/2)*pow(n,x/2));
        }
    }    
    public static void main(String[]args)
    {
        System.out.println(pow(2,10));
        System.out.println(pow(3,10));
        System.out.println(pow(4,10));
    }
}
