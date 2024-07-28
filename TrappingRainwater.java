public class TrappingRainwater
{
    public static int water(int num[])
    {
        int sum=0;
        for(int i=1;i<num.length-1;i++)
        {
            int ls=0;
            int rs=0;
            for(int j=i-1;j>=0;j--)
            {
                if(num[j]>ls)
                {
                    ls=num[j];
                }
            }
            for(int j=i+1;j<num.length;j++)
            {
                if(num[j]>rs)
                {
                    rs=num[j];
                }
            }
            int curr=(ls<rs?ls:rs)-num[i];
            if(curr>0)
            {
                sum+=curr;
            }
            System.out.println(i+"\t"+curr);
        }
        return sum;
    }    
    public static void main(String[]args)
    {
        int num[]={4,2,0,6,3,2,5};
        System.out.println(water(num));
    }
}
