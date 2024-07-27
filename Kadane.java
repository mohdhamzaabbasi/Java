public class Kadane
{
    public static int max(int num[])
    {
        int ms=Integer.MIN_VALUE;
        int cs=0;
        int hs=ms;
        for(int i=0;i<num.length;i++)
        {
            cs=cs+num[i];
            if(cs<0)
            {
                cs=0;
            }
            if(ms<cs)
            {
                ms=cs;
            }
            if(num[i]>hs)
            {
                hs=num[i];
            }
        }
        if(hs<=0)
        {
            return hs;
        }
        return ms;
    }
    public static void main(String[]args)
    {
        int num[]={-2,-3,-4,-1,-2,-1,-5,-3};
        System.out.println(max(num));
    }    
}
