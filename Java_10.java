import java.util.*;
public class Java_10
{
    static Scanner sc=new Scanner(System.in);
    public static void main(String args[])
    {
        String path=sc.next();
        int n=path.length();
        StringBuilder sb=new StringBuilder("");
        sb.append(path.charAt(0));
        int c=1;
        for(int i=1;i<n;i++)
        {
            if(path.charAt(i)==path.charAt(i-1))
            {
                c++;
                continue;
            }
            if(c!=1)
            {
                sb.append(""+c);
                c=1;
            }
            sb.append(path.charAt(i));
        }
        if(c!=1)
        {
            sb.append(""+c);
            c=1;
        }
        System.out.println(sb);
    }
}
