public class Stock
{
    public static int profit(int num[])
    {
        int max=0;
        int bp=num[0];
        for(int i=1;i<num.length;i++)
        {
            if(num[i-1]<bp)
            {
                bp=num[i-1];
            }
            int pro=num[i]-bp;
            if(pro>max)
            {
                max=pro;
            }
        }
        return max;
    }    
    public static void main(String[]args)
    {
        int num[]={4,2,0,6,3,2,5};
        System.out.println(profit(num));
        int num2[]={7,6,5,3,2,1};
        System.out.println(profit(num2));
    }
}
