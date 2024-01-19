import java.util.*;
public class Java_9 
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String args[])
    {
        int x=0;
        int y=0;
        String path=sc.next();
        int n=path.length();
        for(int i=0;i<n;i++)
        {
            char ch=path.charAt(i);
            if(ch=='N'||ch=='n')
            {
                y++;
            }
            else if(ch=='S'||ch=='s')
            {
                y--;
            }
            else if(ch=='W'||ch=='w')
            {
                x--;
            }
            else if(ch=='E'||ch=='e')
            {
                x++;
            }
        }
        System.out.println("Shortest Path = "+Math.sqrt((x*x)+(y*y)));
    }
}
