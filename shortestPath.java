public class shortestPath 
{
    public static double sp(String str)
    {
        int x=0;int y=0;
        while(str.length()!=0)
        {
            char ch=str.charAt(0);
            if(ch=='n' || ch=='N')
            {
                y++;
            }
            else if(ch=='e' || ch=='E')
            {
                x++;
            }
            else if(ch=='w' || ch=='W')
            {
                x--;
            }
            else if(ch=='s' || ch=='S')
            {
                y--;
            }
            str=str.substring(1);
        }
        x=x*x;
        y=y*y;
        int sum=x+y;
        double res=Math.sqrt(sum);
        return res;
    }
    public static void main(String[]args)
    {
        System.out.println(sp("Wneenesennn"));
        System.out.println(sp("ns"));
    }    
}
